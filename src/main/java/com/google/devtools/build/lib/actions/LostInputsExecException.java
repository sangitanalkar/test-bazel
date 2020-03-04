// Copyright 2018 The Bazel Authors. All rights reserved.
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

package com.google.devtools.build.lib.actions;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;

/**
 * An {@link ExecException} thrown when an action fails to execute because one or more of its inputs
 * was lost. In some cases, Bazel may know how to fix this on its own.
 */
public class LostInputsExecException extends ExecException {

  /** Maps lost input digests to their ActionInputs. */
  private final ImmutableMap<String, ActionInput> lostInputs;

  private final ActionInputDepOwners owners;

  public LostInputsExecException(
      ImmutableMap<String, ActionInput> lostInputs, ActionInputDepOwners owners) {
    super("lost inputs with digests: " + Joiner.on(",").join(lostInputs.keySet()));
    this.lostInputs = lostInputs;
    this.owners = owners;
  }

  @VisibleForTesting
  public ImmutableMap<String, ActionInput> getLostInputs() {
    return lostInputs;
  }

  @VisibleForTesting
  public ActionInputDepOwners getOwners() {
    return owners;
  }

  @Override
  public ActionExecutionException toActionExecutionException(
      String messagePrefix, boolean verboseFailures, Action action) {
    String message = messagePrefix + " failed";
    return new LostInputsActionExecutionException(
        message + ": " + getMessage(), lostInputs, owners, action, /*cause=*/ this);
  }
}
