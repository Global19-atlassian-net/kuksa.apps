// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/road_attribution.proto

package org.sensoris.categories.roadattribution;

public interface RoadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.roadattribution.Road)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelope getEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Width and accuracy.
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy width_and_accuracy = 2;</code>
   */
  boolean hasWidthAndAccuracy();
  /**
   * <pre>
   * Width and accuracy.
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy width_and_accuracy = 2;</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getWidthAndAccuracy();
  /**
   * <pre>
   * Width and accuracy.
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy width_and_accuracy = 2;</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getWidthAndAccuracyOrBuilder();

  /**
   * <pre>
   * Inclination and curvature.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.InclinationAndCurvature inclination_and_curvature = 3;</code>
   */
  boolean hasInclinationAndCurvature();
  /**
   * <pre>
   * Inclination and curvature.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.InclinationAndCurvature inclination_and_curvature = 3;</code>
   */
  org.sensoris.categories.roadattribution.InclinationAndCurvature getInclinationAndCurvature();
  /**
   * <pre>
   * Inclination and curvature.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.InclinationAndCurvature inclination_and_curvature = 3;</code>
   */
  org.sensoris.categories.roadattribution.InclinationAndCurvatureOrBuilder getInclinationAndCurvatureOrBuilder();
}
