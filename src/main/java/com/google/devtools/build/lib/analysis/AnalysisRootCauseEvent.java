// Copyright 2017 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.lib.analysis;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.devtools.build.lib.analysis.config.BuildConfiguration;
import com.google.devtools.build.lib.buildeventstream.BuildEvent;
import com.google.devtools.build.lib.buildeventstream.BuildEventContext;
import com.google.devtools.build.lib.buildeventstream.BuildEventId;
import com.google.devtools.build.lib.buildeventstream.BuildEventStreamProtos;
import com.google.devtools.build.lib.buildeventstream.BuildEventWithConfiguration;
import com.google.devtools.build.lib.buildeventstream.GenericBuildEvent;
import com.google.devtools.build.lib.cmdline.Label;
import java.util.Collection;

/**
 * Error message of an analysis root cause. This is separate from {@link AnalysisFailureEvent} to
 * avoid duplicating error messages in the stream if multiple targets fail due to the same root
 * cause. It also allows UIs to collate errors by root cause.
 */
public class AnalysisRootCauseEvent implements BuildEventWithConfiguration {
  private final BuildConfiguration configuration;
  private final Label label;
  private final String errorMessage;

  public AnalysisRootCauseEvent(
      BuildConfiguration configuration, Label label, String errorMessage) {
    this.configuration = configuration;
    this.label = label;
    this.errorMessage = errorMessage;
  }

  @VisibleForTesting
  public Label getLabel() {
    return label;
  }

  @Override
  public BuildEventId getEventId() {
    // This needs to match AnalysisFailedCause.
    if (configuration == null) {
      return BuildEventId.unconfiguredLabelId(label);
    }
    return BuildEventId.configuredLabelId(label, configuration.getEventId());
  }

  @Override
  public Collection<BuildEventId> getChildrenEvents() {
    return ImmutableList.<BuildEventId>of();
  }

  @Override
  public BuildEventStreamProtos.BuildEvent asStreamProto(BuildEventContext converters) {
    return GenericBuildEvent.protoChaining(this)
        .setAborted(
            BuildEventStreamProtos.Aborted.newBuilder()
                .setReason(BuildEventStreamProtos.Aborted.AbortReason.ANALYSIS_FAILURE)
                .setDescription(errorMessage)
                .build())
        .build();
  }

  @Override
  public Collection<BuildEvent> getConfigurations() {
    return ImmutableList.<BuildEvent>of(configuration.toBuildEvent());
  }
}
