// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: framework.proto

package eu.tsystems.mms.tic.testframework.report.model;

/**
 * Protobuf type {@code data.SuiteContext}
 */
public final class SuiteContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.SuiteContext)
    SuiteContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuiteContext.newBuilder() to construct.
  private SuiteContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuiteContext() {
    testContextIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    executionContextId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuiteContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SuiteContext(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            eu.tsystems.mms.tic.testframework.report.model.ContextValues.Builder subBuilder = null;
            if (contextValues_ != null) {
              subBuilder = contextValues_.toBuilder();
            }
            contextValues_ = input.readMessage(eu.tsystems.mms.tic.testframework.report.model.ContextValues.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(contextValues_);
              contextValues_ = subBuilder.buildPartial();
            }

            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              testContextIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            testContextIds_.add(s);
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            executionContextId_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        testContextIds_ = testContextIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return eu.tsystems.mms.tic.testframework.report.model.Framework.internal_static_data_SuiteContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return eu.tsystems.mms.tic.testframework.report.model.Framework.internal_static_data_SuiteContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            eu.tsystems.mms.tic.testframework.report.model.SuiteContext.class, eu.tsystems.mms.tic.testframework.report.model.SuiteContext.Builder.class);
  }

  public static final int CONTEXT_VALUES_FIELD_NUMBER = 1;
  private eu.tsystems.mms.tic.testframework.report.model.ContextValues contextValues_;
  /**
   * <code>.data.ContextValues context_values = 1;</code>
   * @return Whether the contextValues field is set.
   */
  @java.lang.Override
  public boolean hasContextValues() {
    return contextValues_ != null;
  }
  /**
   * <code>.data.ContextValues context_values = 1;</code>
   * @return The contextValues.
   */
  @java.lang.Override
  public eu.tsystems.mms.tic.testframework.report.model.ContextValues getContextValues() {
    return contextValues_ == null ? eu.tsystems.mms.tic.testframework.report.model.ContextValues.getDefaultInstance() : contextValues_;
  }
  /**
   * <code>.data.ContextValues context_values = 1;</code>
   */
  @java.lang.Override
  public eu.tsystems.mms.tic.testframework.report.model.ContextValuesOrBuilder getContextValuesOrBuilder() {
    return getContextValues();
  }

  public static final int TEST_CONTEXT_IDS_FIELD_NUMBER = 6;
  private com.google.protobuf.LazyStringList testContextIds_;
  /**
   * <pre>
   * list of all test
   * </pre>
   *
   * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
   * @return A list containing the testContextIds.
   */
  @java.lang.Deprecated public com.google.protobuf.ProtocolStringList
      getTestContextIdsList() {
    return testContextIds_;
  }
  /**
   * <pre>
   * list of all test
   * </pre>
   *
   * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
   * @return The count of testContextIds.
   */
  @java.lang.Deprecated public int getTestContextIdsCount() {
    return testContextIds_.size();
  }
  /**
   * <pre>
   * list of all test
   * </pre>
   *
   * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
   * @param index The index of the element to return.
   * @return The testContextIds at the given index.
   */
  @java.lang.Deprecated public java.lang.String getTestContextIds(int index) {
    return testContextIds_.get(index);
  }
  /**
   * <pre>
   * list of all test
   * </pre>
   *
   * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
   * @param index The index of the value to return.
   * @return The bytes of the testContextIds at the given index.
   */
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getTestContextIdsBytes(int index) {
    return testContextIds_.getByteString(index);
  }

  public static final int EXECUTION_CONTEXT_ID_FIELD_NUMBER = 7;
  private volatile java.lang.Object executionContextId_;
  /**
   * <pre>
   * reference
   * </pre>
   *
   * <code>string execution_context_id = 7;</code>
   * @return The executionContextId.
   */
  @java.lang.Override
  public java.lang.String getExecutionContextId() {
    java.lang.Object ref = executionContextId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      executionContextId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * reference
   * </pre>
   *
   * <code>string execution_context_id = 7;</code>
   * @return The bytes for executionContextId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExecutionContextIdBytes() {
    java.lang.Object ref = executionContextId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      executionContextId_ = b;
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
    if (contextValues_ != null) {
      output.writeMessage(1, getContextValues());
    }
    for (int i = 0; i < testContextIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, testContextIds_.getRaw(i));
    }
    if (!getExecutionContextIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, executionContextId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contextValues_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContextValues());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < testContextIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(testContextIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTestContextIdsList().size();
    }
    if (!getExecutionContextIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, executionContextId_);
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
    if (!(obj instanceof eu.tsystems.mms.tic.testframework.report.model.SuiteContext)) {
      return super.equals(obj);
    }
    eu.tsystems.mms.tic.testframework.report.model.SuiteContext other = (eu.tsystems.mms.tic.testframework.report.model.SuiteContext) obj;

    if (hasContextValues() != other.hasContextValues()) return false;
    if (hasContextValues()) {
      if (!getContextValues()
          .equals(other.getContextValues())) return false;
    }
    if (!getTestContextIdsList()
        .equals(other.getTestContextIdsList())) return false;
    if (!getExecutionContextId()
        .equals(other.getExecutionContextId())) return false;
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
    if (hasContextValues()) {
      hash = (37 * hash) + CONTEXT_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getContextValues().hashCode();
    }
    if (getTestContextIdsCount() > 0) {
      hash = (37 * hash) + TEST_CONTEXT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getTestContextIdsList().hashCode();
    }
    hash = (37 * hash) + EXECUTION_CONTEXT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getExecutionContextId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext parseFrom(
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
  public static Builder newBuilder(eu.tsystems.mms.tic.testframework.report.model.SuiteContext prototype) {
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
   * Protobuf type {@code data.SuiteContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.SuiteContext)
      eu.tsystems.mms.tic.testframework.report.model.SuiteContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return eu.tsystems.mms.tic.testframework.report.model.Framework.internal_static_data_SuiteContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return eu.tsystems.mms.tic.testframework.report.model.Framework.internal_static_data_SuiteContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              eu.tsystems.mms.tic.testframework.report.model.SuiteContext.class, eu.tsystems.mms.tic.testframework.report.model.SuiteContext.Builder.class);
    }

    // Construct using eu.tsystems.mms.tic.testframework.report.model.SuiteContext.newBuilder()
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
      if (contextValuesBuilder_ == null) {
        contextValues_ = null;
      } else {
        contextValues_ = null;
        contextValuesBuilder_ = null;
      }
      testContextIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      executionContextId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return eu.tsystems.mms.tic.testframework.report.model.Framework.internal_static_data_SuiteContext_descriptor;
    }

    @java.lang.Override
    public eu.tsystems.mms.tic.testframework.report.model.SuiteContext getDefaultInstanceForType() {
      return eu.tsystems.mms.tic.testframework.report.model.SuiteContext.getDefaultInstance();
    }

    @java.lang.Override
    public eu.tsystems.mms.tic.testframework.report.model.SuiteContext build() {
      eu.tsystems.mms.tic.testframework.report.model.SuiteContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public eu.tsystems.mms.tic.testframework.report.model.SuiteContext buildPartial() {
      eu.tsystems.mms.tic.testframework.report.model.SuiteContext result = new eu.tsystems.mms.tic.testframework.report.model.SuiteContext(this);
      int from_bitField0_ = bitField0_;
      if (contextValuesBuilder_ == null) {
        result.contextValues_ = contextValues_;
      } else {
        result.contextValues_ = contextValuesBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        testContextIds_ = testContextIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.testContextIds_ = testContextIds_;
      result.executionContextId_ = executionContextId_;
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
      if (other instanceof eu.tsystems.mms.tic.testframework.report.model.SuiteContext) {
        return mergeFrom((eu.tsystems.mms.tic.testframework.report.model.SuiteContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(eu.tsystems.mms.tic.testframework.report.model.SuiteContext other) {
      if (other == eu.tsystems.mms.tic.testframework.report.model.SuiteContext.getDefaultInstance()) return this;
      if (other.hasContextValues()) {
        mergeContextValues(other.getContextValues());
      }
      if (!other.testContextIds_.isEmpty()) {
        if (testContextIds_.isEmpty()) {
          testContextIds_ = other.testContextIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTestContextIdsIsMutable();
          testContextIds_.addAll(other.testContextIds_);
        }
        onChanged();
      }
      if (!other.getExecutionContextId().isEmpty()) {
        executionContextId_ = other.executionContextId_;
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
      eu.tsystems.mms.tic.testframework.report.model.SuiteContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (eu.tsystems.mms.tic.testframework.report.model.SuiteContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private eu.tsystems.mms.tic.testframework.report.model.ContextValues contextValues_;
    private com.google.protobuf.SingleFieldBuilderV3<
        eu.tsystems.mms.tic.testframework.report.model.ContextValues, eu.tsystems.mms.tic.testframework.report.model.ContextValues.Builder, eu.tsystems.mms.tic.testframework.report.model.ContextValuesOrBuilder> contextValuesBuilder_;
    /**
     * <code>.data.ContextValues context_values = 1;</code>
     * @return Whether the contextValues field is set.
     */
    public boolean hasContextValues() {
      return contextValuesBuilder_ != null || contextValues_ != null;
    }
    /**
     * <code>.data.ContextValues context_values = 1;</code>
     * @return The contextValues.
     */
    public eu.tsystems.mms.tic.testframework.report.model.ContextValues getContextValues() {
      if (contextValuesBuilder_ == null) {
        return contextValues_ == null ? eu.tsystems.mms.tic.testframework.report.model.ContextValues.getDefaultInstance() : contextValues_;
      } else {
        return contextValuesBuilder_.getMessage();
      }
    }
    /**
     * <code>.data.ContextValues context_values = 1;</code>
     */
    public Builder setContextValues(eu.tsystems.mms.tic.testframework.report.model.ContextValues value) {
      if (contextValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contextValues_ = value;
        onChanged();
      } else {
        contextValuesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.data.ContextValues context_values = 1;</code>
     */
    public Builder setContextValues(
        eu.tsystems.mms.tic.testframework.report.model.ContextValues.Builder builderForValue) {
      if (contextValuesBuilder_ == null) {
        contextValues_ = builderForValue.build();
        onChanged();
      } else {
        contextValuesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.data.ContextValues context_values = 1;</code>
     */
    public Builder mergeContextValues(eu.tsystems.mms.tic.testframework.report.model.ContextValues value) {
      if (contextValuesBuilder_ == null) {
        if (contextValues_ != null) {
          contextValues_ =
            eu.tsystems.mms.tic.testframework.report.model.ContextValues.newBuilder(contextValues_).mergeFrom(value).buildPartial();
        } else {
          contextValues_ = value;
        }
        onChanged();
      } else {
        contextValuesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.data.ContextValues context_values = 1;</code>
     */
    public Builder clearContextValues() {
      if (contextValuesBuilder_ == null) {
        contextValues_ = null;
        onChanged();
      } else {
        contextValues_ = null;
        contextValuesBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.data.ContextValues context_values = 1;</code>
     */
    public eu.tsystems.mms.tic.testframework.report.model.ContextValues.Builder getContextValuesBuilder() {
      
      onChanged();
      return getContextValuesFieldBuilder().getBuilder();
    }
    /**
     * <code>.data.ContextValues context_values = 1;</code>
     */
    public eu.tsystems.mms.tic.testframework.report.model.ContextValuesOrBuilder getContextValuesOrBuilder() {
      if (contextValuesBuilder_ != null) {
        return contextValuesBuilder_.getMessageOrBuilder();
      } else {
        return contextValues_ == null ?
            eu.tsystems.mms.tic.testframework.report.model.ContextValues.getDefaultInstance() : contextValues_;
      }
    }
    /**
     * <code>.data.ContextValues context_values = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        eu.tsystems.mms.tic.testframework.report.model.ContextValues, eu.tsystems.mms.tic.testframework.report.model.ContextValues.Builder, eu.tsystems.mms.tic.testframework.report.model.ContextValuesOrBuilder> 
        getContextValuesFieldBuilder() {
      if (contextValuesBuilder_ == null) {
        contextValuesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            eu.tsystems.mms.tic.testframework.report.model.ContextValues, eu.tsystems.mms.tic.testframework.report.model.ContextValues.Builder, eu.tsystems.mms.tic.testframework.report.model.ContextValuesOrBuilder>(
                getContextValues(),
                getParentForChildren(),
                isClean());
        contextValues_ = null;
      }
      return contextValuesBuilder_;
    }

    private com.google.protobuf.LazyStringList testContextIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTestContextIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        testContextIds_ = new com.google.protobuf.LazyStringArrayList(testContextIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * list of all test
     * </pre>
     *
     * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
     * @return A list containing the testContextIds.
     */
    @java.lang.Deprecated public com.google.protobuf.ProtocolStringList
        getTestContextIdsList() {
      return testContextIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * list of all test
     * </pre>
     *
     * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
     * @return The count of testContextIds.
     */
    @java.lang.Deprecated public int getTestContextIdsCount() {
      return testContextIds_.size();
    }
    /**
     * <pre>
     * list of all test
     * </pre>
     *
     * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
     * @param index The index of the element to return.
     * @return The testContextIds at the given index.
     */
    @java.lang.Deprecated public java.lang.String getTestContextIds(int index) {
      return testContextIds_.get(index);
    }
    /**
     * <pre>
     * list of all test
     * </pre>
     *
     * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
     * @param index The index of the value to return.
     * @return The bytes of the testContextIds at the given index.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getTestContextIdsBytes(int index) {
      return testContextIds_.getByteString(index);
    }
    /**
     * <pre>
     * list of all test
     * </pre>
     *
     * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
     * @param index The index to set the value at.
     * @param value The testContextIds to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setTestContextIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTestContextIdsIsMutable();
      testContextIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of all test
     * </pre>
     *
     * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
     * @param value The testContextIds to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addTestContextIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTestContextIdsIsMutable();
      testContextIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of all test
     * </pre>
     *
     * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
     * @param values The testContextIds to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addAllTestContextIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureTestContextIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, testContextIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of all test
     * </pre>
     *
     * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearTestContextIds() {
      testContextIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of all test
     * </pre>
     *
     * <code>repeated string test_context_ids = 6 [deprecated = true];</code>
     * @param value The bytes of the testContextIds to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addTestContextIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTestContextIdsIsMutable();
      testContextIds_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object executionContextId_ = "";
    /**
     * <pre>
     * reference
     * </pre>
     *
     * <code>string execution_context_id = 7;</code>
     * @return The executionContextId.
     */
    public java.lang.String getExecutionContextId() {
      java.lang.Object ref = executionContextId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        executionContextId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * reference
     * </pre>
     *
     * <code>string execution_context_id = 7;</code>
     * @return The bytes for executionContextId.
     */
    public com.google.protobuf.ByteString
        getExecutionContextIdBytes() {
      java.lang.Object ref = executionContextId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        executionContextId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * reference
     * </pre>
     *
     * <code>string execution_context_id = 7;</code>
     * @param value The executionContextId to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionContextId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      executionContextId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * reference
     * </pre>
     *
     * <code>string execution_context_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearExecutionContextId() {
      
      executionContextId_ = getDefaultInstance().getExecutionContextId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * reference
     * </pre>
     *
     * <code>string execution_context_id = 7;</code>
     * @param value The bytes for executionContextId to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionContextIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      executionContextId_ = value;
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


    // @@protoc_insertion_point(builder_scope:data.SuiteContext)
  }

  // @@protoc_insertion_point(class_scope:data.SuiteContext)
  private static final eu.tsystems.mms.tic.testframework.report.model.SuiteContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new eu.tsystems.mms.tic.testframework.report.model.SuiteContext();
  }

  public static eu.tsystems.mms.tic.testframework.report.model.SuiteContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuiteContext>
      PARSER = new com.google.protobuf.AbstractParser<SuiteContext>() {
    @java.lang.Override
    public SuiteContext parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SuiteContext(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SuiteContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuiteContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public eu.tsystems.mms.tic.testframework.report.model.SuiteContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

