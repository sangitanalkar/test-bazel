// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

public interface BatchReadBlobsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.BatchReadBlobsRequest)
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
   * The individual blob digests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
   */
  java.util.List<build.bazel.remote.execution.v2.Digest> 
      getDigestsList();
  /**
   * <pre>
   * The individual blob digests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
   */
  build.bazel.remote.execution.v2.Digest getDigests(int index);
  /**
   * <pre>
   * The individual blob digests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
   */
  int getDigestsCount();
  /**
   * <pre>
   * The individual blob digests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
   */
  java.util.List<? extends build.bazel.remote.execution.v2.DigestOrBuilder> 
      getDigestsOrBuilderList();
  /**
   * <pre>
   * The individual blob digests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
   */
  build.bazel.remote.execution.v2.DigestOrBuilder getDigestsOrBuilder(
      int index);
}
