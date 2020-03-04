// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

public interface GetActionResultRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.GetActionResultRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   */
  java.lang.String getInstanceName();
  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getInstanceNameBytes();

  /**
   * <pre>
   * The digest of the [Action][build.bazel.remote.execution.v2.Action]
   * whose result is requested.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
   */
  boolean hasActionDigest();
  /**
   * <pre>
   * The digest of the [Action][build.bazel.remote.execution.v2.Action]
   * whose result is requested.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
   */
  build.bazel.remote.execution.v2.Digest getActionDigest();
  /**
   * <pre>
   * The digest of the [Action][build.bazel.remote.execution.v2.Action]
   * whose result is requested.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
   */
  build.bazel.remote.execution.v2.DigestOrBuilder getActionDigestOrBuilder();

  /**
   * <pre>
   * A hint to the server to request inlining stdout in the
   * [ActionResult][build.bazel.remote.execution.v2.ActionResult] message.
   * </pre>
   *
   * <code>bool inline_stdout = 3;</code>
   */
  boolean getInlineStdout();

  /**
   * <pre>
   * A hint to the server to request inlining stderr in the
   * [ActionResult][build.bazel.remote.execution.v2.ActionResult] message.
   * </pre>
   *
   * <code>bool inline_stderr = 4;</code>
   */
  boolean getInlineStderr();

  /**
   * <pre>
   * A hint to the server to inline the contents of the listed output files.
   * Each path needs to exactly match one path in `output_files` in the
   * [Command][build.bazel.remote.execution.v2.Command] message.
   * </pre>
   *
   * <code>repeated string inline_output_files = 5;</code>
   */
  java.util.List<java.lang.String>
      getInlineOutputFilesList();
  /**
   * <pre>
   * A hint to the server to inline the contents of the listed output files.
   * Each path needs to exactly match one path in `output_files` in the
   * [Command][build.bazel.remote.execution.v2.Command] message.
   * </pre>
   *
   * <code>repeated string inline_output_files = 5;</code>
   */
  int getInlineOutputFilesCount();
  /**
   * <pre>
   * A hint to the server to inline the contents of the listed output files.
   * Each path needs to exactly match one path in `output_files` in the
   * [Command][build.bazel.remote.execution.v2.Command] message.
   * </pre>
   *
   * <code>repeated string inline_output_files = 5;</code>
   */
  java.lang.String getInlineOutputFiles(int index);
  /**
   * <pre>
   * A hint to the server to inline the contents of the listed output files.
   * Each path needs to exactly match one path in `output_files` in the
   * [Command][build.bazel.remote.execution.v2.Command] message.
   * </pre>
   *
   * <code>repeated string inline_output_files = 5;</code>
   */
  com.google.protobuf.ByteString
      getInlineOutputFilesBytes(int index);
}