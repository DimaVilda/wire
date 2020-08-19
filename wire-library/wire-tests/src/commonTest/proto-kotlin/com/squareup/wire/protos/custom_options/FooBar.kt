// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.custom_options.FooBar in custom_options.proto
package com.squareup.wire.protos.custom_options

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.internal.immutableCopyOf
import com.squareup.wire.internal.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

class FooBar(
  @MyFieldOptionOne(17)
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val foo: Int? = null,
  @MyFieldOptionTwo(33.5f)
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val bar: String? = null,
  @MyFieldOptionThree(FooBarBazEnum.BAR)
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.protos.custom_options.FooBar${'$'}Nested#ADAPTER"
  )
  val baz: Nested? = null,
  @MyFieldOptionOne(18)
  @MyFieldOptionTwo(34.5f)
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  val qux: Long? = null,
  fred: List<Float> = emptyList(),
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  val daisy: Double? = null,
  nested: List<FooBar> = emptyList(),
  /**
   * Extension source: custom_options.proto
   */
  @field:WireField(
    tag = 101,
    adapter = "com.squareup.wire.protos.custom_options.FooBar${'$'}FooBarBazEnum#ADAPTER"
  )
  val ext: FooBarBazEnum? = null,
  rep: List<FooBarBazEnum> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY
) : Message<FooBar, Nothing>(ADAPTER, unknownFields) {
  @MyFieldOptionTwo(99.9f)
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#FLOAT",
    label = WireField.Label.REPEATED
  )
  val fred: List<Float> = immutableCopyOf("fred", fred)

  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER",
    label = WireField.Label.REPEATED,
    redacted = true
  )
  val nested: List<FooBar> = immutableCopyOf("nested", nested)

  /**
   * Extension source: custom_options.proto
   */
  @field:WireField(
    tag = 102,
    adapter = "com.squareup.wire.protos.custom_options.FooBar${'$'}FooBarBazEnum#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val rep: List<FooBarBazEnum> = immutableCopyOf("rep", rep)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FooBar) return false
    if (unknownFields != other.unknownFields) return false
    if (foo != other.foo) return false
    if (bar != other.bar) return false
    if (baz != other.baz) return false
    if (qux != other.qux) return false
    if (fred != other.fred) return false
    if (daisy != other.daisy) return false
    if (nested != other.nested) return false
    if (ext != other.ext) return false
    if (rep != other.rep) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + foo.hashCode()
      result = result * 37 + bar.hashCode()
      result = result * 37 + baz.hashCode()
      result = result * 37 + qux.hashCode()
      result = result * 37 + fred.hashCode()
      result = result * 37 + daisy.hashCode()
      result = result * 37 + nested.hashCode()
      result = result * 37 + ext.hashCode()
      result = result * 37 + rep.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (foo != null) result += """foo=$foo"""
    if (bar != null) result += """bar=${sanitize(bar)}"""
    if (baz != null) result += """baz=$baz"""
    if (qux != null) result += """qux=$qux"""
    if (fred.isNotEmpty()) result += """fred=$fred"""
    if (daisy != null) result += """daisy=$daisy"""
    if (nested.isNotEmpty()) result += """nested=██"""
    if (ext != null) result += """ext=$ext"""
    if (rep.isNotEmpty()) result += """rep=$rep"""
    return result.joinToString(prefix = "FooBar{", separator = ", ", postfix = "}")
  }

  fun copy(
    foo: Int? = this.foo,
    bar: String? = this.bar,
    baz: Nested? = this.baz,
    qux: Long? = this.qux,
    fred: List<Float> = this.fred,
    daisy: Double? = this.daisy,
    nested: List<FooBar> = this.nested,
    ext: FooBarBazEnum? = this.ext,
    rep: List<FooBarBazEnum> = this.rep,
    unknownFields: ByteString = this.unknownFields
  ): FooBar = FooBar(foo, bar, baz, qux, fred, daisy, nested, ext, rep, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<FooBar> = object : ProtoAdapter<FooBar>(
      FieldEncoding.LENGTH_DELIMITED, 
      FooBar::class, 
      "type.googleapis.com/squareup.protos.custom_options.FooBar", 
      PROTO_2, 
      null
    ) {
      override fun encodedSize(value: FooBar): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.foo)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.bar)
        size += Nested.ADAPTER.encodedSizeWithTag(3, value.baz)
        size += ProtoAdapter.UINT64.encodedSizeWithTag(4, value.qux)
        size += ProtoAdapter.FLOAT.asRepeated().encodedSizeWithTag(5, value.fred)
        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, value.daisy)
        size += FooBar.ADAPTER.asRepeated().encodedSizeWithTag(7, value.nested)
        size += FooBarBazEnum.ADAPTER.encodedSizeWithTag(101, value.ext)
        size += FooBarBazEnum.ADAPTER.asRepeated().encodedSizeWithTag(102, value.rep)
        return size
      }

      override fun encode(writer: ProtoWriter, value: FooBar) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.foo)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.bar)
        Nested.ADAPTER.encodeWithTag(writer, 3, value.baz)
        ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.qux)
        ProtoAdapter.FLOAT.asRepeated().encodeWithTag(writer, 5, value.fred)
        ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, value.daisy)
        FooBar.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.nested)
        FooBarBazEnum.ADAPTER.encodeWithTag(writer, 101, value.ext)
        FooBarBazEnum.ADAPTER.asRepeated().encodeWithTag(writer, 102, value.rep)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): FooBar {
        var foo: Int? = null
        var bar: String? = null
        var baz: Nested? = null
        var qux: Long? = null
        val fred = mutableListOf<Float>()
        var daisy: Double? = null
        val nested = mutableListOf<FooBar>()
        var ext: FooBarBazEnum? = null
        val rep = mutableListOf<FooBarBazEnum>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> foo = ProtoAdapter.INT32.decode(reader)
            2 -> bar = ProtoAdapter.STRING.decode(reader)
            3 -> baz = Nested.ADAPTER.decode(reader)
            4 -> qux = ProtoAdapter.UINT64.decode(reader)
            5 -> fred.add(ProtoAdapter.FLOAT.decode(reader))
            6 -> daisy = ProtoAdapter.DOUBLE.decode(reader)
            7 -> nested.add(FooBar.ADAPTER.decode(reader))
            101 -> try {
              ext = FooBarBazEnum.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            102 -> try {
              rep.add(FooBarBazEnum.ADAPTER.decode(reader))
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return FooBar(
          foo = foo,
          bar = bar,
          baz = baz,
          qux = qux,
          fred = fred,
          daisy = daisy,
          nested = nested,
          ext = ext,
          rep = rep,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: FooBar): FooBar = value.copy(
        baz = value.baz?.let(Nested.ADAPTER::redact),
        nested = emptyList(),
        unknownFields = ByteString.EMPTY
      )
    }
  }

  class Nested(
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.protos.custom_options.FooBar${'$'}FooBarBazEnum#ADAPTER"
    )
    val value: FooBarBazEnum? = null,
    unknownFields: ByteString = ByteString.EMPTY
  ) : Message<Nested, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Nothing = throw AssertionError()

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is Nested) return false
      if (unknownFields != other.unknownFields) return false
      if (value != other.value) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + value.hashCode()
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      if (value != null) result += """value=$value"""
      return result.joinToString(prefix = "Nested{", separator = ", ", postfix = "}")
    }

    fun copy(value: FooBarBazEnum? = this.value, unknownFields: ByteString = this.unknownFields):
        Nested = Nested(value, unknownFields)

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<Nested> = object : ProtoAdapter<Nested>(
        FieldEncoding.LENGTH_DELIMITED, 
        Nested::class, 
        "type.googleapis.com/squareup.protos.custom_options.FooBar.Nested", 
        PROTO_2, 
        null
      ) {
        override fun encodedSize(value: Nested): Int {
          var size = value.unknownFields.size
          size += FooBarBazEnum.ADAPTER.encodedSizeWithTag(1, value.value)
          return size
        }

        override fun encode(writer: ProtoWriter, value: Nested) {
          FooBarBazEnum.ADAPTER.encodeWithTag(writer, 1, value.value)
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): Nested {
          var value: FooBarBazEnum? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> try {
                value = FooBarBazEnum.ADAPTER.decode(reader)
              } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
                reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
              }
              else -> reader.readUnknownField(tag)
            }
          }
          return Nested(
            value = value,
            unknownFields = unknownFields
          )
        }

        override fun redact(value: Nested): Nested = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  class More(
    serial: List<Int> = emptyList(),
    unknownFields: ByteString = ByteString.EMPTY
  ) : Message<More, Nothing>(ADAPTER, unknownFields) {
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.REPEATED
    )
    val serial: List<Int> = immutableCopyOf("serial", serial)

    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Nothing = throw AssertionError()

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is More) return false
      if (unknownFields != other.unknownFields) return false
      if (serial != other.serial) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + serial.hashCode()
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      if (serial.isNotEmpty()) result += """serial=$serial"""
      return result.joinToString(prefix = "More{", separator = ", ", postfix = "}")
    }

    fun copy(serial: List<Int> = this.serial, unknownFields: ByteString = this.unknownFields): More
        = More(serial, unknownFields)

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<More> = object : ProtoAdapter<More>(
        FieldEncoding.LENGTH_DELIMITED, 
        More::class, 
        "type.googleapis.com/squareup.protos.custom_options.FooBar.More", 
        PROTO_2, 
        null
      ) {
        override fun encodedSize(value: More): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, value.serial)
          return size
        }

        override fun encode(writer: ProtoWriter, value: More) {
          ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 1, value.serial)
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): More {
          val serial = mutableListOf<Int>()
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> serial.add(ProtoAdapter.INT32.decode(reader))
              else -> reader.readUnknownField(tag)
            }
          }
          return More(
            serial = serial,
            unknownFields = unknownFields
          )
        }

        override fun redact(value: More): More = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  enum class FooBarBazEnum(
    override val value: Int,
    val enum_value_option: Int?,
    val complex_enum_value_option: More?,
    val foreign_enum_value_option: Boolean?
  ) : WireEnum {
    FOO(1, 17, More(
      serial = listOf(
        99,
        199
      )
    ), null),

    BAR(2, null, null, true),

    BAZ(3, 18, null, false);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<FooBarBazEnum> = object : EnumAdapter<FooBarBazEnum>(
        FooBarBazEnum::class, 
        PROTO_2, 
        null
      ) {
        override fun fromValue(value: Int): FooBarBazEnum? = FooBarBazEnum.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): FooBarBazEnum? = when (value) {
        1 -> FOO
        2 -> BAR
        3 -> BAZ
        else -> null
      }
    }
  }
}
