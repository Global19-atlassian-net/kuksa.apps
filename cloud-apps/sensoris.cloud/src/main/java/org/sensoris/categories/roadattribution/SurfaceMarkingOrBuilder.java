// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/road_attribution.proto

package org.sensoris.categories.roadattribution;

public interface SurfaceMarkingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.roadattribution.SurfaceMarking)
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
   * Confidence that a surface marking has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 2;</code>
   */
  boolean hasExistenceConfidence();
  /**
   * <pre>
   * Confidence that a surface marking has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 2;</code>
   */
  org.sensoris.types.base.Confidence getExistenceConfidence();
  /**
   * <pre>
   * Confidence that a surface marking has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 2;</code>
   */
  org.sensoris.types.base.ConfidenceOrBuilder getExistenceConfidenceOrBuilder();

  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 3;</code>
   */
  boolean hasDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 3;</code>
   */
  org.sensoris.types.base.EventDetectionStatus getDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 3;</code>
   */
  org.sensoris.types.base.EventDetectionStatusOrBuilder getDetectionStatusOrBuilder();

  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.SurfaceMarking.TypeAndConfidence type_and_confidence = 4;</code>
   */
  boolean hasTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.SurfaceMarking.TypeAndConfidence type_and_confidence = 4;</code>
   */
  org.sensoris.categories.roadattribution.SurfaceMarking.TypeAndConfidence getTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.SurfaceMarking.TypeAndConfidence type_and_confidence = 4;</code>
   */
  org.sensoris.categories.roadattribution.SurfaceMarking.TypeAndConfidenceOrBuilder getTypeAndConfidenceOrBuilder();

  /**
   * <pre>
   * Text on the surface if detailed specification is required additional to type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 5;</code>
   */
  boolean hasText();
  /**
   * <pre>
   * Text on the surface if detailed specification is required additional to type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 5;</code>
   */
  com.google.protobuf.StringValue getText();
  /**
   * <pre>
   * Text on the surface if detailed specification is required additional to type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * Marking color and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence color_and_confidence = 6;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.MarkingColorAndConfidence> 
      getColorAndConfidenceList();
  /**
   * <pre>
   * Marking color and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence color_and_confidence = 6;</code>
   */
  org.sensoris.categories.roadattribution.MarkingColorAndConfidence getColorAndConfidence(int index);
  /**
   * <pre>
   * Marking color and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence color_and_confidence = 6;</code>
   */
  int getColorAndConfidenceCount();
  /**
   * <pre>
   * Marking color and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence color_and_confidence = 6;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.MarkingColorAndConfidenceOrBuilder> 
      getColorAndConfidenceOrBuilderList();
  /**
   * <pre>
   * Marking color and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence color_and_confidence = 6;</code>
   */
  org.sensoris.categories.roadattribution.MarkingColorAndConfidenceOrBuilder getColorAndConfidenceOrBuilder(
      int index);

  /**
   * <pre>
   * Marking material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.MarkingMaterialAndConfidence material_and_confidence = 7;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.MarkingMaterialAndConfidence> 
      getMaterialAndConfidenceList();
  /**
   * <pre>
   * Marking material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.MarkingMaterialAndConfidence material_and_confidence = 7;</code>
   */
  org.sensoris.categories.roadattribution.MarkingMaterialAndConfidence getMaterialAndConfidence(int index);
  /**
   * <pre>
   * Marking material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.MarkingMaterialAndConfidence material_and_confidence = 7;</code>
   */
  int getMaterialAndConfidenceCount();
  /**
   * <pre>
   * Marking material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.MarkingMaterialAndConfidence material_and_confidence = 7;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.MarkingMaterialAndConfidenceOrBuilder> 
      getMaterialAndConfidenceOrBuilderList();
  /**
   * <pre>
   * Marking material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.MarkingMaterialAndConfidence material_and_confidence = 7;</code>
   */
  org.sensoris.categories.roadattribution.MarkingMaterialAndConfidenceOrBuilder getMaterialAndConfidenceOrBuilder(
      int index);

  /**
   * <pre>
   * Rectangular box and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RectangularBoxAndAccuracy rectangular_box_and_accuracy = 8;</code>
   */
  boolean hasRectangularBoxAndAccuracy();
  /**
   * <pre>
   * Rectangular box and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RectangularBoxAndAccuracy rectangular_box_and_accuracy = 8;</code>
   */
  org.sensoris.types.spatial.RectangularBoxAndAccuracy getRectangularBoxAndAccuracy();
  /**
   * <pre>
   * Rectangular box and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RectangularBoxAndAccuracy rectangular_box_and_accuracy = 8;</code>
   */
  org.sensoris.types.spatial.RectangularBoxAndAccuracyOrBuilder getRectangularBoxAndAccuracyOrBuilder();
}
