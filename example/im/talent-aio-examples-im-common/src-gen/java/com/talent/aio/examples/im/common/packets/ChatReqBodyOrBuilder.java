// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/chat.proto

package com.talent.aio.examples.im.common.packets;

public interface ChatReqBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.talent.aio.examples.im.common.packets.ChatReqBody)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息发送时间
   * </pre>
   *
   * <code>int64 time = 1;</code>
   */
  long getTime();

  /**
   * <pre>
   *聊天类型
   * </pre>
   *
   * <code>.com.talent.aio.examples.im.common.packets.ChatType type = 2;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   *聊天类型
   * </pre>
   *
   * <code>.com.talent.aio.examples.im.common.packets.ChatType type = 2;</code>
   */
  com.talent.aio.examples.im.common.packets.ChatType getType();

  /**
   * <pre>
   *聊天内容
   * </pre>
   *
   * <code>string text = 3;</code>
   */
  java.lang.String getText();
  /**
   * <pre>
   *聊天内容
   * </pre>
   *
   * <code>string text = 3;</code>
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   *目标组id
   * </pre>
   *
   * <code>string group = 4;</code>
   */
  java.lang.String getGroup();
  /**
   * <pre>
   *目标组id
   * </pre>
   *
   * <code>string group = 4;</code>
   */
  com.google.protobuf.ByteString
      getGroupBytes();

  /**
   * <pre>
   *目标用户id，
   * </pre>
   *
   * <code>int32 toId = 5;</code>
   */
  int getToId();

  /**
   * <pre>
   *目标用户nick
   * </pre>
   *
   * <code>string toNick = 6;</code>
   */
  java.lang.String getToNick();
  /**
   * <pre>
   *目标用户nick
   * </pre>
   *
   * <code>string toNick = 6;</code>
   */
  com.google.protobuf.ByteString
      getToNickBytes();
}