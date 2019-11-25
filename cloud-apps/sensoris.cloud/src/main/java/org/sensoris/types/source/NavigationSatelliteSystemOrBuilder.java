// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/source.proto

package org.sensoris.types.source;

public interface NavigationSatelliteSystemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.source.NavigationSatelliteSystem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Satellite system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.SatelliteSystem satellite_system = 1;</code>
   */
  java.util.List<org.sensoris.types.source.NavigationSatelliteSystem.SatelliteSystem> getSatelliteSystemList();
  /**
   * <pre>
   * Satellite system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.SatelliteSystem satellite_system = 1;</code>
   */
  int getSatelliteSystemCount();
  /**
   * <pre>
   * Satellite system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.SatelliteSystem satellite_system = 1;</code>
   */
  org.sensoris.types.source.NavigationSatelliteSystem.SatelliteSystem getSatelliteSystem(int index);
  /**
   * <pre>
   * Satellite system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.SatelliteSystem satellite_system = 1;</code>
   */
  java.util.List<java.lang.Integer>
  getSatelliteSystemValueList();
  /**
   * <pre>
   * Satellite system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.SatelliteSystem satellite_system = 1;</code>
   */
  int getSatelliteSystemValue(int index);

  /**
   * <pre>
   * Satellite based augmentation system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.SatelliteBasedAugmentationSystem satellite_based_augmentation_system = 2;</code>
   */
  java.util.List<org.sensoris.types.source.NavigationSatelliteSystem.SatelliteBasedAugmentationSystem> getSatelliteBasedAugmentationSystemList();
  /**
   * <pre>
   * Satellite based augmentation system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.SatelliteBasedAugmentationSystem satellite_based_augmentation_system = 2;</code>
   */
  int getSatelliteBasedAugmentationSystemCount();
  /**
   * <pre>
   * Satellite based augmentation system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.SatelliteBasedAugmentationSystem satellite_based_augmentation_system = 2;</code>
   */
  org.sensoris.types.source.NavigationSatelliteSystem.SatelliteBasedAugmentationSystem getSatelliteBasedAugmentationSystem(int index);
  /**
   * <pre>
   * Satellite based augmentation system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.SatelliteBasedAugmentationSystem satellite_based_augmentation_system = 2;</code>
   */
  java.util.List<java.lang.Integer>
  getSatelliteBasedAugmentationSystemValueList();
  /**
   * <pre>
   * Satellite based augmentation system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.SatelliteBasedAugmentationSystem satellite_based_augmentation_system = 2;</code>
   */
  int getSatelliteBasedAugmentationSystemValue(int index);

  /**
   * <pre>
   * Ground based augmentation system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.GroundBasedAugmentationSystem ground_based_augmentation_system = 3;</code>
   */
  java.util.List<org.sensoris.types.source.NavigationSatelliteSystem.GroundBasedAugmentationSystem> getGroundBasedAugmentationSystemList();
  /**
   * <pre>
   * Ground based augmentation system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.GroundBasedAugmentationSystem ground_based_augmentation_system = 3;</code>
   */
  int getGroundBasedAugmentationSystemCount();
  /**
   * <pre>
   * Ground based augmentation system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.GroundBasedAugmentationSystem ground_based_augmentation_system = 3;</code>
   */
  org.sensoris.types.source.NavigationSatelliteSystem.GroundBasedAugmentationSystem getGroundBasedAugmentationSystem(int index);
  /**
   * <pre>
   * Ground based augmentation system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.GroundBasedAugmentationSystem ground_based_augmentation_system = 3;</code>
   */
  java.util.List<java.lang.Integer>
  getGroundBasedAugmentationSystemValueList();
  /**
   * <pre>
   * Ground based augmentation system.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.source.NavigationSatelliteSystem.GroundBasedAugmentationSystem ground_based_augmentation_system = 3;</code>
   */
  int getGroundBasedAugmentationSystemValue(int index);

  /**
   * <pre>
   * Elevation mask.
   * All satellites that have an elevation below the elevation mask are not used for determination of positions.
   * &#64;unit Degree
   * &#64;resolution 1
   * &#64;range [0, 90)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value elevation_mask = 4 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  boolean hasElevationMask();
  /**
   * <pre>
   * Elevation mask.
   * All satellites that have an elevation below the elevation mask are not used for determination of positions.
   * &#64;unit Degree
   * &#64;resolution 1
   * &#64;range [0, 90)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value elevation_mask = 4 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  com.google.protobuf.Int64Value getElevationMask();
  /**
   * <pre>
   * Elevation mask.
   * All satellites that have an elevation below the elevation mask are not used for determination of positions.
   * &#64;unit Degree
   * &#64;resolution 1
   * &#64;range [0, 90)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value elevation_mask = 4 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getElevationMaskOrBuilder();

  /**
   * <pre>
   * 3 D vector describing the offset from the SENSORIS vehicle coordinate system reference point to the GNSS antenna reference point.
   * If the antenna offset is set, then all GNSS positions measured by the sensor shall be transformed to the SENSORIS vehicle coordinate system by applying the antenna offset and the corresponding vehicle rotation.
   * &#64;example Value of (x = 0, y = 0, z = 1 m) corresponds to a GNSS antenna reference point being exactly 1 meter above the SENSORIS vehicle coordinate system reference point.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.XyzVectorAndAccuracy antenna_offset_and_accuracy = 5;</code>
   */
  boolean hasAntennaOffsetAndAccuracy();
  /**
   * <pre>
   * 3 D vector describing the offset from the SENSORIS vehicle coordinate system reference point to the GNSS antenna reference point.
   * If the antenna offset is set, then all GNSS positions measured by the sensor shall be transformed to the SENSORIS vehicle coordinate system by applying the antenna offset and the corresponding vehicle rotation.
   * &#64;example Value of (x = 0, y = 0, z = 1 m) corresponds to a GNSS antenna reference point being exactly 1 meter above the SENSORIS vehicle coordinate system reference point.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.XyzVectorAndAccuracy antenna_offset_and_accuracy = 5;</code>
   */
  org.sensoris.types.spatial.XyzVectorAndAccuracy getAntennaOffsetAndAccuracy();
  /**
   * <pre>
   * 3 D vector describing the offset from the SENSORIS vehicle coordinate system reference point to the GNSS antenna reference point.
   * If the antenna offset is set, then all GNSS positions measured by the sensor shall be transformed to the SENSORIS vehicle coordinate system by applying the antenna offset and the corresponding vehicle rotation.
   * &#64;example Value of (x = 0, y = 0, z = 1 m) corresponds to a GNSS antenna reference point being exactly 1 meter above the SENSORIS vehicle coordinate system reference point.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.XyzVectorAndAccuracy antenna_offset_and_accuracy = 5;</code>
   */
  org.sensoris.types.spatial.XyzVectorAndAccuracyOrBuilder getAntennaOffsetAndAccuracyOrBuilder();

  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getExtensionList();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.Any getExtension(int index);
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtensionOrBuilder(
      int index);
}
