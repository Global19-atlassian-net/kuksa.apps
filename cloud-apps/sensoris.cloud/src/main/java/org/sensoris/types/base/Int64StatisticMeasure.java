// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

package org.sensoris.types.base;

/**
 * <pre>
 * Statistic measure of int64 value.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.base.Int64StatisticMeasure}
 */
public  final class Int64StatisticMeasure extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.base.Int64StatisticMeasure)
    Int64StatisticMeasureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Int64StatisticMeasure.newBuilder() to construct.
  private Int64StatisticMeasure(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Int64StatisticMeasure() {
    type_ = 0;
    value_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Int64StatisticMeasure(
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
            org.sensoris.types.base.TimestampInterval.Builder subBuilder = null;
            if (timestampInterval_ != null) {
              subBuilder = timestampInterval_.toBuilder();
            }
            timestampInterval_ = input.readMessage(org.sensoris.types.base.TimestampInterval.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(timestampInterval_);
              timestampInterval_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 24: {

            value_ = input.readInt64();
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
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasure_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.base.Int64StatisticMeasure.class, org.sensoris.types.base.Int64StatisticMeasure.Builder.class);
  }

  public static final int TIMESTAMP_INTERVAL_FIELD_NUMBER = 1;
  private org.sensoris.types.base.TimestampInterval timestampInterval_;
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  public boolean hasTimestampInterval() {
    return timestampInterval_ != null;
  }
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  public org.sensoris.types.base.TimestampInterval getTimestampInterval() {
    return timestampInterval_ == null ? org.sensoris.types.base.TimestampInterval.getDefaultInstance() : timestampInterval_;
  }
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  public org.sensoris.types.base.TimestampIntervalOrBuilder getTimestampIntervalOrBuilder() {
    return getTimestampInterval();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
   */
  public org.sensoris.types.base.StatisticMeasureType getType() {
    org.sensoris.types.base.StatisticMeasureType result = org.sensoris.types.base.StatisticMeasureType.valueOf(type_);
    return result == null ? org.sensoris.types.base.StatisticMeasureType.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private long value_;
  /**
   * <pre>
   * Value.
   * </pre>
   *
   * <code>int64 value = 3;</code>
   */
  public long getValue() {
    return value_;
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
    if (timestampInterval_ != null) {
      output.writeMessage(1, getTimestampInterval());
    }
    if (type_ != org.sensoris.types.base.StatisticMeasureType.UNKNOWN_STATISTIC_MEASURE_TYPE.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (value_ != 0L) {
      output.writeInt64(3, value_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestampInterval_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimestampInterval());
    }
    if (type_ != org.sensoris.types.base.StatisticMeasureType.UNKNOWN_STATISTIC_MEASURE_TYPE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, value_);
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
    if (!(obj instanceof org.sensoris.types.base.Int64StatisticMeasure)) {
      return super.equals(obj);
    }
    org.sensoris.types.base.Int64StatisticMeasure other = (org.sensoris.types.base.Int64StatisticMeasure) obj;

    boolean result = true;
    result = result && (hasTimestampInterval() == other.hasTimestampInterval());
    if (hasTimestampInterval()) {
      result = result && getTimestampInterval()
          .equals(other.getTimestampInterval());
    }
    result = result && type_ == other.type_;
    result = result && (getValue()
        == other.getValue());
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
    if (hasTimestampInterval()) {
      hash = (37 * hash) + TIMESTAMP_INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getTimestampInterval().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.base.Int64StatisticMeasure parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Int64StatisticMeasure parseFrom(
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
  public static Builder newBuilder(org.sensoris.types.base.Int64StatisticMeasure prototype) {
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
   * Statistic measure of int64 value.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.base.Int64StatisticMeasure}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.base.Int64StatisticMeasure)
      org.sensoris.types.base.Int64StatisticMeasureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasure_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasure_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.base.Int64StatisticMeasure.class, org.sensoris.types.base.Int64StatisticMeasure.Builder.class);
    }

    // Construct using org.sensoris.types.base.Int64StatisticMeasure.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (timestampIntervalBuilder_ == null) {
        timestampInterval_ = null;
      } else {
        timestampInterval_ = null;
        timestampIntervalBuilder_ = null;
      }
      type_ = 0;

      value_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasure_descriptor;
    }

    public org.sensoris.types.base.Int64StatisticMeasure getDefaultInstanceForType() {
      return org.sensoris.types.base.Int64StatisticMeasure.getDefaultInstance();
    }

    public org.sensoris.types.base.Int64StatisticMeasure build() {
      org.sensoris.types.base.Int64StatisticMeasure result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.sensoris.types.base.Int64StatisticMeasure buildPartial() {
      org.sensoris.types.base.Int64StatisticMeasure result = new org.sensoris.types.base.Int64StatisticMeasure(this);
      if (timestampIntervalBuilder_ == null) {
        result.timestampInterval_ = timestampInterval_;
      } else {
        result.timestampInterval_ = timestampIntervalBuilder_.build();
      }
      result.type_ = type_;
      result.value_ = value_;
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
      if (other instanceof org.sensoris.types.base.Int64StatisticMeasure) {
        return mergeFrom((org.sensoris.types.base.Int64StatisticMeasure)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.base.Int64StatisticMeasure other) {
      if (other == org.sensoris.types.base.Int64StatisticMeasure.getDefaultInstance()) return this;
      if (other.hasTimestampInterval()) {
        mergeTimestampInterval(other.getTimestampInterval());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getValue() != 0L) {
        setValue(other.getValue());
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
      org.sensoris.types.base.Int64StatisticMeasure parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sensoris.types.base.Int64StatisticMeasure) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.sensoris.types.base.TimestampInterval timestampInterval_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.TimestampInterval, org.sensoris.types.base.TimestampInterval.Builder, org.sensoris.types.base.TimestampIntervalOrBuilder> timestampIntervalBuilder_;
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public boolean hasTimestampInterval() {
      return timestampIntervalBuilder_ != null || timestampInterval_ != null;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public org.sensoris.types.base.TimestampInterval getTimestampInterval() {
      if (timestampIntervalBuilder_ == null) {
        return timestampInterval_ == null ? org.sensoris.types.base.TimestampInterval.getDefaultInstance() : timestampInterval_;
      } else {
        return timestampIntervalBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder setTimestampInterval(org.sensoris.types.base.TimestampInterval value) {
      if (timestampIntervalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestampInterval_ = value;
        onChanged();
      } else {
        timestampIntervalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder setTimestampInterval(
        org.sensoris.types.base.TimestampInterval.Builder builderForValue) {
      if (timestampIntervalBuilder_ == null) {
        timestampInterval_ = builderForValue.build();
        onChanged();
      } else {
        timestampIntervalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder mergeTimestampInterval(org.sensoris.types.base.TimestampInterval value) {
      if (timestampIntervalBuilder_ == null) {
        if (timestampInterval_ != null) {
          timestampInterval_ =
            org.sensoris.types.base.TimestampInterval.newBuilder(timestampInterval_).mergeFrom(value).buildPartial();
        } else {
          timestampInterval_ = value;
        }
        onChanged();
      } else {
        timestampIntervalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder clearTimestampInterval() {
      if (timestampIntervalBuilder_ == null) {
        timestampInterval_ = null;
        onChanged();
      } else {
        timestampInterval_ = null;
        timestampIntervalBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public org.sensoris.types.base.TimestampInterval.Builder getTimestampIntervalBuilder() {
      
      onChanged();
      return getTimestampIntervalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public org.sensoris.types.base.TimestampIntervalOrBuilder getTimestampIntervalOrBuilder() {
      if (timestampIntervalBuilder_ != null) {
        return timestampIntervalBuilder_.getMessageOrBuilder();
      } else {
        return timestampInterval_ == null ?
            org.sensoris.types.base.TimestampInterval.getDefaultInstance() : timestampInterval_;
      }
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.TimestampInterval, org.sensoris.types.base.TimestampInterval.Builder, org.sensoris.types.base.TimestampIntervalOrBuilder> 
        getTimestampIntervalFieldBuilder() {
      if (timestampIntervalBuilder_ == null) {
        timestampIntervalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.TimestampInterval, org.sensoris.types.base.TimestampInterval.Builder, org.sensoris.types.base.TimestampIntervalOrBuilder>(
                getTimestampInterval(),
                getParentForChildren(),
                isClean());
        timestampInterval_ = null;
      }
      return timestampIntervalBuilder_;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     */
    public org.sensoris.types.base.StatisticMeasureType getType() {
      org.sensoris.types.base.StatisticMeasureType result = org.sensoris.types.base.StatisticMeasureType.valueOf(type_);
      return result == null ? org.sensoris.types.base.StatisticMeasureType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     */
    public Builder setType(org.sensoris.types.base.StatisticMeasureType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private long value_ ;
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>int64 value = 3;</code>
     */
    public long getValue() {
      return value_;
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>int64 value = 3;</code>
     */
    public Builder setValue(long value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>int64 value = 3;</code>
     */
    public Builder clearValue() {
      
      value_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.base.Int64StatisticMeasure)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.base.Int64StatisticMeasure)
  private static final org.sensoris.types.base.Int64StatisticMeasure DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.base.Int64StatisticMeasure();
  }

  public static org.sensoris.types.base.Int64StatisticMeasure getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Int64StatisticMeasure>
      PARSER = new com.google.protobuf.AbstractParser<Int64StatisticMeasure>() {
    public Int64StatisticMeasure parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Int64StatisticMeasure(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Int64StatisticMeasure> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Int64StatisticMeasure> getParserForType() {
    return PARSER;
  }

  public org.sensoris.types.base.Int64StatisticMeasure getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

