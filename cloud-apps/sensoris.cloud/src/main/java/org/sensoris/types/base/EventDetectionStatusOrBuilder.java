// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

package org.sensoris.types.base;

public interface EventDetectionStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.EventDetectionStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus.Type type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus.Type type = 1;</code>
   */
  org.sensoris.types.base.EventDetectionStatus.Type getType();

  /**
   * <pre>
   * Confidence of type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   */
  boolean hasConfidence();
  /**
   * <pre>
   * Confidence of type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   */
  org.sensoris.types.base.Confidence getConfidence();
  /**
   * <pre>
   * Confidence of type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   */
  org.sensoris.types.base.ConfidenceOrBuilder getConfidenceOrBuilder();
}
