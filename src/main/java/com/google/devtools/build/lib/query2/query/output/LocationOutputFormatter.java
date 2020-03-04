// Copyright 2014 The Bazel Authors. All rights reserved.
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

package com.google.devtools.build.lib.query2.query.output;

import com.google.common.collect.ImmutableList;
import com.google.devtools.build.lib.events.Location;
import com.google.devtools.build.lib.packages.Target;
import com.google.devtools.build.lib.query2.common.AbstractBlazeQueryEnvironment;
import com.google.devtools.build.lib.query2.engine.AggregatingQueryExpressionVisitor.ContainsFunctionQueryExpressionVisitor;
import com.google.devtools.build.lib.query2.engine.OutputFormatterCallback;
import com.google.devtools.build.lib.query2.engine.QueryEnvironment;
import com.google.devtools.build.lib.query2.engine.QueryException;
import com.google.devtools.build.lib.query2.engine.QueryExpression;
import com.google.devtools.build.lib.query2.engine.SynchronizedDelegatingOutputFormatterCallback;
import com.google.devtools.build.lib.query2.engine.ThreadSafeOutputFormatterCallback;
import java.io.IOException;
import java.io.OutputStream;

/**
 * An output formatter that prints the labels of the targets, preceded by
 * their locations and kinds, in topological order.  For output files, the
 * location of the generating rule is given; for input files, the location of
 * line 1 is given.
 */
class LocationOutputFormatter extends AbstractUnorderedFormatter {

  @Override
  public String getName() {
    return "location";
  }

  @Override
  public void verifyCompatible(QueryEnvironment<?> env, QueryExpression expr)
      throws QueryException {
    if (!(env instanceof AbstractBlazeQueryEnvironment)) {
      return;
    }

    ContainsFunctionQueryExpressionVisitor noteBuildFilesAndLoadLilesVisitor =
        new ContainsFunctionQueryExpressionVisitor(ImmutableList.of("loadfiles", "buildfiles"));

    if (expr.accept(noteBuildFilesAndLoadLilesVisitor)) {
      throw new QueryException(
          "Query expressions involving 'buildfiles' or 'loadfiles' cannot be used with "
          + "--output=location");
    }
  }

  @Override
  public OutputFormatterCallback<Target> createPostFactoStreamCallback(
      OutputStream out, final QueryOptions options) {
    return new TextOutputFormatterCallback<Target>(out) {

      @Override
      public void processOutput(Iterable<Target> partialResult) throws IOException {
        final String lineTerm = options.getLineTerminator();
        for (Target target : partialResult) {
          Location location = target.getLocation();
          writer
              .append(location.print())
              .append(": ")
              .append(target.getTargetKind())
              .append(" ")
              .append(target.getLabel().getDefaultCanonicalForm())
              .append(lineTerm);
        }
      }
    };
  }

  @Override
  public ThreadSafeOutputFormatterCallback<Target> createStreamCallback(
      OutputStream out, QueryOptions options, QueryEnvironment<?> env) {
    return new SynchronizedDelegatingOutputFormatterCallback<>(
        createPostFactoStreamCallback(out, options));
  }
}