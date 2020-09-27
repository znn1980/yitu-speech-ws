// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: YituAudioSpeech.proto

package com.yitutech.speech;

/**
 * <pre>
 * 音频相关设置
 * </pre>
 *
 * Protobuf type {@code AudioConfig}
 */
public final class AudioConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AudioConfig)
        AudioConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AudioConfig.newBuilder() to construct.
  private AudioConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AudioConfig() {
    aue_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new AudioConfig();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AudioConfig(
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
          case 8: {
            int rawValue = input.readEnum();

            aue_ = rawValue;
            break;
          }
          case 16: {

            sampleRate_ = input.readInt32();
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
    return StreamingProtos.internal_static_AudioConfig_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return StreamingProtos.internal_static_AudioConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AudioConfig.class, Builder.class);
  }

  /**
   * <pre>
   * 音频的编码
   * </pre>
   *
   * Protobuf enum {@code AudioConfig.AudioEncoding}
   */
  public enum AudioEncoding
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <code>PCM = 1;</code>
     */
    PCM(1),
    /**
     * <code>AAC = 2;</code>
     */
    AAC(2),
    /**
     * <code>MPEG2 = 3;</code>
     */
    MPEG2(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <code>PCM = 1;</code>
     */
    public static final int PCM_VALUE = 1;
    /**
     * <code>AAC = 2;</code>
     */
    public static final int AAC_VALUE = 2;
    /**
     * <code>MPEG2 = 3;</code>
     */
    public static final int MPEG2_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static AudioEncoding valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AudioEncoding forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return PCM;
        case 2: return AAC;
        case 3: return MPEG2;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AudioEncoding>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AudioEncoding> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AudioEncoding>() {
            public AudioEncoding findValueByNumber(int number) {
              return AudioEncoding.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return AudioConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final AudioEncoding[] VALUES = values();

    public static AudioEncoding valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AudioEncoding(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AudioConfig.AudioEncoding)
  }

  public static final int AUE_FIELD_NUMBER = 1;
  private int aue_;
  /**
   * <code>.AudioConfig.AudioEncoding aue = 1;</code>
   * @return The enum numeric value on the wire for aue.
   */
  @Override
  public int getAueValue() {
    return aue_;
  }
  /**
   * <code>.AudioConfig.AudioEncoding aue = 1;</code>
   * @return The aue.
   */
  @Override
  public AudioEncoding getAue() {
    @SuppressWarnings("deprecation")
    AudioEncoding result = AudioEncoding.valueOf(aue_);
    return result == null ? AudioEncoding.UNRECOGNIZED : result;
  }

  public static final int SAMPLERATE_FIELD_NUMBER = 2;
  private int sampleRate_;
  /**
   * <pre>
   * 采样率（范围为8000-48000）
   * </pre>
   *
   * <code>int32 sampleRate = 2;</code>
   * @return The sampleRate.
   */
  @Override
  public int getSampleRate() {
    return sampleRate_;
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
    if (aue_ != AudioEncoding.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, aue_);
    }
    if (sampleRate_ != 0) {
      output.writeInt32(2, sampleRate_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (aue_ != AudioEncoding.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, aue_);
    }
    if (sampleRate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sampleRate_);
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
    if (!(obj instanceof AudioConfig)) {
      return super.equals(obj);
    }
    AudioConfig other = (AudioConfig) obj;

    if (aue_ != other.aue_) return false;
    if (getSampleRate()
        != other.getSampleRate()) return false;
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
    hash = (37 * hash) + AUE_FIELD_NUMBER;
    hash = (53 * hash) + aue_;
    hash = (37 * hash) + SAMPLERATE_FIELD_NUMBER;
    hash = (53 * hash) + getSampleRate();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AudioConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AudioConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AudioConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AudioConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AudioConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AudioConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AudioConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AudioConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AudioConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AudioConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AudioConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AudioConfig parseFrom(
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
  public static Builder newBuilder(AudioConfig prototype) {
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
   * 音频相关设置
   * </pre>
   *
   * Protobuf type {@code AudioConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AudioConfig)
          AudioConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StreamingProtos.internal_static_AudioConfig_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StreamingProtos.internal_static_AudioConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AudioConfig.class, Builder.class);
    }

    // Construct using com.yitutech.speech.AudioConfig.newBuilder()
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
      aue_ = 0;

      sampleRate_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return StreamingProtos.internal_static_AudioConfig_descriptor;
    }

    @Override
    public AudioConfig getDefaultInstanceForType() {
      return AudioConfig.getDefaultInstance();
    }

    @Override
    public AudioConfig build() {
      AudioConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public AudioConfig buildPartial() {
      AudioConfig result = new AudioConfig(this);
      result.aue_ = aue_;
      result.sampleRate_ = sampleRate_;
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
      if (other instanceof AudioConfig) {
        return mergeFrom((AudioConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AudioConfig other) {
      if (other == AudioConfig.getDefaultInstance()) return this;
      if (other.aue_ != 0) {
        setAueValue(other.getAueValue());
      }
      if (other.getSampleRate() != 0) {
        setSampleRate(other.getSampleRate());
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
      AudioConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AudioConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int aue_ = 0;
    /**
     * <code>.AudioConfig.AudioEncoding aue = 1;</code>
     * @return The enum numeric value on the wire for aue.
     */
    @Override
    public int getAueValue() {
      return aue_;
    }
    /**
     * <code>.AudioConfig.AudioEncoding aue = 1;</code>
     * @param value The enum numeric value on the wire for aue to set.
     * @return This builder for chaining.
     */
    public Builder setAueValue(int value) {
      
      aue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.AudioConfig.AudioEncoding aue = 1;</code>
     * @return The aue.
     */
    @Override
    public AudioEncoding getAue() {
      @SuppressWarnings("deprecation")
      AudioEncoding result = AudioEncoding.valueOf(aue_);
      return result == null ? AudioEncoding.UNRECOGNIZED : result;
    }
    /**
     * <code>.AudioConfig.AudioEncoding aue = 1;</code>
     * @param value The aue to set.
     * @return This builder for chaining.
     */
    public Builder setAue(AudioEncoding value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      aue_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.AudioConfig.AudioEncoding aue = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAue() {
      
      aue_ = 0;
      onChanged();
      return this;
    }

    private int sampleRate_ ;
    /**
     * <pre>
     * 采样率（范围为8000-48000）
     * </pre>
     *
     * <code>int32 sampleRate = 2;</code>
     * @return The sampleRate.
     */
    @Override
    public int getSampleRate() {
      return sampleRate_;
    }
    /**
     * <pre>
     * 采样率（范围为8000-48000）
     * </pre>
     *
     * <code>int32 sampleRate = 2;</code>
     * @param value The sampleRate to set.
     * @return This builder for chaining.
     */
    public Builder setSampleRate(int value) {
      
      sampleRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 采样率（范围为8000-48000）
     * </pre>
     *
     * <code>int32 sampleRate = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSampleRate() {
      
      sampleRate_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:AudioConfig)
  }

  // @@protoc_insertion_point(class_scope:AudioConfig)
  private static final AudioConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AudioConfig();
  }

  public static AudioConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudioConfig>
      PARSER = new com.google.protobuf.AbstractParser<AudioConfig>() {
    @Override
    public AudioConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AudioConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AudioConfig> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AudioConfig> getParserForType() {
    return PARSER;
  }

  @Override
  public AudioConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

