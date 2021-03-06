// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: YituAudioSpeech.proto

package com.yitutech.speech;

/**
 * <pre>
 * 音频流识别请求回应
 * </pre>
 *
 * Protobuf type {@code StreamingSpeechResponse}
 */
public final class StreamingSpeechResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:StreamingSpeechResponse)
    StreamingSpeechResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamingSpeechResponse.newBuilder() to construct.
  private StreamingSpeechResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamingSpeechResponse() {
    globalStreamId_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamingSpeechResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamingSpeechResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
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
            String s = input.readStringRequireUtf8();

            globalStreamId_ = s;
            break;
          }
          case 18: {
            StreamingSpeechResult.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(StreamingSpeechResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            StreamingSpeechStatus.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(StreamingSpeechStatus.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return StreamingProtos.internal_static_StreamingSpeechResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return StreamingProtos.internal_static_StreamingSpeechResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            StreamingSpeechResponse.class, Builder.class);
  }

  public static final int GLOBALSTREAMID_FIELD_NUMBER = 1;
  private volatile Object globalStreamId_;
  /**
   * <pre>
   * 此次实时处理的全局唯一ID。
   * </pre>
   *
   * <code>string globalStreamId = 1;</code>
   * @return The globalStreamId.
   */
  @Override
  public String getGlobalStreamId() {
    Object ref = globalStreamId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      globalStreamId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 此次实时处理的全局唯一ID。
   * </pre>
   *
   * <code>string globalStreamId = 1;</code>
   * @return The bytes for globalStreamId.
   */
  @Override
  public com.google.protobuf.ByteString
      getGlobalStreamIdBytes() {
    Object ref = globalStreamId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      globalStreamId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private StreamingSpeechResult result_;
  /**
   * <pre>
   * 返回识别结果
   * </pre>
   *
   * <code>.StreamingSpeechResult result = 2;</code>
   * @return Whether the result field is set.
   */
  @Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <pre>
   * 返回识别结果
   * </pre>
   *
   * <code>.StreamingSpeechResult result = 2;</code>
   * @return The result.
   */
  @Override
  public StreamingSpeechResult getResult() {
    return result_ == null ? StreamingSpeechResult.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * 返回识别结果
   * </pre>
   *
   * <code>.StreamingSpeechResult result = 2;</code>
   */
  @Override
  public StreamingSpeechResultOrBuilder getResultOrBuilder() {
    return getResult();
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private StreamingSpeechStatus status_;
  /**
   * <pre>
   * 返回识别状态
   * </pre>
   *
   * <code>.StreamingSpeechStatus status = 3;</code>
   * @return Whether the status field is set.
   */
  @Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * 返回识别状态
   * </pre>
   *
   * <code>.StreamingSpeechStatus status = 3;</code>
   * @return The status.
   */
  @Override
  public StreamingSpeechStatus getStatus() {
    return status_ == null ? StreamingSpeechStatus.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * 返回识别状态
   * </pre>
   *
   * <code>.StreamingSpeechStatus status = 3;</code>
   */
  @Override
  public StreamingSpeechStatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getGlobalStreamIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, globalStreamId_);
    }
    if (result_ != null) {
      output.writeMessage(2, getResult());
    }
    if (status_ != null) {
      output.writeMessage(3, getStatus());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGlobalStreamIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, globalStreamId_);
    }
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResult());
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStatus());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof StreamingSpeechResponse)) {
      return super.equals(obj);
    }
    StreamingSpeechResponse other = (StreamingSpeechResponse) obj;

    if (!getGlobalStreamId()
        .equals(other.getGlobalStreamId())) return false;
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GLOBALSTREAMID_FIELD_NUMBER;
    hash = (53 * hash) + getGlobalStreamId().hashCode();
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static StreamingSpeechResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StreamingSpeechResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StreamingSpeechResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StreamingSpeechResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StreamingSpeechResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StreamingSpeechResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StreamingSpeechResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StreamingSpeechResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static StreamingSpeechResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static StreamingSpeechResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static StreamingSpeechResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StreamingSpeechResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(StreamingSpeechResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 音频流识别请求回应
   * </pre>
   *
   * Protobuf type {@code StreamingSpeechResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:StreamingSpeechResponse)
      StreamingSpeechResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StreamingProtos.internal_static_StreamingSpeechResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StreamingProtos.internal_static_StreamingSpeechResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StreamingSpeechResponse.class, Builder.class);
    }

    // Construct using com.yitutech.speech.StreamingSpeechResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      globalStreamId_ = "";

      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return StreamingProtos.internal_static_StreamingSpeechResponse_descriptor;
    }

    @Override
    public StreamingSpeechResponse getDefaultInstanceForType() {
      return StreamingSpeechResponse.getDefaultInstance();
    }

    @Override
    public StreamingSpeechResponse build() {
      StreamingSpeechResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public StreamingSpeechResponse buildPartial() {
      StreamingSpeechResponse result = new StreamingSpeechResponse(this);
      result.globalStreamId_ = globalStreamId_;
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof StreamingSpeechResponse) {
        return mergeFrom((StreamingSpeechResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(StreamingSpeechResponse other) {
      if (other == StreamingSpeechResponse.getDefaultInstance()) return this;
      if (!other.getGlobalStreamId().isEmpty()) {
        globalStreamId_ = other.globalStreamId_;
        onChanged();
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      StreamingSpeechResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (StreamingSpeechResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object globalStreamId_ = "";
    /**
     * <pre>
     * 此次实时处理的全局唯一ID。
     * </pre>
     *
     * <code>string globalStreamId = 1;</code>
     * @return The globalStreamId.
     */
    public String getGlobalStreamId() {
      Object ref = globalStreamId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        globalStreamId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 此次实时处理的全局唯一ID。
     * </pre>
     *
     * <code>string globalStreamId = 1;</code>
     * @return The bytes for globalStreamId.
     */
    public com.google.protobuf.ByteString
        getGlobalStreamIdBytes() {
      Object ref = globalStreamId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        globalStreamId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 此次实时处理的全局唯一ID。
     * </pre>
     *
     * <code>string globalStreamId = 1;</code>
     * @param value The globalStreamId to set.
     * @return This builder for chaining.
     */
    public Builder setGlobalStreamId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      globalStreamId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 此次实时处理的全局唯一ID。
     * </pre>
     *
     * <code>string globalStreamId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlobalStreamId() {
      
      globalStreamId_ = getDefaultInstance().getGlobalStreamId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 此次实时处理的全局唯一ID。
     * </pre>
     *
     * <code>string globalStreamId = 1;</code>
     * @param value The bytes for globalStreamId to set.
     * @return This builder for chaining.
     */
    public Builder setGlobalStreamIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      globalStreamId_ = value;
      onChanged();
      return this;
    }

    private StreamingSpeechResult result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        StreamingSpeechResult, StreamingSpeechResult.Builder, StreamingSpeechResultOrBuilder> resultBuilder_;
    /**
     * <pre>
     * 返回识别结果
     * </pre>
     *
     * <code>.StreamingSpeechResult result = 2;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <pre>
     * 返回识别结果
     * </pre>
     *
     * <code>.StreamingSpeechResult result = 2;</code>
     * @return The result.
     */
    public StreamingSpeechResult getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? StreamingSpeechResult.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 返回识别结果
     * </pre>
     *
     * <code>.StreamingSpeechResult result = 2;</code>
     */
    public Builder setResult(StreamingSpeechResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 返回识别结果
     * </pre>
     *
     * <code>.StreamingSpeechResult result = 2;</code>
     */
    public Builder setResult(
        StreamingSpeechResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 返回识别结果
     * </pre>
     *
     * <code>.StreamingSpeechResult result = 2;</code>
     */
    public Builder mergeResult(StreamingSpeechResult value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            StreamingSpeechResult.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 返回识别结果
     * </pre>
     *
     * <code>.StreamingSpeechResult result = 2;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 返回识别结果
     * </pre>
     *
     * <code>.StreamingSpeechResult result = 2;</code>
     */
    public StreamingSpeechResult.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 返回识别结果
     * </pre>
     *
     * <code>.StreamingSpeechResult result = 2;</code>
     */
    public StreamingSpeechResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            StreamingSpeechResult.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * 返回识别结果
     * </pre>
     *
     * <code>.StreamingSpeechResult result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        StreamingSpeechResult, StreamingSpeechResult.Builder, StreamingSpeechResultOrBuilder>
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            StreamingSpeechResult, StreamingSpeechResult.Builder, StreamingSpeechResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }

    private StreamingSpeechStatus status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        StreamingSpeechStatus, StreamingSpeechStatus.Builder, StreamingSpeechStatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * 返回识别状态
     * </pre>
     *
     * <code>.StreamingSpeechStatus status = 3;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <pre>
     * 返回识别状态
     * </pre>
     *
     * <code>.StreamingSpeechStatus status = 3;</code>
     * @return The status.
     */
    public StreamingSpeechStatus getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? StreamingSpeechStatus.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 返回识别状态
     * </pre>
     *
     * <code>.StreamingSpeechStatus status = 3;</code>
     */
    public Builder setStatus(StreamingSpeechStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 返回识别状态
     * </pre>
     *
     * <code>.StreamingSpeechStatus status = 3;</code>
     */
    public Builder setStatus(
        StreamingSpeechStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 返回识别状态
     * </pre>
     *
     * <code>.StreamingSpeechStatus status = 3;</code>
     */
    public Builder mergeStatus(StreamingSpeechStatus value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            StreamingSpeechStatus.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 返回识别状态
     * </pre>
     *
     * <code>.StreamingSpeechStatus status = 3;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 返回识别状态
     * </pre>
     *
     * <code>.StreamingSpeechStatus status = 3;</code>
     */
    public StreamingSpeechStatus.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 返回识别状态
     * </pre>
     *
     * <code>.StreamingSpeechStatus status = 3;</code>
     */
    public StreamingSpeechStatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            StreamingSpeechStatus.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * 返回识别状态
     * </pre>
     *
     * <code>.StreamingSpeechStatus status = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        StreamingSpeechStatus, StreamingSpeechStatus.Builder, StreamingSpeechStatusOrBuilder>
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            StreamingSpeechStatus, StreamingSpeechStatus.Builder, StreamingSpeechStatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:StreamingSpeechResponse)
  }

  // @@protoc_insertion_point(class_scope:StreamingSpeechResponse)
  private static final StreamingSpeechResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StreamingSpeechResponse();
  }

  public static StreamingSpeechResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingSpeechResponse>
      PARSER = new com.google.protobuf.AbstractParser<StreamingSpeechResponse>() {
    @Override
    public StreamingSpeechResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamingSpeechResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamingSpeechResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<StreamingSpeechResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public StreamingSpeechResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

