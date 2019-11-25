// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/source.proto

package org.sensoris.types.source;

/**
 * <pre>
 * Sensor fusion.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.source.SensorFusion}
 */
public  final class SensorFusion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.source.SensorFusion)
    SensorFusionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SensorFusion.newBuilder() to construct.
  private SensorFusion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SensorFusion() {
    sensorId_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SensorFusion(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              sensorId_ = new java.util.ArrayList<com.google.protobuf.Int64Value>();
              mutable_bitField0_ |= 0x00000001;
            }
            sensorId_.add(
                input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        sensorId_ = java.util.Collections.unmodifiableList(sensorId_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.types.source.SensorisSourceTypes.internal_static_sensoris_protobuf_types_source_SensorFusion_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.source.SensorisSourceTypes.internal_static_sensoris_protobuf_types_source_SensorFusion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.source.SensorFusion.class, org.sensoris.types.source.SensorFusion.Builder.class);
  }

  public static final int SENSOR_ID_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.Int64Value> sensorId_;
  /**
   * <pre>
   * Fused sensors referenced by their Source.id.
   * </pre>
   *
   * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
   */
  public java.util.List<com.google.protobuf.Int64Value> getSensorIdList() {
    return sensorId_;
  }
  /**
   * <pre>
   * Fused sensors referenced by their Source.id.
   * </pre>
   *
   * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
   */
  public java.util.List<? extends com.google.protobuf.Int64ValueOrBuilder> 
      getSensorIdOrBuilderList() {
    return sensorId_;
  }
  /**
   * <pre>
   * Fused sensors referenced by their Source.id.
   * </pre>
   *
   * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
   */
  public int getSensorIdCount() {
    return sensorId_.size();
  }
  /**
   * <pre>
   * Fused sensors referenced by their Source.id.
   * </pre>
   *
   * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
   */
  public com.google.protobuf.Int64Value getSensorId(int index) {
    return sensorId_.get(index);
  }
  /**
   * <pre>
   * Fused sensors referenced by their Source.id.
   * </pre>
   *
   * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getSensorIdOrBuilder(
      int index) {
    return sensorId_.get(index);
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
    for (int i = 0; i < sensorId_.size(); i++) {
      output.writeMessage(1, sensorId_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sensorId_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, sensorId_.get(i));
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
    if (!(obj instanceof org.sensoris.types.source.SensorFusion)) {
      return super.equals(obj);
    }
    org.sensoris.types.source.SensorFusion other = (org.sensoris.types.source.SensorFusion) obj;

    boolean result = true;
    result = result && getSensorIdList()
        .equals(other.getSensorIdList());
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
    if (getSensorIdCount() > 0) {
      hash = (37 * hash) + SENSOR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSensorIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.source.SensorFusion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.source.SensorFusion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.source.SensorFusion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.source.SensorFusion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.source.SensorFusion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.source.SensorFusion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.source.SensorFusion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.source.SensorFusion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.source.SensorFusion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sensoris.types.source.SensorFusion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.source.SensorFusion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.source.SensorFusion parseFrom(
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
  public static Builder newBuilder(org.sensoris.types.source.SensorFusion prototype) {
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
   * Sensor fusion.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.source.SensorFusion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.source.SensorFusion)
      org.sensoris.types.source.SensorFusionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.source.SensorisSourceTypes.internal_static_sensoris_protobuf_types_source_SensorFusion_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.source.SensorisSourceTypes.internal_static_sensoris_protobuf_types_source_SensorFusion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.source.SensorFusion.class, org.sensoris.types.source.SensorFusion.Builder.class);
    }

    // Construct using org.sensoris.types.source.SensorFusion.newBuilder()
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
        getSensorIdFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (sensorIdBuilder_ == null) {
        sensorId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        sensorIdBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.source.SensorisSourceTypes.internal_static_sensoris_protobuf_types_source_SensorFusion_descriptor;
    }

    public org.sensoris.types.source.SensorFusion getDefaultInstanceForType() {
      return org.sensoris.types.source.SensorFusion.getDefaultInstance();
    }

    public org.sensoris.types.source.SensorFusion build() {
      org.sensoris.types.source.SensorFusion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.sensoris.types.source.SensorFusion buildPartial() {
      org.sensoris.types.source.SensorFusion result = new org.sensoris.types.source.SensorFusion(this);
      int from_bitField0_ = bitField0_;
      if (sensorIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          sensorId_ = java.util.Collections.unmodifiableList(sensorId_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sensorId_ = sensorId_;
      } else {
        result.sensorId_ = sensorIdBuilder_.build();
      }
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
      if (other instanceof org.sensoris.types.source.SensorFusion) {
        return mergeFrom((org.sensoris.types.source.SensorFusion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.source.SensorFusion other) {
      if (other == org.sensoris.types.source.SensorFusion.getDefaultInstance()) return this;
      if (sensorIdBuilder_ == null) {
        if (!other.sensorId_.isEmpty()) {
          if (sensorId_.isEmpty()) {
            sensorId_ = other.sensorId_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSensorIdIsMutable();
            sensorId_.addAll(other.sensorId_);
          }
          onChanged();
        }
      } else {
        if (!other.sensorId_.isEmpty()) {
          if (sensorIdBuilder_.isEmpty()) {
            sensorIdBuilder_.dispose();
            sensorIdBuilder_ = null;
            sensorId_ = other.sensorId_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sensorIdBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSensorIdFieldBuilder() : null;
          } else {
            sensorIdBuilder_.addAllMessages(other.sensorId_);
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
      org.sensoris.types.source.SensorFusion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sensoris.types.source.SensorFusion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.Int64Value> sensorId_ =
      java.util.Collections.emptyList();
    private void ensureSensorIdIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        sensorId_ = new java.util.ArrayList<com.google.protobuf.Int64Value>(sensorId_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> sensorIdBuilder_;

    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public java.util.List<com.google.protobuf.Int64Value> getSensorIdList() {
      if (sensorIdBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sensorId_);
      } else {
        return sensorIdBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public int getSensorIdCount() {
      if (sensorIdBuilder_ == null) {
        return sensorId_.size();
      } else {
        return sensorIdBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public com.google.protobuf.Int64Value getSensorId(int index) {
      if (sensorIdBuilder_ == null) {
        return sensorId_.get(index);
      } else {
        return sensorIdBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public Builder setSensorId(
        int index, com.google.protobuf.Int64Value value) {
      if (sensorIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSensorIdIsMutable();
        sensorId_.set(index, value);
        onChanged();
      } else {
        sensorIdBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public Builder setSensorId(
        int index, com.google.protobuf.Int64Value.Builder builderForValue) {
      if (sensorIdBuilder_ == null) {
        ensureSensorIdIsMutable();
        sensorId_.set(index, builderForValue.build());
        onChanged();
      } else {
        sensorIdBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public Builder addSensorId(com.google.protobuf.Int64Value value) {
      if (sensorIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSensorIdIsMutable();
        sensorId_.add(value);
        onChanged();
      } else {
        sensorIdBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public Builder addSensorId(
        int index, com.google.protobuf.Int64Value value) {
      if (sensorIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSensorIdIsMutable();
        sensorId_.add(index, value);
        onChanged();
      } else {
        sensorIdBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public Builder addSensorId(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (sensorIdBuilder_ == null) {
        ensureSensorIdIsMutable();
        sensorId_.add(builderForValue.build());
        onChanged();
      } else {
        sensorIdBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public Builder addSensorId(
        int index, com.google.protobuf.Int64Value.Builder builderForValue) {
      if (sensorIdBuilder_ == null) {
        ensureSensorIdIsMutable();
        sensorId_.add(index, builderForValue.build());
        onChanged();
      } else {
        sensorIdBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public Builder addAllSensorId(
        java.lang.Iterable<? extends com.google.protobuf.Int64Value> values) {
      if (sensorIdBuilder_ == null) {
        ensureSensorIdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sensorId_);
        onChanged();
      } else {
        sensorIdBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public Builder clearSensorId() {
      if (sensorIdBuilder_ == null) {
        sensorId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sensorIdBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public Builder removeSensorId(int index) {
      if (sensorIdBuilder_ == null) {
        ensureSensorIdIsMutable();
        sensorId_.remove(index);
        onChanged();
      } else {
        sensorIdBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getSensorIdBuilder(
        int index) {
      return getSensorIdFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getSensorIdOrBuilder(
        int index) {
      if (sensorIdBuilder_ == null) {
        return sensorId_.get(index);  } else {
        return sensorIdBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public java.util.List<? extends com.google.protobuf.Int64ValueOrBuilder> 
         getSensorIdOrBuilderList() {
      if (sensorIdBuilder_ != null) {
        return sensorIdBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sensorId_);
      }
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder addSensorIdBuilder() {
      return getSensorIdFieldBuilder().addBuilder(
          com.google.protobuf.Int64Value.getDefaultInstance());
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder addSensorIdBuilder(
        int index) {
      return getSensorIdFieldBuilder().addBuilder(
          index, com.google.protobuf.Int64Value.getDefaultInstance());
    }
    /**
     * <pre>
     * Fused sensors referenced by their Source.id.
     * </pre>
     *
     * <code>repeated .google.protobuf.Int64Value sensor_id = 1;</code>
     */
    public java.util.List<com.google.protobuf.Int64Value.Builder> 
         getSensorIdBuilderList() {
      return getSensorIdFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getSensorIdFieldBuilder() {
      if (sensorIdBuilder_ == null) {
        sensorIdBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                sensorId_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        sensorId_ = null;
      }
      return sensorIdBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.source.SensorFusion)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.source.SensorFusion)
  private static final org.sensoris.types.source.SensorFusion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.source.SensorFusion();
  }

  public static org.sensoris.types.source.SensorFusion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SensorFusion>
      PARSER = new com.google.protobuf.AbstractParser<SensorFusion>() {
    public SensorFusion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SensorFusion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SensorFusion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SensorFusion> getParserForType() {
    return PARSER;
  }

  public org.sensoris.types.source.SensorFusion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

