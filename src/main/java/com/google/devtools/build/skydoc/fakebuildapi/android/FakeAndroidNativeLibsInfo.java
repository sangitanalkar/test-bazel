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

package com.google.devtools.build.skydoc.fakebuildapi.android;

import com.google.devtools.build.lib.events.Location;
import com.google.devtools.build.lib.skylarkbuildapi.FileApi;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidNativeLibsInfoApi;
import com.google.devtools.build.lib.syntax.Depset;
import com.google.devtools.build.lib.syntax.EvalException;
import com.google.devtools.build.lib.syntax.Printer;

/**
 * Fake implementation of {@link AndroidNativeLibsInfoApi}.
 */
public class FakeAndroidNativeLibsInfo implements AndroidNativeLibsInfoApi<FileApi> {

  @Override
  public Depset /*<FileApi>*/ getNativeLibsForStarlark() {
    return null;
  }

  @Override
  public String toProto(Location loc) throws EvalException {
    return "";
  }

  @Override
  public String toJson(Location loc) throws EvalException {
    return "";
  }

  @Override
  public void repr(Printer printer) {}

  /**
   * Fake implementation of {@link AndroidNativeLibsInfoApiProvider}.
   */
  public static class FakeAndroidNativeLibsInfoProvider
      implements AndroidNativeLibsInfoApiProvider {

    @Override
    public AndroidNativeLibsInfoApi<?> createInfo(Depset nativeLibs) throws EvalException {
      return new FakeAndroidNativeLibsInfo();
    }

    @Override
    public void repr(Printer printer) {}
  }
}