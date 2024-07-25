// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.packed_encoding.OuterMessage in packed_encoding.proto
@file:Suppress(
  "DEPRECATION",
  "RUNTIME_ANNOTATION_NOT_SUPPORTED",
)

package squareup.protos.packed_encoding

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import okio.ByteString

public class OuterMessage(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 0,
  )
  public val outer_number_before: Int? = null,
  @field:WireField(
    tag = 2,
    adapter = "squareup.protos.packed_encoding.EmbeddedMessage#ADAPTER",
    schemaIndex = 1,
  )
  public val embedded_message: EmbeddedMessage? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<OuterMessage, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is OuterMessage) return false
    if (unknownFields != other.unknownFields) return false
    if (outer_number_before != other.outer_number_before) return false
    if (embedded_message != other.embedded_message) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (outer_number_before?.hashCode() ?: 0)
      result = result * 37 + (embedded_message?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (outer_number_before != null) result += """outer_number_before=$outer_number_before"""
    if (embedded_message != null) result += """embedded_message=$embedded_message"""
    return result.joinToString(prefix = "OuterMessage{", separator = ", ", postfix = "}")
  }

  public fun copy(
    outer_number_before: Int? = this.outer_number_before,
    embedded_message: EmbeddedMessage? = this.embedded_message,
    unknownFields: ByteString = this.unknownFields,
  ): OuterMessage = OuterMessage(outer_number_before, embedded_message, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<OuterMessage> = object : ProtoAdapter<OuterMessage>(
      FieldEncoding.LENGTH_DELIMITED, 
      OuterMessage::class, 
      "type.googleapis.com/squareup.protos.packed_encoding.OuterMessage", 
      PROTO_2, 
      null, 
      "packed_encoding.proto"
    ) {
      override fun encodedSize(`value`: OuterMessage): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.outer_number_before)
        size += EmbeddedMessage.ADAPTER.encodedSizeWithTag(2, value.embedded_message)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: OuterMessage) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.outer_number_before)
        EmbeddedMessage.ADAPTER.encodeWithTag(writer, 2, value.embedded_message)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: OuterMessage) {
        writer.writeBytes(value.unknownFields)
        EmbeddedMessage.ADAPTER.encodeWithTag(writer, 2, value.embedded_message)
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.outer_number_before)
      }

      override fun decode(reader: ProtoReader): OuterMessage {
        var outer_number_before: Int? = null
        var embedded_message: EmbeddedMessage? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> outer_number_before = ProtoAdapter.INT32.decode(reader)
            2 -> embedded_message = EmbeddedMessage.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return OuterMessage(
          outer_number_before = outer_number_before,
          embedded_message = embedded_message,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: OuterMessage): OuterMessage = value.copy(
        embedded_message = value.embedded_message?.let(EmbeddedMessage.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
