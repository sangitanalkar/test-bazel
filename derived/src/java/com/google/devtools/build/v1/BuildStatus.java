// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/build/v1/build_status.proto

package com.google.devtools.build.v1;

/**
 * <pre>
 * Status used for both invocation attempt and overall build completion.
 * </pre>
 *
 * Protobuf type {@code google.devtools.build.v1.BuildStatus}
 */
public  final class BuildStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.build.v1.BuildStatus)
    BuildStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildStatus.newBuilder() to construct.
  private BuildStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildStatus() {
    result_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuildStatus(
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
          case 8: {
            int rawValue = input.readEnum();

            result_ = rawValue;
            break;
          }
          case 18: {
            com.google.protobuf.Any.Builder subBuilder = null;
            if (details_ != null) {
              subBuilder = details_.toBuilder();
            }
            details_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(details_);
              details_ = subBuilder.buildPartial();
            }

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
    return com.google.devtools.build.v1.BuildStatusProto.internal_static_google_devtools_build_v1_BuildStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.build.v1.BuildStatusProto.internal_static_google_devtools_build_v1_BuildStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.build.v1.BuildStatus.class, com.google.devtools.build.v1.BuildStatus.Builder.class);
  }

  /**
   * <pre>
   * The end result of the Build.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.build.v1.BuildStatus.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified or unknown.
     * </pre>
     *
     * <code>UNKNOWN_STATUS = 0;</code>
     */
    UNKNOWN_STATUS(0),
    /**
     * <pre>
     * Build was successful and tests (if requested) all pass.
     * </pre>
     *
     * <code>COMMAND_SUCCEEDED = 1;</code>
     */
    COMMAND_SUCCEEDED(1),
    /**
     * <pre>
     * Build error and/or test failure.
     * </pre>
     *
     * <code>COMMAND_FAILED = 2;</code>
     */
    COMMAND_FAILED(2),
    /**
     * <pre>
     * Unable to obtain a result due to input provided by the user.
     * </pre>
     *
     * <code>USER_ERROR = 3;</code>
     */
    USER_ERROR(3),
    /**
     * <pre>
     * Unable to obtain a result due to a failure within the build system.
     * </pre>
     *
     * <code>SYSTEM_ERROR = 4;</code>
     */
    SYSTEM_ERROR(4),
    /**
     * <pre>
     * Build required too many resources, such as build tool RAM.
     * </pre>
     *
     * <code>RESOURCE_EXHAUSTED = 5;</code>
     */
    RESOURCE_EXHAUSTED(5),
    /**
     * <pre>
     * An invocation attempt time exceeded its deadline.
     * </pre>
     *
     * <code>INVOCATION_DEADLINE_EXCEEDED = 6;</code>
     */
    INVOCATION_DEADLINE_EXCEEDED(6),
    /**
     * <pre>
     * Build request time exceeded the request_deadline
     * </pre>
     *
     * <code>REQUEST_DEADLINE_EXCEEDED = 8;</code>
     */
    REQUEST_DEADLINE_EXCEEDED(8),
    /**
     * <pre>
     * The build was cancelled by a call to CancelBuild.
     * </pre>
     *
     * <code>CANCELLED = 7;</code>
     */
    CANCELLED(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified or unknown.
     * </pre>
     *
     * <code>UNKNOWN_STATUS = 0;</code>
     */
    public static final int UNKNOWN_STATUS_VALUE = 0;
    /**
     * <pre>
     * Build was successful and tests (if requested) all pass.
     * </pre>
     *
     * <code>COMMAND_SUCCEEDED = 1;</code>
     */
    public static final int COMMAND_SUCCEEDED_VALUE = 1;
    /**
     * <pre>
     * Build error and/or test failure.
     * </pre>
     *
     * <code>COMMAND_FAILED = 2;</code>
     */
    public static final int COMMAND_FAILED_VALUE = 2;
    /**
     * <pre>
     * Unable to obtain a result due to input provided by the user.
     * </pre>
     *
     * <code>USER_ERROR = 3;</code>
     */
    public static final int USER_ERROR_VALUE = 3;
    /**
     * <pre>
     * Unable to obtain a result due to a failure within the build system.
     * </pre>
     *
     * <code>SYSTEM_ERROR = 4;</code>
     */
    public static final int SYSTEM_ERROR_VALUE = 4;
    /**
     * <pre>
     * Build required too many resources, such as build tool RAM.
     * </pre>
     *
     * <code>RESOURCE_EXHAUSTED = 5;</code>
     */
    public static final int RESOURCE_EXHAUSTED_VALUE = 5;
    /**
     * <pre>
     * An invocation attempt time exceeded its deadline.
     * </pre>
     *
     * <code>INVOCATION_DEADLINE_EXCEEDED = 6;</code>
     */
    public static final int INVOCATION_DEADLINE_EXCEEDED_VALUE = 6;
    /**
     * <pre>
     * Build request time exceeded the request_deadline
     * </pre>
     *
     * <code>REQUEST_DEADLINE_EXCEEDED = 8;</code>
     */
    public static final int REQUEST_DEADLINE_EXCEEDED_VALUE = 8;
    /**
     * <pre>
     * The build was cancelled by a call to CancelBuild.
     * </pre>
     *
     * <code>CANCELLED = 7;</code>
     */
    public static final int CANCELLED_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_STATUS;
        case 1: return COMMAND_SUCCEEDED;
        case 2: return COMMAND_FAILED;
        case 3: return USER_ERROR;
        case 4: return SYSTEM_ERROR;
        case 5: return RESOURCE_EXHAUSTED;
        case 6: return INVOCATION_DEADLINE_EXCEEDED;
        case 8: return REQUEST_DEADLINE_EXCEEDED;
        case 7: return CANCELLED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.devtools.build.v1.BuildStatus.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.build.v1.BuildStatus.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <pre>
   * The end result.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildStatus.Result result = 1;</code>
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <pre>
   * The end result.
   * </pre>
   *
   * <code>.google.devtools.build.v1.BuildStatus.Result result = 1;</code>
   */
  public com.google.devtools.build.v1.BuildStatus.Result getResult() {
    @SuppressWarnings("deprecation")
    com.google.devtools.build.v1.BuildStatus.Result result = com.google.devtools.build.v1.BuildStatus.Result.valueOf(result_);
    return result == null ? com.google.devtools.build.v1.BuildStatus.Result.UNRECOGNIZED : result;
  }

  public static final int DETAILS_FIELD_NUMBER = 2;
  private com.google.protobuf.Any details_;
  /**
   * <pre>
   * Fine-grained diagnostic information to complement the status.
   * </pre>
   *
   * <code>.google.protobuf.Any details = 2;</code>
   */
  public boolean hasDetails() {
    return details_ != null;
  }
  /**
   * <pre>
   * Fine-grained diagnostic information to complement the status.
   * </pre>
   *
   * <code>.google.protobuf.Any details = 2;</code>
   */
  public com.google.protobuf.Any getDetails() {
    return details_ == null ? com.google.protobuf.Any.getDefaultInstance() : details_;
  }
  /**
   * <pre>
   * Fine-grained diagnostic information to complement the status.
   * </pre>
   *
   * <code>.google.protobuf.Any details = 2;</code>
   */
  public com.google.protobuf.AnyOrBuilder getDetailsOrBuilder() {
    return getDetails();
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
    if (result_ != com.google.devtools.build.v1.BuildStatus.Result.UNKNOWN_STATUS.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (details_ != null) {
      output.writeMessage(2, getDetails());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != com.google.devtools.build.v1.BuildStatus.Result.UNKNOWN_STATUS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (details_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDetails());
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
    if (!(obj instanceof com.google.devtools.build.v1.BuildStatus)) {
      return super.equals(obj);
    }
    com.google.devtools.build.v1.BuildStatus other = (com.google.devtools.build.v1.BuildStatus) obj;

    boolean result = true;
    result = result && result_ == other.result_;
    result = result && (hasDetails() == other.hasDetails());
    if (hasDetails()) {
      result = result && getDetails()
          .equals(other.getDetails());
    }
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (hasDetails()) {
      hash = (37 * hash) + DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getDetails().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.build.v1.BuildStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.build.v1.BuildStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.build.v1.BuildStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.build.v1.BuildStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.build.v1.BuildStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.build.v1.BuildStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.build.v1.BuildStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.build.v1.BuildStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.build.v1.BuildStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.build.v1.BuildStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.build.v1.BuildStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.build.v1.BuildStatus parseFrom(
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
  public static Builder newBuilder(com.google.devtools.build.v1.BuildStatus prototype) {
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
   * Status used for both invocation attempt and overall build completion.
   * </pre>
   *
   * Protobuf type {@code google.devtools.build.v1.BuildStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.build.v1.BuildStatus)
      com.google.devtools.build.v1.BuildStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.build.v1.BuildStatusProto.internal_static_google_devtools_build_v1_BuildStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.build.v1.BuildStatusProto.internal_static_google_devtools_build_v1_BuildStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.build.v1.BuildStatus.class, com.google.devtools.build.v1.BuildStatus.Builder.class);
    }

    // Construct using com.google.devtools.build.v1.BuildStatus.newBuilder()
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
      result_ = 0;

      if (detailsBuilder_ == null) {
        details_ = null;
      } else {
        details_ = null;
        detailsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.build.v1.BuildStatusProto.internal_static_google_devtools_build_v1_BuildStatus_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.build.v1.BuildStatus getDefaultInstanceForType() {
      return com.google.devtools.build.v1.BuildStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.build.v1.BuildStatus build() {
      com.google.devtools.build.v1.BuildStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.build.v1.BuildStatus buildPartial() {
      com.google.devtools.build.v1.BuildStatus result = new com.google.devtools.build.v1.BuildStatus(this);
      result.result_ = result_;
      if (detailsBuilder_ == null) {
        result.details_ = details_;
      } else {
        result.details_ = detailsBuilder_.build();
      }
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
      if (other instanceof com.google.devtools.build.v1.BuildStatus) {
        return mergeFrom((com.google.devtools.build.v1.BuildStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.build.v1.BuildStatus other) {
      if (other == com.google.devtools.build.v1.BuildStatus.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasDetails()) {
        mergeDetails(other.getDetails());
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
      com.google.devtools.build.v1.BuildStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.build.v1.BuildStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ = 0;
    /**
     * <pre>
     * The end result.
     * </pre>
     *
     * <code>.google.devtools.build.v1.BuildStatus.Result result = 1;</code>
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <pre>
     * The end result.
     * </pre>
     *
     * <code>.google.devtools.build.v1.BuildStatus.Result result = 1;</code>
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The end result.
     * </pre>
     *
     * <code>.google.devtools.build.v1.BuildStatus.Result result = 1;</code>
     */
    public com.google.devtools.build.v1.BuildStatus.Result getResult() {
      @SuppressWarnings("deprecation")
      com.google.devtools.build.v1.BuildStatus.Result result = com.google.devtools.build.v1.BuildStatus.Result.valueOf(result_);
      return result == null ? com.google.devtools.build.v1.BuildStatus.Result.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The end result.
     * </pre>
     *
     * <code>.google.devtools.build.v1.BuildStatus.Result result = 1;</code>
     */
    public Builder setResult(com.google.devtools.build.v1.BuildStatus.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The end result.
     * </pre>
     *
     * <code>.google.devtools.build.v1.BuildStatus.Result result = 1;</code>
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any details_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> detailsBuilder_;
    /**
     * <pre>
     * Fine-grained diagnostic information to complement the status.
     * </pre>
     *
     * <code>.google.protobuf.Any details = 2;</code>
     */
    public boolean hasDetails() {
      return detailsBuilder_ != null || details_ != null;
    }
    /**
     * <pre>
     * Fine-grained diagnostic information to complement the status.
     * </pre>
     *
     * <code>.google.protobuf.Any details = 2;</code>
     */
    public com.google.protobuf.Any getDetails() {
      if (detailsBuilder_ == null) {
        return details_ == null ? com.google.protobuf.Any.getDefaultInstance() : details_;
      } else {
        return detailsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Fine-grained diagnostic information to complement the status.
     * </pre>
     *
     * <code>.google.protobuf.Any details = 2;</code>
     */
    public Builder setDetails(com.google.protobuf.Any value) {
      if (detailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        details_ = value;
        onChanged();
      } else {
        detailsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Fine-grained diagnostic information to complement the status.
     * </pre>
     *
     * <code>.google.protobuf.Any details = 2;</code>
     */
    public Builder setDetails(
        com.google.protobuf.Any.Builder builderForValue) {
      if (detailsBuilder_ == null) {
        details_ = builderForValue.build();
        onChanged();
      } else {
        detailsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Fine-grained diagnostic information to complement the status.
     * </pre>
     *
     * <code>.google.protobuf.Any details = 2;</code>
     */
    public Builder mergeDetails(com.google.protobuf.Any value) {
      if (detailsBuilder_ == null) {
        if (details_ != null) {
          details_ =
            com.google.protobuf.Any.newBuilder(details_).mergeFrom(value).buildPartial();
        } else {
          details_ = value;
        }
        onChanged();
      } else {
        detailsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Fine-grained diagnostic information to complement the status.
     * </pre>
     *
     * <code>.google.protobuf.Any details = 2;</code>
     */
    public Builder clearDetails() {
      if (detailsBuilder_ == null) {
        details_ = null;
        onChanged();
      } else {
        details_ = null;
        detailsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Fine-grained diagnostic information to complement the status.
     * </pre>
     *
     * <code>.google.protobuf.Any details = 2;</code>
     */
    public com.google.protobuf.Any.Builder getDetailsBuilder() {
      
      onChanged();
      return getDetailsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Fine-grained diagnostic information to complement the status.
     * </pre>
     *
     * <code>.google.protobuf.Any details = 2;</code>
     */
    public com.google.protobuf.AnyOrBuilder getDetailsOrBuilder() {
      if (detailsBuilder_ != null) {
        return detailsBuilder_.getMessageOrBuilder();
      } else {
        return details_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : details_;
      }
    }
    /**
     * <pre>
     * Fine-grained diagnostic information to complement the status.
     * </pre>
     *
     * <code>.google.protobuf.Any details = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getDetailsFieldBuilder() {
      if (detailsBuilder_ == null) {
        detailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getDetails(),
                getParentForChildren(),
                isClean());
        details_ = null;
      }
      return detailsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.build.v1.BuildStatus)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.build.v1.BuildStatus)
  private static final com.google.devtools.build.v1.BuildStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.build.v1.BuildStatus();
  }

  public static com.google.devtools.build.v1.BuildStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildStatus>
      PARSER = new com.google.protobuf.AbstractParser<BuildStatus>() {
    @java.lang.Override
    public BuildStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuildStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuildStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.build.v1.BuildStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

