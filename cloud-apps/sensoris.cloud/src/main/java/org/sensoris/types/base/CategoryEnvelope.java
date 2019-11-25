// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

package org.sensoris.types.base;

/**
 * <pre>
 * Category envelope is the mandatory first field of each category.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.base.CategoryEnvelope}
 */
public  final class CategoryEnvelope extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.base.CategoryEnvelope)
    CategoryEnvelopeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CategoryEnvelope.newBuilder() to construct.
  private CategoryEnvelope(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CategoryEnvelope() {
    extension_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CategoryEnvelope(
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
          case 122: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              extension_ = new java.util.ArrayList<com.google.protobuf.Any>();
              mutable_bitField0_ |= 0x00000001;
            }
            extension_.add(
                input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry));
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
        extension_ = java.util.Collections.unmodifiableList(extension_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_CategoryEnvelope_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_CategoryEnvelope_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.base.CategoryEnvelope.class, org.sensoris.types.base.CategoryEnvelope.Builder.class);
  }

  public static final int EXTENSION_FIELD_NUMBER = 15;
  private java.util.List<com.google.protobuf.Any> extension_;
  /**
   * <pre>
   * Proprietary extension.
   * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  public java.util.List<com.google.protobuf.Any> getExtensionList() {
    return extension_;
  }
  /**
   * <pre>
   * Proprietary extension.
   * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getExtensionOrBuilderList() {
    return extension_;
  }
  /**
   * <pre>
   * Proprietary extension.
   * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  public int getExtensionCount() {
    return extension_.size();
  }
  /**
   * <pre>
   * Proprietary extension.
   * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  public com.google.protobuf.Any getExtension(int index) {
    return extension_.get(index);
  }
  /**
   * <pre>
   * Proprietary extension.
   * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  public com.google.protobuf.AnyOrBuilder getExtensionOrBuilder(
      int index) {
    return extension_.get(index);
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
    for (int i = 0; i < extension_.size(); i++) {
      output.writeMessage(15, extension_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < extension_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(15, extension_.get(i));
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
    if (!(obj instanceof org.sensoris.types.base.CategoryEnvelope)) {
      return super.equals(obj);
    }
    org.sensoris.types.base.CategoryEnvelope other = (org.sensoris.types.base.CategoryEnvelope) obj;

    boolean result = true;
    result = result && getExtensionList()
        .equals(other.getExtensionList());
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
    if (getExtensionCount() > 0) {
      hash = (37 * hash) + EXTENSION_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.base.CategoryEnvelope parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.CategoryEnvelope parseFrom(
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
  public static Builder newBuilder(org.sensoris.types.base.CategoryEnvelope prototype) {
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
   * Category envelope is the mandatory first field of each category.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.base.CategoryEnvelope}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.base.CategoryEnvelope)
      org.sensoris.types.base.CategoryEnvelopeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_CategoryEnvelope_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_CategoryEnvelope_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.base.CategoryEnvelope.class, org.sensoris.types.base.CategoryEnvelope.Builder.class);
    }

    // Construct using org.sensoris.types.base.CategoryEnvelope.newBuilder()
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
        getExtensionFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (extensionBuilder_ == null) {
        extension_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        extensionBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_CategoryEnvelope_descriptor;
    }

    public org.sensoris.types.base.CategoryEnvelope getDefaultInstanceForType() {
      return org.sensoris.types.base.CategoryEnvelope.getDefaultInstance();
    }

    public org.sensoris.types.base.CategoryEnvelope build() {
      org.sensoris.types.base.CategoryEnvelope result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.sensoris.types.base.CategoryEnvelope buildPartial() {
      org.sensoris.types.base.CategoryEnvelope result = new org.sensoris.types.base.CategoryEnvelope(this);
      int from_bitField0_ = bitField0_;
      if (extensionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          extension_ = java.util.Collections.unmodifiableList(extension_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.extension_ = extension_;
      } else {
        result.extension_ = extensionBuilder_.build();
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
      if (other instanceof org.sensoris.types.base.CategoryEnvelope) {
        return mergeFrom((org.sensoris.types.base.CategoryEnvelope)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.base.CategoryEnvelope other) {
      if (other == org.sensoris.types.base.CategoryEnvelope.getDefaultInstance()) return this;
      if (extensionBuilder_ == null) {
        if (!other.extension_.isEmpty()) {
          if (extension_.isEmpty()) {
            extension_ = other.extension_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExtensionIsMutable();
            extension_.addAll(other.extension_);
          }
          onChanged();
        }
      } else {
        if (!other.extension_.isEmpty()) {
          if (extensionBuilder_.isEmpty()) {
            extensionBuilder_.dispose();
            extensionBuilder_ = null;
            extension_ = other.extension_;
            bitField0_ = (bitField0_ & ~0x00000001);
            extensionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExtensionFieldBuilder() : null;
          } else {
            extensionBuilder_.addAllMessages(other.extension_);
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
      org.sensoris.types.base.CategoryEnvelope parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sensoris.types.base.CategoryEnvelope) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.Any> extension_ =
      java.util.Collections.emptyList();
    private void ensureExtensionIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        extension_ = new java.util.ArrayList<com.google.protobuf.Any>(extension_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> extensionBuilder_;

    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public java.util.List<com.google.protobuf.Any> getExtensionList() {
      if (extensionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(extension_);
      } else {
        return extensionBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public int getExtensionCount() {
      if (extensionBuilder_ == null) {
        return extension_.size();
      } else {
        return extensionBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public com.google.protobuf.Any getExtension(int index) {
      if (extensionBuilder_ == null) {
        return extension_.get(index);
      } else {
        return extensionBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public Builder setExtension(
        int index, com.google.protobuf.Any value) {
      if (extensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionIsMutable();
        extension_.set(index, value);
        onChanged();
      } else {
        extensionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public Builder setExtension(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.set(index, builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public Builder addExtension(com.google.protobuf.Any value) {
      if (extensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionIsMutable();
        extension_.add(value);
        onChanged();
      } else {
        extensionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public Builder addExtension(
        int index, com.google.protobuf.Any value) {
      if (extensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionIsMutable();
        extension_.add(index, value);
        onChanged();
      } else {
        extensionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public Builder addExtension(
        com.google.protobuf.Any.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.add(builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public Builder addExtension(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.add(index, builderForValue.build());
        onChanged();
      } else {
        extensionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public Builder addAllExtension(
        java.lang.Iterable<? extends com.google.protobuf.Any> values) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, extension_);
        onChanged();
      } else {
        extensionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public Builder clearExtension() {
      if (extensionBuilder_ == null) {
        extension_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        extensionBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public Builder removeExtension(int index) {
      if (extensionBuilder_ == null) {
        ensureExtensionIsMutable();
        extension_.remove(index);
        onChanged();
      } else {
        extensionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public com.google.protobuf.Any.Builder getExtensionBuilder(
        int index) {
      return getExtensionFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public com.google.protobuf.AnyOrBuilder getExtensionOrBuilder(
        int index) {
      if (extensionBuilder_ == null) {
        return extension_.get(index);  } else {
        return extensionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
         getExtensionOrBuilderList() {
      if (extensionBuilder_ != null) {
        return extensionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(extension_);
      }
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public com.google.protobuf.Any.Builder addExtensionBuilder() {
      return getExtensionFieldBuilder().addBuilder(
          com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public com.google.protobuf.Any.Builder addExtensionBuilder(
        int index) {
      return getExtensionFieldBuilder().addBuilder(
          index, com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <pre>
     * Proprietary extension.
     * A category proprietary extension provides an additional event type, that is not part of the SENSORIS specification.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extension = 15;</code>
     */
    public java.util.List<com.google.protobuf.Any.Builder> 
         getExtensionBuilderList() {
      return getExtensionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getExtensionFieldBuilder() {
      if (extensionBuilder_ == null) {
        extensionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                extension_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        extension_ = null;
      }
      return extensionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.base.CategoryEnvelope)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.base.CategoryEnvelope)
  private static final org.sensoris.types.base.CategoryEnvelope DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.base.CategoryEnvelope();
  }

  public static org.sensoris.types.base.CategoryEnvelope getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CategoryEnvelope>
      PARSER = new com.google.protobuf.AbstractParser<CategoryEnvelope>() {
    public CategoryEnvelope parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CategoryEnvelope(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CategoryEnvelope> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CategoryEnvelope> getParserForType() {
    return PARSER;
  }

  public org.sensoris.types.base.CategoryEnvelope getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

