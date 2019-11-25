// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/weather.proto

package org.sensoris.categories.weather;

/**
 * <pre>
 * Weather category.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.categories.weather.WeatherCategory}
 */
public  final class WeatherCategory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.categories.weather.WeatherCategory)
    WeatherCategoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeatherCategory.newBuilder() to construct.
  private WeatherCategory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeatherCategory() {
    precipitation_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeatherCategory(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            org.sensoris.types.base.CategoryEnvelope.Builder subBuilder = null;
            if (envelope_ != null) {
              subBuilder = envelope_.toBuilder();
            }
            envelope_ = input.readMessage(org.sensoris.types.base.CategoryEnvelope.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(envelope_);
              envelope_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              precipitation_ = new java.util.ArrayList<org.sensoris.categories.weather.Precipitation>();
              mutable_bitField0_ |= 0x00000002;
            }
            precipitation_.add(
                input.readMessage(org.sensoris.categories.weather.Precipitation.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        precipitation_ = java.util.Collections.unmodifiableList(precipitation_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.categories.weather.SensorisWeatherCategory.internal_static_sensoris_protobuf_categories_weather_WeatherCategory_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.categories.weather.SensorisWeatherCategory.internal_static_sensoris_protobuf_categories_weather_WeatherCategory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.categories.weather.WeatherCategory.class, org.sensoris.categories.weather.WeatherCategory.Builder.class);
  }

  private int bitField0_;
  public static final int ENVELOPE_FIELD_NUMBER = 1;
  private org.sensoris.types.base.CategoryEnvelope envelope_;
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  public boolean hasEnvelope() {
    return envelope_ != null;
  }
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  public org.sensoris.types.base.CategoryEnvelope getEnvelope() {
    return envelope_ == null ? org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
  }
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  public org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder() {
    return getEnvelope();
  }

  public static final int PRECIPITATION_FIELD_NUMBER = 2;
  private java.util.List<org.sensoris.categories.weather.Precipitation> precipitation_;
  /**
   * <pre>
   * Precipitation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
   */
  public java.util.List<org.sensoris.categories.weather.Precipitation> getPrecipitationList() {
    return precipitation_;
  }
  /**
   * <pre>
   * Precipitation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
   */
  public java.util.List<? extends org.sensoris.categories.weather.PrecipitationOrBuilder> 
      getPrecipitationOrBuilderList() {
    return precipitation_;
  }
  /**
   * <pre>
   * Precipitation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
   */
  public int getPrecipitationCount() {
    return precipitation_.size();
  }
  /**
   * <pre>
   * Precipitation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
   */
  public org.sensoris.categories.weather.Precipitation getPrecipitation(int index) {
    return precipitation_.get(index);
  }
  /**
   * <pre>
   * Precipitation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
   */
  public org.sensoris.categories.weather.PrecipitationOrBuilder getPrecipitationOrBuilder(
      int index) {
    return precipitation_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (envelope_ != null) {
      output.writeMessage(1, getEnvelope());
    }
    for (int i = 0; i < precipitation_.size(); i++) {
      output.writeMessage(2, precipitation_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (envelope_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnvelope());
    }
    for (int i = 0; i < precipitation_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, precipitation_.get(i));
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
    if (!(obj instanceof org.sensoris.categories.weather.WeatherCategory)) {
      return super.equals(obj);
    }
    org.sensoris.categories.weather.WeatherCategory other = (org.sensoris.categories.weather.WeatherCategory) obj;

    boolean result = true;
    result = result && (hasEnvelope() == other.hasEnvelope());
    if (hasEnvelope()) {
      result = result && getEnvelope()
          .equals(other.getEnvelope());
    }
    result = result && getPrecipitationList()
        .equals(other.getPrecipitationList());
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
    if (hasEnvelope()) {
      hash = (37 * hash) + ENVELOPE_FIELD_NUMBER;
      hash = (53 * hash) + getEnvelope().hashCode();
    }
    if (getPrecipitationCount() > 0) {
      hash = (37 * hash) + PRECIPITATION_FIELD_NUMBER;
      hash = (53 * hash) + getPrecipitationList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.categories.weather.WeatherCategory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.weather.WeatherCategory parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.sensoris.categories.weather.WeatherCategory prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Weather category.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.categories.weather.WeatherCategory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.categories.weather.WeatherCategory)
      org.sensoris.categories.weather.WeatherCategoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.categories.weather.SensorisWeatherCategory.internal_static_sensoris_protobuf_categories_weather_WeatherCategory_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.categories.weather.SensorisWeatherCategory.internal_static_sensoris_protobuf_categories_weather_WeatherCategory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.categories.weather.WeatherCategory.class, org.sensoris.categories.weather.WeatherCategory.Builder.class);
    }

    // Construct using org.sensoris.categories.weather.WeatherCategory.newBuilder()
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
        getPrecipitationFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (envelopeBuilder_ == null) {
        envelope_ = null;
      } else {
        envelope_ = null;
        envelopeBuilder_ = null;
      }
      if (precipitationBuilder_ == null) {
        precipitation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        precipitationBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.categories.weather.SensorisWeatherCategory.internal_static_sensoris_protobuf_categories_weather_WeatherCategory_descriptor;
    }

    public org.sensoris.categories.weather.WeatherCategory getDefaultInstanceForType() {
      return org.sensoris.categories.weather.WeatherCategory.getDefaultInstance();
    }

    public org.sensoris.categories.weather.WeatherCategory build() {
      org.sensoris.categories.weather.WeatherCategory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.sensoris.categories.weather.WeatherCategory buildPartial() {
      org.sensoris.categories.weather.WeatherCategory result = new org.sensoris.categories.weather.WeatherCategory(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (envelopeBuilder_ == null) {
        result.envelope_ = envelope_;
      } else {
        result.envelope_ = envelopeBuilder_.build();
      }
      if (precipitationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          precipitation_ = java.util.Collections.unmodifiableList(precipitation_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.precipitation_ = precipitation_;
      } else {
        result.precipitation_ = precipitationBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.sensoris.categories.weather.WeatherCategory) {
        return mergeFrom((org.sensoris.categories.weather.WeatherCategory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.categories.weather.WeatherCategory other) {
      if (other == org.sensoris.categories.weather.WeatherCategory.getDefaultInstance()) return this;
      if (other.hasEnvelope()) {
        mergeEnvelope(other.getEnvelope());
      }
      if (precipitationBuilder_ == null) {
        if (!other.precipitation_.isEmpty()) {
          if (precipitation_.isEmpty()) {
            precipitation_ = other.precipitation_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePrecipitationIsMutable();
            precipitation_.addAll(other.precipitation_);
          }
          onChanged();
        }
      } else {
        if (!other.precipitation_.isEmpty()) {
          if (precipitationBuilder_.isEmpty()) {
            precipitationBuilder_.dispose();
            precipitationBuilder_ = null;
            precipitation_ = other.precipitation_;
            bitField0_ = (bitField0_ & ~0x00000002);
            precipitationBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPrecipitationFieldBuilder() : null;
          } else {
            precipitationBuilder_.addAllMessages(other.precipitation_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.sensoris.categories.weather.WeatherCategory parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sensoris.categories.weather.WeatherCategory) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.sensoris.types.base.CategoryEnvelope envelope_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder> envelopeBuilder_;
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public boolean hasEnvelope() {
      return envelopeBuilder_ != null || envelope_ != null;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelope getEnvelope() {
      if (envelopeBuilder_ == null) {
        return envelope_ == null ? org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
      } else {
        return envelopeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder setEnvelope(org.sensoris.types.base.CategoryEnvelope value) {
      if (envelopeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        envelope_ = value;
        onChanged();
      } else {
        envelopeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder setEnvelope(
        org.sensoris.types.base.CategoryEnvelope.Builder builderForValue) {
      if (envelopeBuilder_ == null) {
        envelope_ = builderForValue.build();
        onChanged();
      } else {
        envelopeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder mergeEnvelope(org.sensoris.types.base.CategoryEnvelope value) {
      if (envelopeBuilder_ == null) {
        if (envelope_ != null) {
          envelope_ =
            org.sensoris.types.base.CategoryEnvelope.newBuilder(envelope_).mergeFrom(value).buildPartial();
        } else {
          envelope_ = value;
        }
        onChanged();
      } else {
        envelopeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder clearEnvelope() {
      if (envelopeBuilder_ == null) {
        envelope_ = null;
        onChanged();
      } else {
        envelope_ = null;
        envelopeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelope.Builder getEnvelopeBuilder() {
      
      onChanged();
      return getEnvelopeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder() {
      if (envelopeBuilder_ != null) {
        return envelopeBuilder_.getMessageOrBuilder();
      } else {
        return envelope_ == null ?
            org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
      }
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder> 
        getEnvelopeFieldBuilder() {
      if (envelopeBuilder_ == null) {
        envelopeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder>(
                getEnvelope(),
                getParentForChildren(),
                isClean());
        envelope_ = null;
      }
      return envelopeBuilder_;
    }

    private java.util.List<org.sensoris.categories.weather.Precipitation> precipitation_ =
      java.util.Collections.emptyList();
    private void ensurePrecipitationIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        precipitation_ = new java.util.ArrayList<org.sensoris.categories.weather.Precipitation>(precipitation_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.sensoris.categories.weather.Precipitation, org.sensoris.categories.weather.Precipitation.Builder, org.sensoris.categories.weather.PrecipitationOrBuilder> precipitationBuilder_;

    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public java.util.List<org.sensoris.categories.weather.Precipitation> getPrecipitationList() {
      if (precipitationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(precipitation_);
      } else {
        return precipitationBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public int getPrecipitationCount() {
      if (precipitationBuilder_ == null) {
        return precipitation_.size();
      } else {
        return precipitationBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public org.sensoris.categories.weather.Precipitation getPrecipitation(int index) {
      if (precipitationBuilder_ == null) {
        return precipitation_.get(index);
      } else {
        return precipitationBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public Builder setPrecipitation(
        int index, org.sensoris.categories.weather.Precipitation value) {
      if (precipitationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePrecipitationIsMutable();
        precipitation_.set(index, value);
        onChanged();
      } else {
        precipitationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public Builder setPrecipitation(
        int index, org.sensoris.categories.weather.Precipitation.Builder builderForValue) {
      if (precipitationBuilder_ == null) {
        ensurePrecipitationIsMutable();
        precipitation_.set(index, builderForValue.build());
        onChanged();
      } else {
        precipitationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public Builder addPrecipitation(org.sensoris.categories.weather.Precipitation value) {
      if (precipitationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePrecipitationIsMutable();
        precipitation_.add(value);
        onChanged();
      } else {
        precipitationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public Builder addPrecipitation(
        int index, org.sensoris.categories.weather.Precipitation value) {
      if (precipitationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePrecipitationIsMutable();
        precipitation_.add(index, value);
        onChanged();
      } else {
        precipitationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public Builder addPrecipitation(
        org.sensoris.categories.weather.Precipitation.Builder builderForValue) {
      if (precipitationBuilder_ == null) {
        ensurePrecipitationIsMutable();
        precipitation_.add(builderForValue.build());
        onChanged();
      } else {
        precipitationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public Builder addPrecipitation(
        int index, org.sensoris.categories.weather.Precipitation.Builder builderForValue) {
      if (precipitationBuilder_ == null) {
        ensurePrecipitationIsMutable();
        precipitation_.add(index, builderForValue.build());
        onChanged();
      } else {
        precipitationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public Builder addAllPrecipitation(
        java.lang.Iterable<? extends org.sensoris.categories.weather.Precipitation> values) {
      if (precipitationBuilder_ == null) {
        ensurePrecipitationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, precipitation_);
        onChanged();
      } else {
        precipitationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public Builder clearPrecipitation() {
      if (precipitationBuilder_ == null) {
        precipitation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        precipitationBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public Builder removePrecipitation(int index) {
      if (precipitationBuilder_ == null) {
        ensurePrecipitationIsMutable();
        precipitation_.remove(index);
        onChanged();
      } else {
        precipitationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public org.sensoris.categories.weather.Precipitation.Builder getPrecipitationBuilder(
        int index) {
      return getPrecipitationFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public org.sensoris.categories.weather.PrecipitationOrBuilder getPrecipitationOrBuilder(
        int index) {
      if (precipitationBuilder_ == null) {
        return precipitation_.get(index);  } else {
        return precipitationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public java.util.List<? extends org.sensoris.categories.weather.PrecipitationOrBuilder> 
         getPrecipitationOrBuilderList() {
      if (precipitationBuilder_ != null) {
        return precipitationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(precipitation_);
      }
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public org.sensoris.categories.weather.Precipitation.Builder addPrecipitationBuilder() {
      return getPrecipitationFieldBuilder().addBuilder(
          org.sensoris.categories.weather.Precipitation.getDefaultInstance());
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public org.sensoris.categories.weather.Precipitation.Builder addPrecipitationBuilder(
        int index) {
      return getPrecipitationFieldBuilder().addBuilder(
          index, org.sensoris.categories.weather.Precipitation.getDefaultInstance());
    }
    /**
     * <pre>
     * Precipitation.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
     */
    public java.util.List<org.sensoris.categories.weather.Precipitation.Builder> 
         getPrecipitationBuilderList() {
      return getPrecipitationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.sensoris.categories.weather.Precipitation, org.sensoris.categories.weather.Precipitation.Builder, org.sensoris.categories.weather.PrecipitationOrBuilder> 
        getPrecipitationFieldBuilder() {
      if (precipitationBuilder_ == null) {
        precipitationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.sensoris.categories.weather.Precipitation, org.sensoris.categories.weather.Precipitation.Builder, org.sensoris.categories.weather.PrecipitationOrBuilder>(
                precipitation_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        precipitation_ = null;
      }
      return precipitationBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.categories.weather.WeatherCategory)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.categories.weather.WeatherCategory)
  private static final org.sensoris.categories.weather.WeatherCategory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.categories.weather.WeatherCategory();
  }

  public static org.sensoris.categories.weather.WeatherCategory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeatherCategory>
      PARSER = new com.google.protobuf.AbstractParser<WeatherCategory>() {
    public WeatherCategory parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeatherCategory(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeatherCategory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeatherCategory> getParserForType() {
    return PARSER;
  }

  public org.sensoris.categories.weather.WeatherCategory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

