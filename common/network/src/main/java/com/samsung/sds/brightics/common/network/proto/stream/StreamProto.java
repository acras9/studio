// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stream.proto

package com.samsung.sds.brightics.common.network.proto.stream;

public final class StreamProto {
  private StreamProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_samsung_sds_brightics_common_network_proto_stream_ReadMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_samsung_sds_brightics_common_network_proto_stream_ReadMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_samsung_sds_brightics_common_network_proto_stream_WriteMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_samsung_sds_brightics_common_network_proto_stream_WriteMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_samsung_sds_brightics_common_network_proto_stream_ByteStreamMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_samsung_sds_brightics_common_network_proto_stream_ByteStreamMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014stream.proto\0225com.samsung.sds.brightic" +
      "s.common.network.proto.stream\"L\n\013ReadMes" +
      "sage\022\014\n\004user\030\001 \001(\t\022\013\n\003key\030\002 \001(\t\022\021\n\tdelim" +
      "iter\030\003 \001(\t\022\017\n\007tempKey\030\004 \001(\t\"e\n\014WriteMess" +
      "age\022\014\n\004user\030\001 \001(\t\022\014\n\004path\030\002 \001(\t\022\017\n\007tempK" +
      "ey\030\003 \001(\t\022\022\n\nparameters\030\004 \001(\t\022\024\n\014errorMes" +
      "sage\030\005 \001(\t\"2\n\021ByteStreamMessage\022\014\n\004data\030" +
      "\001 \001(\014\022\017\n\007tempKey\030\002 \001(\t2\231\005\n\rStreamService" +
      "\022\244\001\n\026writeStreaminitializer\022C.com.samsun" +
      "g.sds.brightics.common.network.proto.str" +
      "eam.WriteMessage\032C.com.samsung.sds.brigh" +
      "tics.common.network.proto.stream.WriteMe" +
      "ssage\"\000\022\242\001\n\013writeStream\022H.com.samsung.sd" +
      "s.brightics.common.network.proto.stream." +
      "ByteStreamMessage\032C.com.samsung.sds.brig" +
      "htics.common.network.proto.stream.WriteM" +
      "essage\"\000(\0010\001\022\236\001\n\nreadStream\022B.com.samsun" +
      "g.sds.brightics.common.network.proto.str" +
      "eam.ReadMessage\032H.com.samsung.sds.bright" +
      "ics.common.network.proto.stream.ByteStre" +
      "amMessage\"\0000\001\022\232\001\n\016readStreamDone\022B.com.s" +
      "amsung.sds.brightics.common.network.prot" +
      "o.stream.ReadMessage\032B.com.samsung.sds.b" +
      "rightics.common.network.proto.stream.Rea" +
      "dMessage\"\000B\017B\013StreamProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_samsung_sds_brightics_common_network_proto_stream_ReadMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_samsung_sds_brightics_common_network_proto_stream_ReadMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_samsung_sds_brightics_common_network_proto_stream_ReadMessage_descriptor,
        new java.lang.String[] { "User", "Key", "Delimiter", "TempKey", });
    internal_static_com_samsung_sds_brightics_common_network_proto_stream_WriteMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_samsung_sds_brightics_common_network_proto_stream_WriteMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_samsung_sds_brightics_common_network_proto_stream_WriteMessage_descriptor,
        new java.lang.String[] { "User", "Path", "TempKey", "Parameters", "ErrorMessage", });
    internal_static_com_samsung_sds_brightics_common_network_proto_stream_ByteStreamMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_samsung_sds_brightics_common_network_proto_stream_ByteStreamMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_samsung_sds_brightics_common_network_proto_stream_ByteStreamMessage_descriptor,
        new java.lang.String[] { "Data", "TempKey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
