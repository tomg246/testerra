// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: framework.proto

package eu.tsystems.mms.tic.testframework.report.model;

/**
 * Protobuf type {@code data.ClickPathEvent}
 */
public final class ClickPathEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.ClickPathEvent)
    ClickPathEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClickPathEvent.newBuilder() to construct.
  private ClickPathEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClickPathEvent() {
    type_ = 0;
    subject_ = "";
    sessionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClickPathEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClickPathEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            subject_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            sessionId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return eu.tsystems.mms.tic.testframework.report.model.Framework.internal_static_data_ClickPathEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return eu.tsystems.mms.tic.testframework.report.model.Framework.internal_static_data_ClickPathEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent.class, eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.data.ClickPathEventType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.data.ClickPathEventType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType getType() {
    @SuppressWarnings("deprecation")
    eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType result = eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType.valueOf(type_);
    return result == null ? eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType.UNRECOGNIZED : result;
  }

  public static final int SUBJECT_FIELD_NUMBER = 2;
  private volatile java.lang.Object subject_;
  /**
   * <code>string subject = 2;</code>
   * @return The subject.
   */
  @java.lang.Override
  public java.lang.String getSubject() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subject_ = s;
      return s;
    }
  }
  /**
   * <code>string subject = 2;</code>
   * @return The bytes for subject.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectBytes() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subject_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SESSION_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object sessionId_;
  /**
   * <code>string session_id = 3;</code>
   * @return The sessionId.
   */
  @java.lang.Override
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>string session_id = 3;</code>
   * @return The bytes for sessionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType.CPET_NOT_SET.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!getSubjectBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subject_);
    }
    if (!getSessionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sessionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType.CPET_NOT_SET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (!getSubjectBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subject_);
    }
    if (!getSessionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sessionId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent)) {
      return super.equals(obj);
    }
    eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent other = (eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent) obj;

    if (type_ != other.type_) return false;
    if (!getSubject()
        .equals(other.getSubject())) return false;
    if (!getSessionId()
        .equals(other.getSessionId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + SUBJECT_FIELD_NUMBER;
    hash = (53 * hash) + getSubject().hashCode();
    hash = (37 * hash) + SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code data.ClickPathEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.ClickPathEvent)
      eu.tsystems.mms.tic.testframework.report.model.ClickPathEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return eu.tsystems.mms.tic.testframework.report.model.Framework.internal_static_data_ClickPathEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return eu.tsystems.mms.tic.testframework.report.model.Framework.internal_static_data_ClickPathEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent.class, eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent.Builder.class);
    }

    // Construct using eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      subject_ = "";

      sessionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return eu.tsystems.mms.tic.testframework.report.model.Framework.internal_static_data_ClickPathEvent_descriptor;
    }

    @java.lang.Override
    public eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent getDefaultInstanceForType() {
      return eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent.getDefaultInstance();
    }

    @java.lang.Override
    public eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent build() {
      eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent buildPartial() {
      eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent result = new eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent(this);
      result.type_ = type_;
      result.subject_ = subject_;
      result.sessionId_ = sessionId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent) {
        return mergeFrom((eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent other) {
      if (other == eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getSubject().isEmpty()) {
        subject_ = other.subject_;
        onChanged();
      }
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.data.ClickPathEventType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.data.ClickPathEventType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.data.ClickPathEventType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType getType() {
      @SuppressWarnings("deprecation")
      eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType result = eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType.valueOf(type_);
      return result == null ? eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType.UNRECOGNIZED : result;
    }
    /**
     * <code>.data.ClickPathEventType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(eu.tsystems.mms.tic.testframework.report.model.ClickPathEventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.data.ClickPathEventType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object subject_ = "";
    /**
     * <code>string subject = 2;</code>
     * @return The subject.
     */
    public java.lang.String getSubject() {
      java.lang.Object ref = subject_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subject_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subject = 2;</code>
     * @return The bytes for subject.
     */
    public com.google.protobuf.ByteString
        getSubjectBytes() {
      java.lang.Object ref = subject_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subject = 2;</code>
     * @param value The subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubject(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subject_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subject = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubject() {
      
      subject_ = getDefaultInstance().getSubject();
      onChanged();
      return this;
    }
    /**
     * <code>string subject = 2;</code>
     * @param value The bytes for subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subject_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sessionId_ = "";
    /**
     * <code>string session_id = 3;</code>
     * @return The sessionId.
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string session_id = 3;</code>
     * @return The bytes for sessionId.
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string session_id = 3;</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string session_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      
      sessionId_ = getDefaultInstance().getSessionId();
      onChanged();
      return this;
    }
    /**
     * <code>string session_id = 3;</code>
     * @param value The bytes for sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:data.ClickPathEvent)
  }

  // @@protoc_insertion_point(class_scope:data.ClickPathEvent)
  private static final eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent();
  }

  public static eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClickPathEvent>
      PARSER = new com.google.protobuf.AbstractParser<ClickPathEvent>() {
    @java.lang.Override
    public ClickPathEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClickPathEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClickPathEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClickPathEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public eu.tsystems.mms.tic.testframework.report.model.ClickPathEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

