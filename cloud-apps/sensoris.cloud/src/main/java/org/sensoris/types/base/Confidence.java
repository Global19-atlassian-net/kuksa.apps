// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

package org.sensoris.types.base;

/**
 * <pre>
 * Confidence.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.base.Confidence}
 */
public  final class Confidence extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.base.Confidence)
    ConfidenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Confidence.newBuilder() to construct.
  private Confidence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Confidence() {
    value_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Confidence(
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
          case 8: {

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
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Confidence_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Confidence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.base.Confidence.class, org.sensoris.types.base.Confidence.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private long value_;
  /**
   * <pre>
   * Value.
   * &#64;unit Percent
   * &#64;resolution 1
   * &#64;range (0, 100]
   * </pre>
   *
   * <code>int64 value = 1 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
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
    if (value_ != 0L) {
      output.writeInt64(1, value_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, value_);
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
    if (!(obj instanceof org.sensoris.types.base.Confidence)) {
      return super.equals(obj);
    }
    org.sensoris.types.base.Confidence other = (org.sensoris.types.base.Confidence) obj;

    boolean result = true;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.base.Confidence parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Confidence parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Confidence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Confidence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Confidence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Confidence parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Confidence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Confidence parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.Confidence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Confidence parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.Confidence parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Confidence parseFrom(
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
  public static Builder newBuilder(org.sensoris.types.base.Confidence prototype) {
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
   * Confidence.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.base.Confidence}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.base.Confidence)
      org.sensoris.types.base.ConfidenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Confidence_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Confidence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.base.Confidence.class, org.sensoris.types.base.Confidence.Builder.class);
    }

    // Construct using org.sensoris.types.base.Confidence.newBuilder()
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
      value_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Confidence_descriptor;
    }

    public org.sensoris.types.base.Confidence getDefaultInstanceForType() {
      return org.sensoris.types.base.Confidence.getDefaultInstance();
    }

    public org.sensoris.types.base.Confidence build() {
      org.sensoris.types.base.Confidence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.sensoris.types.base.Confidence buildPartial() {
      org.sensoris.types.base.Confidence result = new org.sensoris.types.base.Confidence(this);
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
      if (other instanceof org.sensoris.types.base.Confidence) {
        return mergeFrom((org.sensoris.types.base.Confidence)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.base.Confidence other) {
      if (other == org.sensoris.types.base.Confidence.getDefaultInstance()) return this;
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
      org.sensoris.types.base.Confidence parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sensoris.types.base.Confidence) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long value_ ;
    /**
     * <pre>
     * Value.
     * &#64;unit Percent
     * &#64;resolution 1
     * &#64;range (0, 100]
     * </pre>
     *
     * <code>int64 value = 1 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     */
    public long getValue() {
      return value_;
    }
    /**
     * <pre>
     * Value.
     * &#64;unit Percent
     * &#64;resolution 1
     * &#64;range (0, 100]
     * </pre>
     *
     * <code>int64 value = 1 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     */
    public Builder setValue(long value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value.
     * &#64;unit Percent
     * &#64;resolution 1
     * &#64;range (0, 100]
     * </pre>
     *
     * <code>int64 value = 1 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
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


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.base.Confidence)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.base.Confidence)
  private static final org.sensoris.types.base.Confidence DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.base.Confidence();
  }

  public static org.sensoris.types.base.Confidence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Confidence>
      PARSER = new com.google.protobuf.AbstractParser<Confidence>() {
    public Confidence parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Confidence(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Confidence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Confidence> getParserForType() {
    return PARSER;
  }

  public org.sensoris.types.base.Confidence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

