// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/watcher/v1/watch.proto

package com.google.watcher.v1;

/**
 * <pre>
 * The message used by the client to register interest in an entity.
 * </pre>
 *
 * Protobuf type {@code google.watcher.v1.Request}
 */
public  final class Request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.watcher.v1.Request)
    RequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Request.newBuilder() to construct.
  private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Request() {
    target_ = "";
    resumeMarker_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Request(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            target_ = s;
            break;
          }
          case 18: {

            resumeMarker_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.watcher.v1.WatchProto.internal_static_google_watcher_v1_Request_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.watcher.v1.WatchProto.internal_static_google_watcher_v1_Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.watcher.v1.Request.class, com.google.watcher.v1.Request.Builder.class);
  }

  public static final int TARGET_FIELD_NUMBER = 1;
  private volatile java.lang.Object target_;
  /**
   * <pre>
   * The `target` value **must** be a valid URL path pointing to an entity
   * to watch. Note that the service name **must** be
   * removed from the target field (e.g., the target field must say
   * "/foo/bar", not "myservice.googleapis.com/foo/bar"). A client is
   * also allowed to pass system-specific parameters in the URL that
   * are only obeyed by some implementations. Some parameters will be
   * implementation-specific. However, some have predefined meaning
   * and are listed here:
   *  * recursive = true|false [default=false]
   *    If set to true, indicates that the client wants to watch all elements
   *    of entities in the subtree rooted at the entity's name in `target`. For
   *    descendants that are not the immediate children of the target, the
   *    `Change.element` will contain slashes.
   *    Note that some namespaces and entities will not support recursive
   *    watching. When watching such an entity, a client must not set recursive
   *    to true. Otherwise, it will receive an `UNIMPLEMENTED` error.
   * Normal URL encoding must be used inside `target`.  For example, if a query
   * parameter name or value, or the non-query parameter portion of `target`
   * contains a special character, it must be %-encoded.  We recommend that
   * clients and servers use their runtime's URL library to produce and consume
   * target values.
   * </pre>
   *
   * <code>string target = 1;</code>
   */
  public java.lang.String getTarget() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      target_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The `target` value **must** be a valid URL path pointing to an entity
   * to watch. Note that the service name **must** be
   * removed from the target field (e.g., the target field must say
   * "/foo/bar", not "myservice.googleapis.com/foo/bar"). A client is
   * also allowed to pass system-specific parameters in the URL that
   * are only obeyed by some implementations. Some parameters will be
   * implementation-specific. However, some have predefined meaning
   * and are listed here:
   *  * recursive = true|false [default=false]
   *    If set to true, indicates that the client wants to watch all elements
   *    of entities in the subtree rooted at the entity's name in `target`. For
   *    descendants that are not the immediate children of the target, the
   *    `Change.element` will contain slashes.
   *    Note that some namespaces and entities will not support recursive
   *    watching. When watching such an entity, a client must not set recursive
   *    to true. Otherwise, it will receive an `UNIMPLEMENTED` error.
   * Normal URL encoding must be used inside `target`.  For example, if a query
   * parameter name or value, or the non-query parameter portion of `target`
   * contains a special character, it must be %-encoded.  We recommend that
   * clients and servers use their runtime's URL library to produce and consume
   * target values.
   * </pre>
   *
   * <code>string target = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTargetBytes() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      target_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESUME_MARKER_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString resumeMarker_;
  /**
   * <pre>
   * The `resume_marker` specifies how much of the existing underlying state is
   * delivered to the client when the watch request is received by the
   * system. The client can set this marker in one of the following ways to get
   * different semantics:
   * *   Parameter is not specified or has the value "".
   *     Semantics: Fetch initial state.
   *     The client wants the entity's initial state to be delivered. See the
   *     description in "Initial State".
   * *   Parameter is set to the string "now" (UTF-8 encoding).
   *     Semantics: Fetch new changes only.
   *     The client just wants to get the changes received by the system after
   *     the watch point. The system may deliver changes from before the watch
   *     point as well.
   * *   Parameter is set to a value received in an earlier
   *     `Change.resume_marker` field while watching the same entity.
   *     Semantics: Resume from a specific point.
   *     The client wants to receive the changes from a specific point; this
   *     value must correspond to a value received in the `Change.resume_marker`
   *     field. The system may deliver changes from before the `resume_marker`
   *     as well. If the system cannot resume the stream from this point (e.g.,
   *     if it is too far behind in the stream), it can raise the
   *     `FAILED_PRECONDITION` error.
   * An implementation MUST support an unspecified parameter and the
   * empty string "" marker (initial state fetching) and the "now" marker.
   * It need not support resuming from a specific point.
   * </pre>
   *
   * <code>bytes resume_marker = 2;</code>
   */
  public com.google.protobuf.ByteString getResumeMarker() {
    return resumeMarker_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTargetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, target_);
    }
    if (!resumeMarker_.isEmpty()) {
      output.writeBytes(2, resumeMarker_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTargetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, target_);
    }
    if (!resumeMarker_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, resumeMarker_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.watcher.v1.Request)) {
      return super.equals(obj);
    }
    com.google.watcher.v1.Request other = (com.google.watcher.v1.Request) obj;

    boolean result = true;
    result = result && getTarget()
        .equals(other.getTarget());
    result = result && getResumeMarker()
        .equals(other.getResumeMarker());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget().hashCode();
    hash = (37 * hash) + RESUME_MARKER_FIELD_NUMBER;
    hash = (53 * hash) + getResumeMarker().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.watcher.v1.Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.watcher.v1.Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.watcher.v1.Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.watcher.v1.Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.watcher.v1.Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.watcher.v1.Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.watcher.v1.Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.watcher.v1.Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.watcher.v1.Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.watcher.v1.Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.watcher.v1.Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.watcher.v1.Request parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.watcher.v1.Request prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The message used by the client to register interest in an entity.
   * </pre>
   *
   * Protobuf type {@code google.watcher.v1.Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.watcher.v1.Request)
      com.google.watcher.v1.RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.watcher.v1.WatchProto.internal_static_google_watcher_v1_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.watcher.v1.WatchProto.internal_static_google_watcher_v1_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.watcher.v1.Request.class, com.google.watcher.v1.Request.Builder.class);
    }

    // Construct using com.google.watcher.v1.Request.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      target_ = "";

      resumeMarker_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.watcher.v1.WatchProto.internal_static_google_watcher_v1_Request_descriptor;
    }

    @java.lang.Override
    public com.google.watcher.v1.Request getDefaultInstanceForType() {
      return com.google.watcher.v1.Request.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.watcher.v1.Request build() {
      com.google.watcher.v1.Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.watcher.v1.Request buildPartial() {
      com.google.watcher.v1.Request result = new com.google.watcher.v1.Request(this);
      result.target_ = target_;
      result.resumeMarker_ = resumeMarker_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.watcher.v1.Request) {
        return mergeFrom((com.google.watcher.v1.Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.watcher.v1.Request other) {
      if (other == com.google.watcher.v1.Request.getDefaultInstance()) return this;
      if (!other.getTarget().isEmpty()) {
        target_ = other.target_;
        onChanged();
      }
      if (other.getResumeMarker() != com.google.protobuf.ByteString.EMPTY) {
        setResumeMarker(other.getResumeMarker());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.watcher.v1.Request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.watcher.v1.Request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object target_ = "";
    /**
     * <pre>
     * The `target` value **must** be a valid URL path pointing to an entity
     * to watch. Note that the service name **must** be
     * removed from the target field (e.g., the target field must say
     * "/foo/bar", not "myservice.googleapis.com/foo/bar"). A client is
     * also allowed to pass system-specific parameters in the URL that
     * are only obeyed by some implementations. Some parameters will be
     * implementation-specific. However, some have predefined meaning
     * and are listed here:
     *  * recursive = true|false [default=false]
     *    If set to true, indicates that the client wants to watch all elements
     *    of entities in the subtree rooted at the entity's name in `target`. For
     *    descendants that are not the immediate children of the target, the
     *    `Change.element` will contain slashes.
     *    Note that some namespaces and entities will not support recursive
     *    watching. When watching such an entity, a client must not set recursive
     *    to true. Otherwise, it will receive an `UNIMPLEMENTED` error.
     * Normal URL encoding must be used inside `target`.  For example, if a query
     * parameter name or value, or the non-query parameter portion of `target`
     * contains a special character, it must be %-encoded.  We recommend that
     * clients and servers use their runtime's URL library to produce and consume
     * target values.
     * </pre>
     *
     * <code>string target = 1;</code>
     */
    public java.lang.String getTarget() {
      java.lang.Object ref = target_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        target_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The `target` value **must** be a valid URL path pointing to an entity
     * to watch. Note that the service name **must** be
     * removed from the target field (e.g., the target field must say
     * "/foo/bar", not "myservice.googleapis.com/foo/bar"). A client is
     * also allowed to pass system-specific parameters in the URL that
     * are only obeyed by some implementations. Some parameters will be
     * implementation-specific. However, some have predefined meaning
     * and are listed here:
     *  * recursive = true|false [default=false]
     *    If set to true, indicates that the client wants to watch all elements
     *    of entities in the subtree rooted at the entity's name in `target`. For
     *    descendants that are not the immediate children of the target, the
     *    `Change.element` will contain slashes.
     *    Note that some namespaces and entities will not support recursive
     *    watching. When watching such an entity, a client must not set recursive
     *    to true. Otherwise, it will receive an `UNIMPLEMENTED` error.
     * Normal URL encoding must be used inside `target`.  For example, if a query
     * parameter name or value, or the non-query parameter portion of `target`
     * contains a special character, it must be %-encoded.  We recommend that
     * clients and servers use their runtime's URL library to produce and consume
     * target values.
     * </pre>
     *
     * <code>string target = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      java.lang.Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The `target` value **must** be a valid URL path pointing to an entity
     * to watch. Note that the service name **must** be
     * removed from the target field (e.g., the target field must say
     * "/foo/bar", not "myservice.googleapis.com/foo/bar"). A client is
     * also allowed to pass system-specific parameters in the URL that
     * are only obeyed by some implementations. Some parameters will be
     * implementation-specific. However, some have predefined meaning
     * and are listed here:
     *  * recursive = true|false [default=false]
     *    If set to true, indicates that the client wants to watch all elements
     *    of entities in the subtree rooted at the entity's name in `target`. For
     *    descendants that are not the immediate children of the target, the
     *    `Change.element` will contain slashes.
     *    Note that some namespaces and entities will not support recursive
     *    watching. When watching such an entity, a client must not set recursive
     *    to true. Otherwise, it will receive an `UNIMPLEMENTED` error.
     * Normal URL encoding must be used inside `target`.  For example, if a query
     * parameter name or value, or the non-query parameter portion of `target`
     * contains a special character, it must be %-encoded.  We recommend that
     * clients and servers use their runtime's URL library to produce and consume
     * target values.
     * </pre>
     *
     * <code>string target = 1;</code>
     */
    public Builder setTarget(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `target` value **must** be a valid URL path pointing to an entity
     * to watch. Note that the service name **must** be
     * removed from the target field (e.g., the target field must say
     * "/foo/bar", not "myservice.googleapis.com/foo/bar"). A client is
     * also allowed to pass system-specific parameters in the URL that
     * are only obeyed by some implementations. Some parameters will be
     * implementation-specific. However, some have predefined meaning
     * and are listed here:
     *  * recursive = true|false [default=false]
     *    If set to true, indicates that the client wants to watch all elements
     *    of entities in the subtree rooted at the entity's name in `target`. For
     *    descendants that are not the immediate children of the target, the
     *    `Change.element` will contain slashes.
     *    Note that some namespaces and entities will not support recursive
     *    watching. When watching such an entity, a client must not set recursive
     *    to true. Otherwise, it will receive an `UNIMPLEMENTED` error.
     * Normal URL encoding must be used inside `target`.  For example, if a query
     * parameter name or value, or the non-query parameter portion of `target`
     * contains a special character, it must be %-encoded.  We recommend that
     * clients and servers use their runtime's URL library to produce and consume
     * target values.
     * </pre>
     *
     * <code>string target = 1;</code>
     */
    public Builder clearTarget() {
      
      target_ = getDefaultInstance().getTarget();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `target` value **must** be a valid URL path pointing to an entity
     * to watch. Note that the service name **must** be
     * removed from the target field (e.g., the target field must say
     * "/foo/bar", not "myservice.googleapis.com/foo/bar"). A client is
     * also allowed to pass system-specific parameters in the URL that
     * are only obeyed by some implementations. Some parameters will be
     * implementation-specific. However, some have predefined meaning
     * and are listed here:
     *  * recursive = true|false [default=false]
     *    If set to true, indicates that the client wants to watch all elements
     *    of entities in the subtree rooted at the entity's name in `target`. For
     *    descendants that are not the immediate children of the target, the
     *    `Change.element` will contain slashes.
     *    Note that some namespaces and entities will not support recursive
     *    watching. When watching such an entity, a client must not set recursive
     *    to true. Otherwise, it will receive an `UNIMPLEMENTED` error.
     * Normal URL encoding must be used inside `target`.  For example, if a query
     * parameter name or value, or the non-query parameter portion of `target`
     * contains a special character, it must be %-encoded.  We recommend that
     * clients and servers use their runtime's URL library to produce and consume
     * target values.
     * </pre>
     *
     * <code>string target = 1;</code>
     */
    public Builder setTargetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      target_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString resumeMarker_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The `resume_marker` specifies how much of the existing underlying state is
     * delivered to the client when the watch request is received by the
     * system. The client can set this marker in one of the following ways to get
     * different semantics:
     * *   Parameter is not specified or has the value "".
     *     Semantics: Fetch initial state.
     *     The client wants the entity's initial state to be delivered. See the
     *     description in "Initial State".
     * *   Parameter is set to the string "now" (UTF-8 encoding).
     *     Semantics: Fetch new changes only.
     *     The client just wants to get the changes received by the system after
     *     the watch point. The system may deliver changes from before the watch
     *     point as well.
     * *   Parameter is set to a value received in an earlier
     *     `Change.resume_marker` field while watching the same entity.
     *     Semantics: Resume from a specific point.
     *     The client wants to receive the changes from a specific point; this
     *     value must correspond to a value received in the `Change.resume_marker`
     *     field. The system may deliver changes from before the `resume_marker`
     *     as well. If the system cannot resume the stream from this point (e.g.,
     *     if it is too far behind in the stream), it can raise the
     *     `FAILED_PRECONDITION` error.
     * An implementation MUST support an unspecified parameter and the
     * empty string "" marker (initial state fetching) and the "now" marker.
     * It need not support resuming from a specific point.
     * </pre>
     *
     * <code>bytes resume_marker = 2;</code>
     */
    public com.google.protobuf.ByteString getResumeMarker() {
      return resumeMarker_;
    }
    /**
     * <pre>
     * The `resume_marker` specifies how much of the existing underlying state is
     * delivered to the client when the watch request is received by the
     * system. The client can set this marker in one of the following ways to get
     * different semantics:
     * *   Parameter is not specified or has the value "".
     *     Semantics: Fetch initial state.
     *     The client wants the entity's initial state to be delivered. See the
     *     description in "Initial State".
     * *   Parameter is set to the string "now" (UTF-8 encoding).
     *     Semantics: Fetch new changes only.
     *     The client just wants to get the changes received by the system after
     *     the watch point. The system may deliver changes from before the watch
     *     point as well.
     * *   Parameter is set to a value received in an earlier
     *     `Change.resume_marker` field while watching the same entity.
     *     Semantics: Resume from a specific point.
     *     The client wants to receive the changes from a specific point; this
     *     value must correspond to a value received in the `Change.resume_marker`
     *     field. The system may deliver changes from before the `resume_marker`
     *     as well. If the system cannot resume the stream from this point (e.g.,
     *     if it is too far behind in the stream), it can raise the
     *     `FAILED_PRECONDITION` error.
     * An implementation MUST support an unspecified parameter and the
     * empty string "" marker (initial state fetching) and the "now" marker.
     * It need not support resuming from a specific point.
     * </pre>
     *
     * <code>bytes resume_marker = 2;</code>
     */
    public Builder setResumeMarker(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resumeMarker_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `resume_marker` specifies how much of the existing underlying state is
     * delivered to the client when the watch request is received by the
     * system. The client can set this marker in one of the following ways to get
     * different semantics:
     * *   Parameter is not specified or has the value "".
     *     Semantics: Fetch initial state.
     *     The client wants the entity's initial state to be delivered. See the
     *     description in "Initial State".
     * *   Parameter is set to the string "now" (UTF-8 encoding).
     *     Semantics: Fetch new changes only.
     *     The client just wants to get the changes received by the system after
     *     the watch point. The system may deliver changes from before the watch
     *     point as well.
     * *   Parameter is set to a value received in an earlier
     *     `Change.resume_marker` field while watching the same entity.
     *     Semantics: Resume from a specific point.
     *     The client wants to receive the changes from a specific point; this
     *     value must correspond to a value received in the `Change.resume_marker`
     *     field. The system may deliver changes from before the `resume_marker`
     *     as well. If the system cannot resume the stream from this point (e.g.,
     *     if it is too far behind in the stream), it can raise the
     *     `FAILED_PRECONDITION` error.
     * An implementation MUST support an unspecified parameter and the
     * empty string "" marker (initial state fetching) and the "now" marker.
     * It need not support resuming from a specific point.
     * </pre>
     *
     * <code>bytes resume_marker = 2;</code>
     */
    public Builder clearResumeMarker() {
      
      resumeMarker_ = getDefaultInstance().getResumeMarker();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.watcher.v1.Request)
  }

  // @@protoc_insertion_point(class_scope:google.watcher.v1.Request)
  private static final com.google.watcher.v1.Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.watcher.v1.Request();
  }

  public static com.google.watcher.v1.Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request>
      PARSER = new com.google.protobuf.AbstractParser<Request>() {
    @java.lang.Override
    public Request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Request> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.watcher.v1.Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

