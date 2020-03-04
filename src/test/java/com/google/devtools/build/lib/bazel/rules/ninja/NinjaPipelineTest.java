// Copyright 2019 The Bazel Authors. All rights reserved.
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
//

package com.google.devtools.build.lib.bazel.rules.ninja;

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.fail;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.devtools.build.lib.bazel.rules.ninja.parser.NinjaTarget;
import com.google.devtools.build.lib.bazel.rules.ninja.pipeline.NinjaPipeline;
import com.google.devtools.build.lib.concurrent.ExecutorUtil;
import com.google.devtools.build.lib.vfs.DigestHashFunction;
import com.google.devtools.build.lib.vfs.DigestHashFunction.DefaultHashFunctionNotSetException;
import com.google.devtools.build.lib.vfs.FileSystemUtils;
import com.google.devtools.build.lib.vfs.JavaIoFileSystem;
import com.google.devtools.build.lib.vfs.Path;
import com.google.devtools.build.lib.vfs.PathFragment;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.Executors;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for {@link com.google.devtools.build.lib.bazel.rules.ninja.pipeline.NinjaPipeline}. */
@RunWith(JUnit4.class)
public class NinjaPipelineTest {
  private static class Tester {
    private final Path dir;
    private final ListeningExecutorService service;

    Tester() throws IOException, DefaultHashFunctionNotSetException {
      service =
          MoreExecutors.listeningDecorator(
              Executors.newFixedThreadPool(
                  25,
                  new ThreadFactoryBuilder()
                      .setNameFormat(NinjaPipelineTest.class.getSimpleName() + "-%d")
                      .build()));
      java.nio.file.Path tmpDir = Files.createTempDirectory("test");
      dir = new JavaIoFileSystem().getPath(tmpDir.toString());
    }

    ListeningExecutorService getService() {
      return service;
    }

    Path writeTmpFile(String name, String... lines) throws IOException {
      Path path = dir.getRelative(name);
      if (lines.length > 0) {
        FileSystemUtils.writeContent(
            path, String.join("\n", lines).getBytes(StandardCharsets.ISO_8859_1));
      } else {
        FileSystemUtils.createEmptyFile(path);
      }
      return path;
    }

    public void tearDown() throws IOException {
      ExecutorUtil.interruptibleShutdown(service);
      dir.deleteTree();
    }
  }

  private Tester tester;

  @Before
  public void setUp() throws Exception {
    try {
      DigestHashFunction.setDefault(DigestHashFunction.SHA256);
    } catch (DigestHashFunction.DefaultAlreadySetException e) {
      // Do nothing.
    }
    tester = new Tester();
  }

  @After
  public void tearDown() throws Exception {
    tester.tearDown();
  }

  @Test
  public void testOneFilePipeline() throws Exception {
    Path vfsPath =
        tester.writeTmpFile(
            "test.ninja",
            "rule r1",
            "  command = c $in $out",
            "build t1: r1 in1 in2",
            "build t2: r1 in3");
    NinjaPipeline pipeline = new NinjaPipeline(vfsPath.getParentDirectory(), tester.getService());
    List<NinjaTarget> targets = pipeline.pipeline(vfsPath).getSecond();
    checkTargets(targets);
  }

  @Test
  public void testWithIncluded() throws Exception {
    Path vfsPath =
        tester.writeTmpFile(
            "test.ninja", "rule r1", "  command = c $in $out", "include child.ninja");
    tester.writeTmpFile("child.ninja", "build t1: r1 in1 in2", "build t2: r1 in3");
    NinjaPipeline pipeline = new NinjaPipeline(vfsPath.getParentDirectory(), tester.getService());
    List<NinjaTarget> targets = pipeline.pipeline(vfsPath).getSecond();
    checkTargets(targets);
  }

  @Test
  public void testComputedSubNinja() throws Exception {
    Path vfsPath =
        tester.writeTmpFile(
            "test.ninja",
            "subfile=child",
            "rule r1",
            "  command = c $in $out",
            "include ${subfile}.ninja");
    tester.writeTmpFile("child.ninja", "build t1: r1 in1 in2", "build t2: r1 in3");
    NinjaPipeline pipeline = new NinjaPipeline(vfsPath.getParentDirectory(), tester.getService());
    List<NinjaTarget> targets = pipeline.pipeline(vfsPath).getSecond();
    checkTargets(targets);
  }

  @Test
  public void testComputedDeeplyIncluded() throws Exception {
    Path vfsPath =
        tester.writeTmpFile(
            "test.ninja",
            "subfile=child",
            "subninja_file=sub",
            "rule r1",
            "  command = c $in $out",
            "include ${subfile}.ninja",
            "build t1: r1 ${top_scope_var} in2");
    tester.writeTmpFile(
        "child.ninja", "top_scope_var=in1", "var_for_sub=in3", "subninja ${subninja_file}.ninja");
    tester.writeTmpFile("sub.ninja", "build t2: r1 ${var_for_sub}");
    NinjaPipeline pipeline = new NinjaPipeline(vfsPath.getParentDirectory(), tester.getService());
    List<NinjaTarget> targets = pipeline.pipeline(vfsPath).getSecond();
    checkTargets(targets);
  }

  @Test
  public void testEmptyFile() throws Exception {
    Path vfsPath = tester.writeTmpFile("test.ninja");
    NinjaPipeline pipeline = new NinjaPipeline(vfsPath.getParentDirectory(), tester.getService());
    List<NinjaTarget> targets = pipeline.pipeline(vfsPath).getSecond();
    assertThat(targets).isEmpty();
  }

  private static void checkTargets(List<NinjaTarget> targets) {
    assertThat(targets).hasSize(2);
    for (NinjaTarget target : targets) {
      if (target.getAllOutputs().contains(PathFragment.create("t1"))) {
        assertThat(target.getAllInputs())
            .containsExactly(PathFragment.create("in1"), PathFragment.create("in2"));
      } else if (target.getAllOutputs().contains(PathFragment.create("t2"))) {
        assertThat(target.getAllInputs()).containsExactly(PathFragment.create("in3"));
      } else {
        fail();
      }
    }
  }
}
