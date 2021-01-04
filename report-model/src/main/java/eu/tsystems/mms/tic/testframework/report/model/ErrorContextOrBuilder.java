// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: framework.proto

package eu.tsystems.mms.tic.testframework.report.model;

public interface ErrorContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ErrorContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *    string readable_error_message = 1 [deprecated = true];
   *    string additional_error_message = 2 [deprecated = true];
   *    StackTrace stack_trace = 3  [deprecated = true];
   *    string error_fingerprint = 6 [deprecated = true];
   * </pre>
   *
   * <code>.data.ScriptSource script_source = 7;</code>
   * @return Whether the scriptSource field is set.
   */
  boolean hasScriptSource();
  /**
   * <pre>
   *    string readable_error_message = 1 [deprecated = true];
   *    string additional_error_message = 2 [deprecated = true];
   *    StackTrace stack_trace = 3  [deprecated = true];
   *    string error_fingerprint = 6 [deprecated = true];
   * </pre>
   *
   * <code>.data.ScriptSource script_source = 7;</code>
   * @return The scriptSource.
   */
  eu.tsystems.mms.tic.testframework.report.model.ScriptSource getScriptSource();
  /**
   * <pre>
   *    string readable_error_message = 1 [deprecated = true];
   *    string additional_error_message = 2 [deprecated = true];
   *    StackTrace stack_trace = 3  [deprecated = true];
   *    string error_fingerprint = 6 [deprecated = true];
   * </pre>
   *
   * <code>.data.ScriptSource script_source = 7;</code>
   */
  eu.tsystems.mms.tic.testframework.report.model.ScriptSourceOrBuilder getScriptSourceOrBuilder();

  /**
   * <code>.data.ScriptSource execution_object_source = 8;</code>
   * @return Whether the executionObjectSource field is set.
   */
  boolean hasExecutionObjectSource();
  /**
   * <code>.data.ScriptSource execution_object_source = 8;</code>
   * @return The executionObjectSource.
   */
  eu.tsystems.mms.tic.testframework.report.model.ScriptSource getExecutionObjectSource();
  /**
   * <code>.data.ScriptSource execution_object_source = 8;</code>
   */
  eu.tsystems.mms.tic.testframework.report.model.ScriptSourceOrBuilder getExecutionObjectSourceOrBuilder();

  /**
   * <code>string ticketId = 9;</code>
   * @return The ticketId.
   */
  java.lang.String getTicketId();
  /**
   * <code>string ticketId = 9;</code>
   * @return The bytes for ticketId.
   */
  com.google.protobuf.ByteString
      getTicketIdBytes();

  /**
   * <code>string description = 10;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 10;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .data.StackTraceCause stack_trace = 11;</code>
   */
  java.util.List<eu.tsystems.mms.tic.testframework.report.model.StackTraceCause> 
      getStackTraceList();
  /**
   * <code>repeated .data.StackTraceCause stack_trace = 11;</code>
   */
  eu.tsystems.mms.tic.testframework.report.model.StackTraceCause getStackTrace(int index);
  /**
   * <code>repeated .data.StackTraceCause stack_trace = 11;</code>
   */
  int getStackTraceCount();
  /**
   * <code>repeated .data.StackTraceCause stack_trace = 11;</code>
   */
  java.util.List<? extends eu.tsystems.mms.tic.testframework.report.model.StackTraceCauseOrBuilder> 
      getStackTraceOrBuilderList();
  /**
   * <code>repeated .data.StackTraceCause stack_trace = 11;</code>
   */
  eu.tsystems.mms.tic.testframework.report.model.StackTraceCauseOrBuilder getStackTraceOrBuilder(
      int index);

  /**
   * <code>bool optional = 12;</code>
   * @return The optional.
   */
  boolean getOptional();
}
