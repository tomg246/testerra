// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: framework.proto

package eu.tsystems.mms.tic.testframework.report.model;

/**
 * Protobuf enum {@code data.MethodType}
 */
public enum MethodType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MT_NOT_SET = 0;</code>
   */
  MT_NOT_SET(0),
  /**
   * <code>TEST_METHOD = 1;</code>
   */
  TEST_METHOD(1),
  /**
   * <code>CONFIGURATION_METHOD = 2;</code>
   */
  CONFIGURATION_METHOD(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MT_NOT_SET = 0;</code>
   */
  public static final int MT_NOT_SET_VALUE = 0;
  /**
   * <code>TEST_METHOD = 1;</code>
   */
  public static final int TEST_METHOD_VALUE = 1;
  /**
   * <code>CONFIGURATION_METHOD = 2;</code>
   */
  public static final int CONFIGURATION_METHOD_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MethodType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MethodType forNumber(int value) {
    switch (value) {
      case 0: return MT_NOT_SET;
      case 1: return TEST_METHOD;
      case 2: return CONFIGURATION_METHOD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MethodType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MethodType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MethodType>() {
          public MethodType findValueByNumber(int number) {
            return MethodType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return eu.tsystems.mms.tic.testframework.report.model.Framework.getDescriptor().getEnumTypes().get(3);
  }

  private static final MethodType[] VALUES = values();

  public static MethodType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MethodType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:data.MethodType)
}

