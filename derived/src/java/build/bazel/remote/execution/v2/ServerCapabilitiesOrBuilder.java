// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

public interface ServerCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.ServerCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Capabilities of the remote cache system.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.CacheCapabilities cache_capabilities = 1;</code>
   */
  boolean hasCacheCapabilities();
  /**
   * <pre>
   * Capabilities of the remote cache system.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.CacheCapabilities cache_capabilities = 1;</code>
   */
  build.bazel.remote.execution.v2.CacheCapabilities getCacheCapabilities();
  /**
   * <pre>
   * Capabilities of the remote cache system.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.CacheCapabilities cache_capabilities = 1;</code>
   */
  build.bazel.remote.execution.v2.CacheCapabilitiesOrBuilder getCacheCapabilitiesOrBuilder();

  /**
   * <pre>
   * Capabilities of the remote execution system.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ExecutionCapabilities execution_capabilities = 2;</code>
   */
  boolean hasExecutionCapabilities();
  /**
   * <pre>
   * Capabilities of the remote execution system.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ExecutionCapabilities execution_capabilities = 2;</code>
   */
  build.bazel.remote.execution.v2.ExecutionCapabilities getExecutionCapabilities();
  /**
   * <pre>
   * Capabilities of the remote execution system.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ExecutionCapabilities execution_capabilities = 2;</code>
   */
  build.bazel.remote.execution.v2.ExecutionCapabilitiesOrBuilder getExecutionCapabilitiesOrBuilder();

  /**
   * <pre>
   * Earliest RE API version supported, including deprecated versions.
   * </pre>
   *
   * <code>.build.bazel.semver.SemVer deprecated_api_version = 3;</code>
   */
  boolean hasDeprecatedApiVersion();
  /**
   * <pre>
   * Earliest RE API version supported, including deprecated versions.
   * </pre>
   *
   * <code>.build.bazel.semver.SemVer deprecated_api_version = 3;</code>
   */
  build.bazel.semver.SemVer getDeprecatedApiVersion();
  /**
   * <pre>
   * Earliest RE API version supported, including deprecated versions.
   * </pre>
   *
   * <code>.build.bazel.semver.SemVer deprecated_api_version = 3;</code>
   */
  build.bazel.semver.SemVerOrBuilder getDeprecatedApiVersionOrBuilder();

  /**
   * <pre>
   * Earliest non-deprecated RE API version supported.
   * </pre>
   *
   * <code>.build.bazel.semver.SemVer low_api_version = 4;</code>
   */
  boolean hasLowApiVersion();
  /**
   * <pre>
   * Earliest non-deprecated RE API version supported.
   * </pre>
   *
   * <code>.build.bazel.semver.SemVer low_api_version = 4;</code>
   */
  build.bazel.semver.SemVer getLowApiVersion();
  /**
   * <pre>
   * Earliest non-deprecated RE API version supported.
   * </pre>
   *
   * <code>.build.bazel.semver.SemVer low_api_version = 4;</code>
   */
  build.bazel.semver.SemVerOrBuilder getLowApiVersionOrBuilder();

  /**
   * <pre>
   * Latest RE API version supported.
   * </pre>
   *
   * <code>.build.bazel.semver.SemVer high_api_version = 5;</code>
   */
  boolean hasHighApiVersion();
  /**
   * <pre>
   * Latest RE API version supported.
   * </pre>
   *
   * <code>.build.bazel.semver.SemVer high_api_version = 5;</code>
   */
  build.bazel.semver.SemVer getHighApiVersion();
  /**
   * <pre>
   * Latest RE API version supported.
   * </pre>
   *
   * <code>.build.bazel.semver.SemVer high_api_version = 5;</code>
   */
  build.bazel.semver.SemVerOrBuilder getHighApiVersionOrBuilder();
}