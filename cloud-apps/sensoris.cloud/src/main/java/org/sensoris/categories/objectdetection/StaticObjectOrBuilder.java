// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/object_detection.proto

package org.sensoris.categories.objectdetection;

public interface StaticObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.objectdetection.StaticObject)
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
   * Static object identifier.
   * Identifier is unique within a DataMessage and can be used to trace static objects.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value object_id = 2;</code>
   */
  boolean hasObjectId();
  /**
   * <pre>
   * Static object identifier.
   * Identifier is unique within a DataMessage and can be used to trace static objects.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value object_id = 2;</code>
   */
  com.google.protobuf.Int64Value getObjectId();
  /**
   * <pre>
   * Static object identifier.
   * Identifier is unique within a DataMessage and can be used to trace static objects.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value object_id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getObjectIdOrBuilder();

  /**
   * <pre>
   * Confidence that a static object has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 3;</code>
   */
  boolean hasExistenceConfidence();
  /**
   * <pre>
   * Confidence that a static object has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 3;</code>
   */
  org.sensoris.types.base.Confidence getExistenceConfidence();
  /**
   * <pre>
   * Confidence that a static object has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 3;</code>
   */
  org.sensoris.types.base.ConfidenceOrBuilder getExistenceConfidenceOrBuilder();

  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 4;</code>
   */
  boolean hasDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 4;</code>
   */
  org.sensoris.types.base.EventDetectionStatus getDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 4;</code>
   */
  org.sensoris.types.base.EventDetectionStatusOrBuilder getDetectionStatusOrBuilder();

  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.TypeAndConfidence type_and_confidence = 5;</code>
   */
  boolean hasTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.TypeAndConfidence type_and_confidence = 5;</code>
   */
  org.sensoris.categories.objectdetection.StaticObject.TypeAndConfidence getTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.TypeAndConfidence type_and_confidence = 5;</code>
   */
  org.sensoris.categories.objectdetection.StaticObject.TypeAndConfidenceOrBuilder getTypeAndConfidenceOrBuilder();

  /**
   * <pre>
   * Rectangular box and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RectangularBoxAndAccuracy rectangular_box_and_accuracy = 6;</code>
   */
  boolean hasRectangularBoxAndAccuracy();
  /**
   * <pre>
   * Rectangular box and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RectangularBoxAndAccuracy rectangular_box_and_accuracy = 6;</code>
   */
  org.sensoris.types.spatial.RectangularBoxAndAccuracy getRectangularBoxAndAccuracy();
  /**
   * <pre>
   * Rectangular box and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RectangularBoxAndAccuracy rectangular_box_and_accuracy = 6;</code>
   */
  org.sensoris.types.spatial.RectangularBoxAndAccuracyOrBuilder getRectangularBoxAndAccuracyOrBuilder();

  /**
   * <pre>
   * Cone shaped circular geometry defined by a lower and upper position and a lower and upper diameter.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.ConeAndAccuracy cone_and_accuracy = 7;</code>
   */
  boolean hasConeAndAccuracy();
  /**
   * <pre>
   * Cone shaped circular geometry defined by a lower and upper position and a lower and upper diameter.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.ConeAndAccuracy cone_and_accuracy = 7;</code>
   */
  org.sensoris.categories.objectdetection.StaticObject.ConeAndAccuracy getConeAndAccuracy();
  /**
   * <pre>
   * Cone shaped circular geometry defined by a lower and upper position and a lower and upper diameter.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.ConeAndAccuracy cone_and_accuracy = 7;</code>
   */
  org.sensoris.categories.objectdetection.StaticObject.ConeAndAccuracyOrBuilder getConeAndAccuracyOrBuilder();

  /**
   * <pre>
   * Surface type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceTypeAndConfidence surface_type_and_confidence = 8;</code>
   */
  boolean hasSurfaceTypeAndConfidence();
  /**
   * <pre>
   * Surface type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceTypeAndConfidence surface_type_and_confidence = 8;</code>
   */
  org.sensoris.categories.objectdetection.StaticObject.SurfaceTypeAndConfidence getSurfaceTypeAndConfidence();
  /**
   * <pre>
   * Surface type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceTypeAndConfidence surface_type_and_confidence = 8;</code>
   */
  org.sensoris.categories.objectdetection.StaticObject.SurfaceTypeAndConfidenceOrBuilder getSurfaceTypeAndConfidenceOrBuilder();

  /**
   * <pre>
   * Surface material and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceMaterialAndConfidence surface_material_and_confidence = 9;</code>
   */
  boolean hasSurfaceMaterialAndConfidence();
  /**
   * <pre>
   * Surface material and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceMaterialAndConfidence surface_material_and_confidence = 9;</code>
   */
  org.sensoris.categories.objectdetection.StaticObject.SurfaceMaterialAndConfidence getSurfaceMaterialAndConfidence();
  /**
   * <pre>
   * Surface material and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceMaterialAndConfidence surface_material_and_confidence = 9;</code>
   */
  org.sensoris.categories.objectdetection.StaticObject.SurfaceMaterialAndConfidenceOrBuilder getSurfaceMaterialAndConfidenceOrBuilder();

  /**
   * <pre>
   * Surface color and confidence.
   * An object may have multiple colors. If only one color is set, this is the dominant color.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceColorAndConfidence surface_color_and_confidence = 10;</code>
   */
  java.util.List<org.sensoris.categories.objectdetection.StaticObject.SurfaceColorAndConfidence> 
      getSurfaceColorAndConfidenceList();
  /**
   * <pre>
   * Surface color and confidence.
   * An object may have multiple colors. If only one color is set, this is the dominant color.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceColorAndConfidence surface_color_and_confidence = 10;</code>
   */
  org.sensoris.categories.objectdetection.StaticObject.SurfaceColorAndConfidence getSurfaceColorAndConfidence(int index);
  /**
   * <pre>
   * Surface color and confidence.
   * An object may have multiple colors. If only one color is set, this is the dominant color.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceColorAndConfidence surface_color_and_confidence = 10;</code>
   */
  int getSurfaceColorAndConfidenceCount();
  /**
   * <pre>
   * Surface color and confidence.
   * An object may have multiple colors. If only one color is set, this is the dominant color.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceColorAndConfidence surface_color_and_confidence = 10;</code>
   */
  java.util.List<? extends org.sensoris.categories.objectdetection.StaticObject.SurfaceColorAndConfidenceOrBuilder> 
      getSurfaceColorAndConfidenceOrBuilderList();
  /**
   * <pre>
   * Surface color and confidence.
   * An object may have multiple colors. If only one color is set, this is the dominant color.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.objectdetection.StaticObject.SurfaceColorAndConfidence surface_color_and_confidence = 10;</code>
   */
  org.sensoris.categories.objectdetection.StaticObject.SurfaceColorAndConfidenceOrBuilder getSurfaceColorAndConfidenceOrBuilder(
      int index);

  public org.sensoris.categories.objectdetection.StaticObject.GeometryCase getGeometryCase();
}