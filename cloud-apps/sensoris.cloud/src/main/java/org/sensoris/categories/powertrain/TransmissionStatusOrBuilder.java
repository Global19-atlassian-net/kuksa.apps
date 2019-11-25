// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/powertrain.proto

package org.sensoris.categories.powertrain;

public interface TransmissionStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.powertrain.TransmissionStatus)
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
   * Mode of gear.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.TransmissionStatus.GearMode gear_mode = 2;</code>
   */
  int getGearModeValue();
  /**
   * <pre>
   * Mode of gear.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.TransmissionStatus.GearMode gear_mode = 2;</code>
   */
  org.sensoris.categories.powertrain.TransmissionStatus.GearMode getGearMode();

  /**
   * <pre>
   * Drive mode.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.TransmissionStatus.DriveMode drive_mode = 3;</code>
   */
  int getDriveModeValue();
  /**
   * <pre>
   * Drive mode.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.TransmissionStatus.DriveMode drive_mode = 3;</code>
   */
  org.sensoris.categories.powertrain.TransmissionStatus.DriveMode getDriveMode();

  /**
   * <pre>
   * Current gear in the selected mode for which 1 is the gear with the highest ratio (slowest possible speed) and the maximum number (e.g. 6) is the gear with the lowest ratio (highest possible speed).
   * If gear mode is REVERSE, then current gear refers to the gear in reverse as vehicles might have multiple reverse gears.
   * If gear mode is PARK or NEUTRAL, the current gear is not relevant.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64Value current_gear = 4;</code>
   */
  boolean hasCurrentGear();
  /**
   * <pre>
   * Current gear in the selected mode for which 1 is the gear with the highest ratio (slowest possible speed) and the maximum number (e.g. 6) is the gear with the lowest ratio (highest possible speed).
   * If gear mode is REVERSE, then current gear refers to the gear in reverse as vehicles might have multiple reverse gears.
   * If gear mode is PARK or NEUTRAL, the current gear is not relevant.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64Value current_gear = 4;</code>
   */
  org.sensoris.types.base.Int64Value getCurrentGear();
  /**
   * <pre>
   * Current gear in the selected mode for which 1 is the gear with the highest ratio (slowest possible speed) and the maximum number (e.g. 6) is the gear with the lowest ratio (highest possible speed).
   * If gear mode is REVERSE, then current gear refers to the gear in reverse as vehicles might have multiple reverse gears.
   * If gear mode is PARK or NEUTRAL, the current gear is not relevant.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64Value current_gear = 4;</code>
   */
  org.sensoris.types.base.Int64ValueOrBuilder getCurrentGearOrBuilder();
}
