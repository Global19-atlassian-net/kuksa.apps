// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

package org.sensoris.types.base;

public interface VersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.Version)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Major version.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value major = 1;</code>
   */
  boolean hasMajor();
  /**
   * <pre>
   * Major version.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value major = 1;</code>
   */
  com.google.protobuf.Int64Value getMajor();
  /**
   * <pre>
   * Major version.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value major = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMajorOrBuilder();

  /**
   * <pre>
   * Minor version.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value minor = 2;</code>
   */
  boolean hasMinor();
  /**
   * <pre>
   * Minor version.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value minor = 2;</code>
   */
  com.google.protobuf.Int64Value getMinor();
  /**
   * <pre>
   * Minor version.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value minor = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMinorOrBuilder();

  /**
   * <pre>
   * Patch version.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value patch = 3;</code>
   */
  boolean hasPatch();
  /**
   * <pre>
   * Patch version.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value patch = 3;</code>
   */
  com.google.protobuf.Int64Value getPatch();
  /**
   * <pre>
   * Patch version.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value patch = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getPatchOrBuilder();

  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();
}
