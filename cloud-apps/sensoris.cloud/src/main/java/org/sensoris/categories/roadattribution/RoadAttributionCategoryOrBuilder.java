// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/road_attribution.proto

package org.sensoris.categories.roadattribution;

public interface RoadAttributionCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.roadattribution.RoadAttributionCategory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.CategoryEnvelope getEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Lane boundary.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneBoundary lane_boundary = 2;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.LaneBoundary> 
      getLaneBoundaryList();
  /**
   * <pre>
   * Lane boundary.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneBoundary lane_boundary = 2;</code>
   */
  org.sensoris.categories.roadattribution.LaneBoundary getLaneBoundary(int index);
  /**
   * <pre>
   * Lane boundary.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneBoundary lane_boundary = 2;</code>
   */
  int getLaneBoundaryCount();
  /**
   * <pre>
   * Lane boundary.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneBoundary lane_boundary = 2;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.LaneBoundaryOrBuilder> 
      getLaneBoundaryOrBuilderList();
  /**
   * <pre>
   * Lane boundary.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneBoundary lane_boundary = 2;</code>
   */
  org.sensoris.categories.roadattribution.LaneBoundaryOrBuilder getLaneBoundaryOrBuilder(
      int index);

  /**
   * <pre>
   * Lane boundary merge or split.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneBoundaryMergeSplit lane_boundary_merge_split = 3;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.LaneBoundaryMergeSplit> 
      getLaneBoundaryMergeSplitList();
  /**
   * <pre>
   * Lane boundary merge or split.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneBoundaryMergeSplit lane_boundary_merge_split = 3;</code>
   */
  org.sensoris.categories.roadattribution.LaneBoundaryMergeSplit getLaneBoundaryMergeSplit(int index);
  /**
   * <pre>
   * Lane boundary merge or split.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneBoundaryMergeSplit lane_boundary_merge_split = 3;</code>
   */
  int getLaneBoundaryMergeSplitCount();
  /**
   * <pre>
   * Lane boundary merge or split.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneBoundaryMergeSplit lane_boundary_merge_split = 3;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.LaneBoundaryMergeSplitOrBuilder> 
      getLaneBoundaryMergeSplitOrBuilderList();
  /**
   * <pre>
   * Lane boundary merge or split.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneBoundaryMergeSplit lane_boundary_merge_split = 3;</code>
   */
  org.sensoris.categories.roadattribution.LaneBoundaryMergeSplitOrBuilder getLaneBoundaryMergeSplitOrBuilder(
      int index);

  /**
   * <pre>
   * Lane.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.Lane lane = 4;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.Lane> 
      getLaneList();
  /**
   * <pre>
   * Lane.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.Lane lane = 4;</code>
   */
  org.sensoris.categories.roadattribution.Lane getLane(int index);
  /**
   * <pre>
   * Lane.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.Lane lane = 4;</code>
   */
  int getLaneCount();
  /**
   * <pre>
   * Lane.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.Lane lane = 4;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.LaneOrBuilder> 
      getLaneOrBuilderList();
  /**
   * <pre>
   * Lane.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.Lane lane = 4;</code>
   */
  org.sensoris.categories.roadattribution.LaneOrBuilder getLaneOrBuilder(
      int index);

  /**
   * <pre>
   * Road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.Road road = 5;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.Road> 
      getRoadList();
  /**
   * <pre>
   * Road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.Road road = 5;</code>
   */
  org.sensoris.categories.roadattribution.Road getRoad(int index);
  /**
   * <pre>
   * Road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.Road road = 5;</code>
   */
  int getRoadCount();
  /**
   * <pre>
   * Road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.Road road = 5;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.RoadOrBuilder> 
      getRoadOrBuilderList();
  /**
   * <pre>
   * Road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.Road road = 5;</code>
   */
  org.sensoris.categories.roadattribution.RoadOrBuilder getRoadOrBuilder(
      int index);

  /**
   * <pre>
   * Surface marking.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMarking surface_marking = 6;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.SurfaceMarking> 
      getSurfaceMarkingList();
  /**
   * <pre>
   * Surface marking.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMarking surface_marking = 6;</code>
   */
  org.sensoris.categories.roadattribution.SurfaceMarking getSurfaceMarking(int index);
  /**
   * <pre>
   * Surface marking.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMarking surface_marking = 6;</code>
   */
  int getSurfaceMarkingCount();
  /**
   * <pre>
   * Surface marking.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMarking surface_marking = 6;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.SurfaceMarkingOrBuilder> 
      getSurfaceMarkingOrBuilderList();
  /**
   * <pre>
   * Surface marking.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMarking surface_marking = 6;</code>
   */
  org.sensoris.categories.roadattribution.SurfaceMarkingOrBuilder getSurfaceMarkingOrBuilder(
      int index);

  /**
   * <pre>
   * Attributes of road surface.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceAttribution surface_attribution = 7;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.SurfaceAttribution> 
      getSurfaceAttributionList();
  /**
   * <pre>
   * Attributes of road surface.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceAttribution surface_attribution = 7;</code>
   */
  org.sensoris.categories.roadattribution.SurfaceAttribution getSurfaceAttribution(int index);
  /**
   * <pre>
   * Attributes of road surface.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceAttribution surface_attribution = 7;</code>
   */
  int getSurfaceAttributionCount();
  /**
   * <pre>
   * Attributes of road surface.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceAttribution surface_attribution = 7;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.SurfaceAttributionOrBuilder> 
      getSurfaceAttributionOrBuilderList();
  /**
   * <pre>
   * Attributes of road surface.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceAttribution surface_attribution = 7;</code>
   */
  org.sensoris.categories.roadattribution.SurfaceAttributionOrBuilder getSurfaceAttributionOrBuilder(
      int index);

  /**
   * <pre>
   * Attributes of road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.RoadAttribution road_attribution = 8;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.RoadAttribution> 
      getRoadAttributionList();
  /**
   * <pre>
   * Attributes of road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.RoadAttribution road_attribution = 8;</code>
   */
  org.sensoris.categories.roadattribution.RoadAttribution getRoadAttribution(int index);
  /**
   * <pre>
   * Attributes of road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.RoadAttribution road_attribution = 8;</code>
   */
  int getRoadAttributionCount();
  /**
   * <pre>
   * Attributes of road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.RoadAttribution road_attribution = 8;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.RoadAttributionOrBuilder> 
      getRoadAttributionOrBuilderList();
  /**
   * <pre>
   * Attributes of road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.RoadAttribution road_attribution = 8;</code>
   */
  org.sensoris.categories.roadattribution.RoadAttributionOrBuilder getRoadAttributionOrBuilder(
      int index);

  /**
   * <pre>
   * Detected number of lanes and confidence.
   * Detected lane count may be less than the actual lane count of the road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneCountAndConfidence detected_lane_count_and_confidence = 9;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.LaneCountAndConfidence> 
      getDetectedLaneCountAndConfidenceList();
  /**
   * <pre>
   * Detected number of lanes and confidence.
   * Detected lane count may be less than the actual lane count of the road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneCountAndConfidence detected_lane_count_and_confidence = 9;</code>
   */
  org.sensoris.categories.roadattribution.LaneCountAndConfidence getDetectedLaneCountAndConfidence(int index);
  /**
   * <pre>
   * Detected number of lanes and confidence.
   * Detected lane count may be less than the actual lane count of the road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneCountAndConfidence detected_lane_count_and_confidence = 9;</code>
   */
  int getDetectedLaneCountAndConfidenceCount();
  /**
   * <pre>
   * Detected number of lanes and confidence.
   * Detected lane count may be less than the actual lane count of the road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneCountAndConfidence detected_lane_count_and_confidence = 9;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.LaneCountAndConfidenceOrBuilder> 
      getDetectedLaneCountAndConfidenceOrBuilderList();
  /**
   * <pre>
   * Detected number of lanes and confidence.
   * Detected lane count may be less than the actual lane count of the road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneCountAndConfidence detected_lane_count_and_confidence = 9;</code>
   */
  org.sensoris.categories.roadattribution.LaneCountAndConfidenceOrBuilder getDetectedLaneCountAndConfidenceOrBuilder(
      int index);

  /**
   * <pre>
   * Estimated number of lanes and confidence.
   * Estimated lane count derived from multiple lane detections, which may be higher than the detected lane count and unprecise to the actual lane count on the road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneCountAndConfidence estimated_lane_count_and_confidence = 10;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.LaneCountAndConfidence> 
      getEstimatedLaneCountAndConfidenceList();
  /**
   * <pre>
   * Estimated number of lanes and confidence.
   * Estimated lane count derived from multiple lane detections, which may be higher than the detected lane count and unprecise to the actual lane count on the road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneCountAndConfidence estimated_lane_count_and_confidence = 10;</code>
   */
  org.sensoris.categories.roadattribution.LaneCountAndConfidence getEstimatedLaneCountAndConfidence(int index);
  /**
   * <pre>
   * Estimated number of lanes and confidence.
   * Estimated lane count derived from multiple lane detections, which may be higher than the detected lane count and unprecise to the actual lane count on the road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneCountAndConfidence estimated_lane_count_and_confidence = 10;</code>
   */
  int getEstimatedLaneCountAndConfidenceCount();
  /**
   * <pre>
   * Estimated number of lanes and confidence.
   * Estimated lane count derived from multiple lane detections, which may be higher than the detected lane count and unprecise to the actual lane count on the road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneCountAndConfidence estimated_lane_count_and_confidence = 10;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.LaneCountAndConfidenceOrBuilder> 
      getEstimatedLaneCountAndConfidenceOrBuilderList();
  /**
   * <pre>
   * Estimated number of lanes and confidence.
   * Estimated lane count derived from multiple lane detections, which may be higher than the detected lane count and unprecise to the actual lane count on the road.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.LaneCountAndConfidence estimated_lane_count_and_confidence = 10;</code>
   */
  org.sensoris.categories.roadattribution.LaneCountAndConfidenceOrBuilder getEstimatedLaneCountAndConfidenceOrBuilder(
      int index);
}
