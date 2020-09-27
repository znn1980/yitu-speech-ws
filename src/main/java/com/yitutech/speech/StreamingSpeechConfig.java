// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: YituAudioSpeech.proto

package com.yitutech.speech;

/**
 * <pre>
 * 音频流请求的相关设置。
 * </pre>
 *
 * Protobuf type {@code StreamingSpeechConfig}
 */
public final class StreamingSpeechConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:StreamingSpeechConfig)
        StreamingSpeechConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamingSpeechConfig.newBuilder() to construct.
  private StreamingSpeechConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamingSpeechConfig() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamingSpeechConfig();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamingSpeechConfig(
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
            AudioConfig.Builder subBuilder = null;
            if (audioConfig_ != null) {
              subBuilder = audioConfig_.toBuilder();
            }
            audioConfig_ = input.readMessage(AudioConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(audioConfig_);
              audioConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            SpeechConfig.Builder subBuilder = null;
            if (speechConfig_ != null) {
              subBuilder = speechConfig_.toBuilder();
            }
            speechConfig_ = input.readMessage(SpeechConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(speechConfig_);
              speechConfig_ = subBuilder.buildPartial();
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
    return StreamingProtos.internal_static_StreamingSpeechConfig_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return StreamingProtos.internal_static_StreamingSpeechConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            StreamingSpeechConfig.class, Builder.class);
  }

  public static final int AUDIOCONFIG_FIELD_NUMBER = 1;
  private AudioConfig audioConfig_;
  /**
   * <pre>
   * 音频设置。
   * </pre>
   *
   * <code>.AudioConfig audioConfig = 1;</code>
   * @return Whether the audioConfig field is set.
   */
  @Override
  public boolean hasAudioConfig() {
    return audioConfig_ != null;
  }
  /**
   * <pre>
   * 音频设置。
   * </pre>
   *
   * <code>.AudioConfig audioConfig = 1;</code>
   * @return The audioConfig.
   */
  @Override
  public AudioConfig getAudioConfig() {
    return audioConfig_ == null ? AudioConfig.getDefaultInstance() : audioConfig_;
  }
  /**
   * <pre>
   * 音频设置。
   * </pre>
   *
   * <code>.AudioConfig audioConfig = 1;</code>
   */
  @Override
  public AudioConfigOrBuilder getAudioConfigOrBuilder() {
    return getAudioConfig();
  }

  public static final int SPEECHCONFIG_FIELD_NUMBER = 2;
  private SpeechConfig speechConfig_;
  /**
   * <pre>
   * 识别设置。
   * </pre>
   *
   * <code>.SpeechConfig speechConfig = 2;</code>
   * @return Whether the speechConfig field is set.
   */
  @Override
  public boolean hasSpeechConfig() {
    return speechConfig_ != null;
  }
  /**
   * <pre>
   * 识别设置。
   * </pre>
   *
   * <code>.SpeechConfig speechConfig = 2;</code>
   * @return The speechConfig.
   */
  @Override
  public SpeechConfig getSpeechConfig() {
    return speechConfig_ == null ? SpeechConfig.getDefaultInstance() : speechConfig_;
  }
  /**
   * <pre>
   * 识别设置。
   * </pre>
   *
   * <code>.SpeechConfig speechConfig = 2;</code>
   */
  @Override
  public SpeechConfigOrBuilder getSpeechConfigOrBuilder() {
    return getSpeechConfig();
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
    if (audioConfig_ != null) {
      output.writeMessage(1, getAudioConfig());
    }
    if (speechConfig_ != null) {
      output.writeMessage(2, getSpeechConfig());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (audioConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAudioConfig());
    }
    if (speechConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSpeechConfig());
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
    if (!(obj instanceof StreamingSpeechConfig)) {
      return super.equals(obj);
    }
    StreamingSpeechConfig other = (StreamingSpeechConfig) obj;

    if (hasAudioConfig() != other.hasAudioConfig()) return false;
    if (hasAudioConfig()) {
      if (!getAudioConfig()
          .equals(other.getAudioConfig())) return false;
    }
    if (hasSpeechConfig() != other.hasSpeechConfig()) return false;
    if (hasSpeechConfig()) {
      if (!getSpeechConfig()
          .equals(other.getSpeechConfig())) return false;
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
    if (hasAudioConfig()) {
      hash = (37 * hash) + AUDIOCONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getAudioConfig().hashCode();
    }
    if (hasSpeechConfig()) {
      hash = (37 * hash) + SPEECHCONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getSpeechConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static StreamingSpeechConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StreamingSpeechConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StreamingSpeechConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StreamingSpeechConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StreamingSpeechConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StreamingSpeechConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StreamingSpeechConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StreamingSpeechConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static StreamingSpeechConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static StreamingSpeechConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static StreamingSpeechConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StreamingSpeechConfig parseFrom(
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
  public static Builder newBuilder(StreamingSpeechConfig prototype) {
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
   * 音频流请求的相关设置。
   * </pre>
   *
   * Protobuf type {@code StreamingSpeechConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:StreamingSpeechConfig)
          StreamingSpeechConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StreamingProtos.internal_static_StreamingSpeechConfig_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StreamingProtos.internal_static_StreamingSpeechConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StreamingSpeechConfig.class, Builder.class);
    }

    // Construct using com.yitutech.speech.StreamingSpeechConfig.newBuilder()
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
      if (audioConfigBuilder_ == null) {
        audioConfig_ = null;
      } else {
        audioConfig_ = null;
        audioConfigBuilder_ = null;
      }
      if (speechConfigBuilder_ == null) {
        speechConfig_ = null;
      } else {
        speechConfig_ = null;
        speechConfigBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return StreamingProtos.internal_static_StreamingSpeechConfig_descriptor;
    }

    @Override
    public StreamingSpeechConfig getDefaultInstanceForType() {
      return StreamingSpeechConfig.getDefaultInstance();
    }

    @Override
    public StreamingSpeechConfig build() {
      StreamingSpeechConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public StreamingSpeechConfig buildPartial() {
      StreamingSpeechConfig result = new StreamingSpeechConfig(this);
      if (audioConfigBuilder_ == null) {
        result.audioConfig_ = audioConfig_;
      } else {
        result.audioConfig_ = audioConfigBuilder_.build();
      }
      if (speechConfigBuilder_ == null) {
        result.speechConfig_ = speechConfig_;
      } else {
        result.speechConfig_ = speechConfigBuilder_.build();
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
      if (other instanceof StreamingSpeechConfig) {
        return mergeFrom((StreamingSpeechConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(StreamingSpeechConfig other) {
      if (other == StreamingSpeechConfig.getDefaultInstance()) return this;
      if (other.hasAudioConfig()) {
        mergeAudioConfig(other.getAudioConfig());
      }
      if (other.hasSpeechConfig()) {
        mergeSpeechConfig(other.getSpeechConfig());
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
      StreamingSpeechConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (StreamingSpeechConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private AudioConfig audioConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            AudioConfig, AudioConfig.Builder, AudioConfigOrBuilder> audioConfigBuilder_;
    /**
     * <pre>
     * 音频设置。
     * </pre>
     *
     * <code>.AudioConfig audioConfig = 1;</code>
     * @return Whether the audioConfig field is set.
     */
    public boolean hasAudioConfig() {
      return audioConfigBuilder_ != null || audioConfig_ != null;
    }
    /**
     * <pre>
     * 音频设置。
     * </pre>
     *
     * <code>.AudioConfig audioConfig = 1;</code>
     * @return The audioConfig.
     */
    public AudioConfig getAudioConfig() {
      if (audioConfigBuilder_ == null) {
        return audioConfig_ == null ? AudioConfig.getDefaultInstance() : audioConfig_;
      } else {
        return audioConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 音频设置。
     * </pre>
     *
     * <code>.AudioConfig audioConfig = 1;</code>
     */
    public Builder setAudioConfig(AudioConfig value) {
      if (audioConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audioConfig_ = value;
        onChanged();
      } else {
        audioConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 音频设置。
     * </pre>
     *
     * <code>.AudioConfig audioConfig = 1;</code>
     */
    public Builder setAudioConfig(
        AudioConfig.Builder builderForValue) {
      if (audioConfigBuilder_ == null) {
        audioConfig_ = builderForValue.build();
        onChanged();
      } else {
        audioConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 音频设置。
     * </pre>
     *
     * <code>.AudioConfig audioConfig = 1;</code>
     */
    public Builder mergeAudioConfig(AudioConfig value) {
      if (audioConfigBuilder_ == null) {
        if (audioConfig_ != null) {
          audioConfig_ =
            AudioConfig.newBuilder(audioConfig_).mergeFrom(value).buildPartial();
        } else {
          audioConfig_ = value;
        }
        onChanged();
      } else {
        audioConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 音频设置。
     * </pre>
     *
     * <code>.AudioConfig audioConfig = 1;</code>
     */
    public Builder clearAudioConfig() {
      if (audioConfigBuilder_ == null) {
        audioConfig_ = null;
        onChanged();
      } else {
        audioConfig_ = null;
        audioConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 音频设置。
     * </pre>
     *
     * <code>.AudioConfig audioConfig = 1;</code>
     */
    public AudioConfig.Builder getAudioConfigBuilder() {
      
      onChanged();
      return getAudioConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 音频设置。
     * </pre>
     *
     * <code>.AudioConfig audioConfig = 1;</code>
     */
    public AudioConfigOrBuilder getAudioConfigOrBuilder() {
      if (audioConfigBuilder_ != null) {
        return audioConfigBuilder_.getMessageOrBuilder();
      } else {
        return audioConfig_ == null ?
            AudioConfig.getDefaultInstance() : audioConfig_;
      }
    }
    /**
     * <pre>
     * 音频设置。
     * </pre>
     *
     * <code>.AudioConfig audioConfig = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            AudioConfig, AudioConfig.Builder, AudioConfigOrBuilder>
        getAudioConfigFieldBuilder() {
      if (audioConfigBuilder_ == null) {
        audioConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                AudioConfig, AudioConfig.Builder, AudioConfigOrBuilder>(
                getAudioConfig(),
                getParentForChildren(),
                isClean());
        audioConfig_ = null;
      }
      return audioConfigBuilder_;
    }

    private SpeechConfig speechConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            SpeechConfig, SpeechConfig.Builder, SpeechConfigOrBuilder> speechConfigBuilder_;
    /**
     * <pre>
     * 识别设置。
     * </pre>
     *
     * <code>.SpeechConfig speechConfig = 2;</code>
     * @return Whether the speechConfig field is set.
     */
    public boolean hasSpeechConfig() {
      return speechConfigBuilder_ != null || speechConfig_ != null;
    }
    /**
     * <pre>
     * 识别设置。
     * </pre>
     *
     * <code>.SpeechConfig speechConfig = 2;</code>
     * @return The speechConfig.
     */
    public SpeechConfig getSpeechConfig() {
      if (speechConfigBuilder_ == null) {
        return speechConfig_ == null ? SpeechConfig.getDefaultInstance() : speechConfig_;
      } else {
        return speechConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 识别设置。
     * </pre>
     *
     * <code>.SpeechConfig speechConfig = 2;</code>
     */
    public Builder setSpeechConfig(SpeechConfig value) {
      if (speechConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        speechConfig_ = value;
        onChanged();
      } else {
        speechConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 识别设置。
     * </pre>
     *
     * <code>.SpeechConfig speechConfig = 2;</code>
     */
    public Builder setSpeechConfig(
        SpeechConfig.Builder builderForValue) {
      if (speechConfigBuilder_ == null) {
        speechConfig_ = builderForValue.build();
        onChanged();
      } else {
        speechConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 识别设置。
     * </pre>
     *
     * <code>.SpeechConfig speechConfig = 2;</code>
     */
    public Builder mergeSpeechConfig(SpeechConfig value) {
      if (speechConfigBuilder_ == null) {
        if (speechConfig_ != null) {
          speechConfig_ =
            SpeechConfig.newBuilder(speechConfig_).mergeFrom(value).buildPartial();
        } else {
          speechConfig_ = value;
        }
        onChanged();
      } else {
        speechConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 识别设置。
     * </pre>
     *
     * <code>.SpeechConfig speechConfig = 2;</code>
     */
    public Builder clearSpeechConfig() {
      if (speechConfigBuilder_ == null) {
        speechConfig_ = null;
        onChanged();
      } else {
        speechConfig_ = null;
        speechConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 识别设置。
     * </pre>
     *
     * <code>.SpeechConfig speechConfig = 2;</code>
     */
    public SpeechConfig.Builder getSpeechConfigBuilder() {
      
      onChanged();
      return getSpeechConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 识别设置。
     * </pre>
     *
     * <code>.SpeechConfig speechConfig = 2;</code>
     */
    public SpeechConfigOrBuilder getSpeechConfigOrBuilder() {
      if (speechConfigBuilder_ != null) {
        return speechConfigBuilder_.getMessageOrBuilder();
      } else {
        return speechConfig_ == null ?
            SpeechConfig.getDefaultInstance() : speechConfig_;
      }
    }
    /**
     * <pre>
     * 识别设置。
     * </pre>
     *
     * <code>.SpeechConfig speechConfig = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            SpeechConfig, SpeechConfig.Builder, SpeechConfigOrBuilder>
        getSpeechConfigFieldBuilder() {
      if (speechConfigBuilder_ == null) {
        speechConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                SpeechConfig, SpeechConfig.Builder, SpeechConfigOrBuilder>(
                getSpeechConfig(),
                getParentForChildren(),
                isClean());
        speechConfig_ = null;
      }
      return speechConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:StreamingSpeechConfig)
  }

  // @@protoc_insertion_point(class_scope:StreamingSpeechConfig)
  private static final StreamingSpeechConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StreamingSpeechConfig();
  }

  public static StreamingSpeechConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingSpeechConfig>
      PARSER = new com.google.protobuf.AbstractParser<StreamingSpeechConfig>() {
    @Override
    public StreamingSpeechConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamingSpeechConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamingSpeechConfig> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<StreamingSpeechConfig> getParserForType() {
    return PARSER;
  }

  @Override
  public StreamingSpeechConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

