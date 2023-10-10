// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.person.Person in person.proto
package com.squareup.wire.protos.kotlin.person

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.missingRequiredFields
import com.squareup.wire.`internal`.redactElements
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import okio.ByteString

/**
 * Message representing a person, includes their name, unique ID number, email and phone number.
 */
public class Person(
  /**
   * The customer's ID number.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.REQUIRED,
    schemaIndex = 0,
  )
  @JvmField
  public val id: Int,
  /**
   * The customer's full name.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REQUIRED,
    schemaIndex = 1,
  )
  @JvmField
  public val name: String,
  /**
   * Email address for the customer.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 2,
  )
  @JvmField
  public val email: String? = null,
  phone: List<PhoneNumber> = emptyList(),
  aliases: List<String> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Person, Person.Builder>(ADAPTER, unknownFields) {
  /**
   * A list of the customer's phone numbers.
   */
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.protos.kotlin.person.Person${'$'}PhoneNumber#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 3,
  )
  @JvmField
  public val phone: List<PhoneNumber> = immutableCopyOf("phone", phone)

  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED,
    schemaIndex = 4,
  )
  @JvmField
  public val aliases: List<String> = immutableCopyOf("aliases", aliases)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.id = id
    builder.name = name
    builder.email = email
    builder.phone = phone
    builder.aliases = aliases
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Person) return false
    if (unknownFields != other.unknownFields) return false
    if (id != other.id) return false
    if (name != other.name) return false
    if (email != other.email) return false
    if (phone != other.phone) return false
    if (aliases != other.aliases) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + id.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + (email?.hashCode() ?: 0)
      result = result * 37 + phone.hashCode()
      result = result * 37 + aliases.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """id=$id"""
    result += """name=${sanitize(name)}"""
    if (email != null) result += """email=${sanitize(email)}"""
    if (phone.isNotEmpty()) result += """phone=$phone"""
    if (aliases.isNotEmpty()) result += """aliases=${sanitize(aliases)}"""
    return result.joinToString(prefix = "Person{", separator = ", ", postfix = "}")
  }

  public fun copy(
    id: Int = this.id,
    name: String = this.name,
    email: String? = this.email,
    phone: List<PhoneNumber> = this.phone,
    aliases: List<String> = this.aliases,
    unknownFields: ByteString = this.unknownFields,
  ): Person = Person(id, name, email, phone, aliases, unknownFields)

  public class Builder : Message.Builder<Person, Builder>() {
    @JvmField
    public var id: Int? = null

    @JvmField
    public var name: String? = null

    @JvmField
    public var email: String? = null

    @JvmField
    public var phone: List<PhoneNumber> = emptyList()

    @JvmField
    public var aliases: List<String> = emptyList()

    /**
     * The customer's ID number.
     */
    public fun id(id: Int): Builder {
      this.id = id
      return this
    }

    /**
     * The customer's full name.
     */
    public fun name(name: String): Builder {
      this.name = name
      return this
    }

    /**
     * Email address for the customer.
     */
    public fun email(email: String?): Builder {
      this.email = email
      return this
    }

    /**
     * A list of the customer's phone numbers.
     */
    public fun phone(phone: List<PhoneNumber>): Builder {
      checkElementsNotNull(phone)
      this.phone = phone
      return this
    }

    public fun aliases(aliases: List<String>): Builder {
      checkElementsNotNull(aliases)
      this.aliases = aliases
      return this
    }

    override fun build(): Person = Person(
      id = id ?: throw missingRequiredFields(id, "id"),
      name = name ?: throw missingRequiredFields(name, "name"),
      email = email,
      phone = phone,
      aliases = aliases,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Person> = object : ProtoAdapter<Person>(
      FieldEncoding.LENGTH_DELIMITED, 
      Person::class, 
      "type.googleapis.com/squareup.protos.kotlin.person.Person", 
      PROTO_2, 
      null, 
      "person.proto"
    ) {
      override fun encodedSize(`value`: Person): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.id)
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.email)
        size += PhoneNumber.ADAPTER.asRepeated().encodedSizeWithTag(4, value.phone)
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, value.aliases)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Person) {
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.id)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.email)
        PhoneNumber.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.phone)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, value.aliases)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Person) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, value.aliases)
        PhoneNumber.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.phone)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.email)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.id)
      }

      override fun decode(reader: ProtoReader): Person {
        var id: Int? = null
        var name: String? = null
        var email: String? = null
        val phone = mutableListOf<PhoneNumber>()
        val aliases = mutableListOf<String>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            2 -> id = ProtoAdapter.INT32.decode(reader)
            1 -> name = ProtoAdapter.STRING.decode(reader)
            3 -> email = ProtoAdapter.STRING.decode(reader)
            4 -> phone.add(PhoneNumber.ADAPTER.decode(reader))
            5 -> aliases.add(ProtoAdapter.STRING.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return Person(
          id = id ?: throw missingRequiredFields(id, "id"),
          name = name ?: throw missingRequiredFields(name, "name"),
          email = email,
          phone = phone,
          aliases = aliases,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Person): Person = value.copy(
        phone = value.phone.redactElements(PhoneNumber.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    public inline fun build(body: Builder.() -> Unit): Person = Builder().apply(body).build()
  }

  /**
   * Represents the type of the phone number: mobile, home or work.
   */
  public enum class PhoneType(
    override val `value`: Int,
  ) : WireEnum {
    MOBILE(0),
    HOME(1),
    /**
     * Could be phone or fax.
     */
    WORK(2),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<PhoneType> = object : EnumAdapter<PhoneType>(
        PhoneType::class, 
        PROTO_2, 
        PhoneType.MOBILE
      ) {
        override fun fromValue(`value`: Int): PhoneType? = PhoneType.fromValue(value)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): PhoneType? = when (value) {
        0 -> MOBILE
        1 -> HOME
        2 -> WORK
        else -> null
      }
    }
  }

  public class PhoneNumber(
    /**
     * The customer's phone number.
     */
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REQUIRED,
      schemaIndex = 0,
    )
    @JvmField
    public val number: String,
    /**
     * The type of phone stored here.
     */
    @field:WireField(
      tag = 2,
      adapter = "com.squareup.wire.protos.kotlin.person.Person${'$'}PhoneType#ADAPTER",
      schemaIndex = 1,
    )
    @JvmField
    public val type: PhoneType? = null,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<PhoneNumber, PhoneNumber.Builder>(ADAPTER, unknownFields) {
    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.number = number
      builder.type = type
      builder.addUnknownFields(unknownFields)
      return builder
    }

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is PhoneNumber) return false
      if (unknownFields != other.unknownFields) return false
      if (number != other.number) return false
      if (type != other.type) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + number.hashCode()
        result = result * 37 + (type?.hashCode() ?: 0)
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      result += """number=${sanitize(number)}"""
      if (type != null) result += """type=$type"""
      return result.joinToString(prefix = "PhoneNumber{", separator = ", ", postfix = "}")
    }

    public fun copy(
      number: String = this.number,
      type: PhoneType? = this.type,
      unknownFields: ByteString = this.unknownFields,
    ): PhoneNumber = PhoneNumber(number, type, unknownFields)

    public class Builder : Message.Builder<PhoneNumber, Builder>() {
      @JvmField
      public var number: String? = null

      @JvmField
      public var type: PhoneType? = null

      /**
       * The customer's phone number.
       */
      public fun number(number: String): Builder {
        this.number = number
        return this
      }

      /**
       * The type of phone stored here.
       */
      public fun type(type: PhoneType?): Builder {
        this.type = type
        return this
      }

      override fun build(): PhoneNumber = PhoneNumber(
        number = number ?: throw missingRequiredFields(number, "number"),
        type = type,
        unknownFields = buildUnknownFields()
      )
    }

    public companion object {
      @JvmField
      public val DEFAULT_TYPE: PhoneType = PhoneType.HOME

      @JvmField
      public val ADAPTER: ProtoAdapter<PhoneNumber> = object : ProtoAdapter<PhoneNumber>(
        FieldEncoding.LENGTH_DELIMITED, 
        PhoneNumber::class, 
        "type.googleapis.com/squareup.protos.kotlin.person.Person.PhoneNumber", 
        PROTO_2, 
        null, 
        "person.proto"
      ) {
        override fun encodedSize(`value`: PhoneNumber): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.number)
          size += PhoneType.ADAPTER.encodedSizeWithTag(2, value.type)
          return size
        }

        override fun encode(writer: ProtoWriter, `value`: PhoneNumber) {
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.number)
          PhoneType.ADAPTER.encodeWithTag(writer, 2, value.type)
          writer.writeBytes(value.unknownFields)
        }

        override fun encode(writer: ReverseProtoWriter, `value`: PhoneNumber) {
          writer.writeBytes(value.unknownFields)
          PhoneType.ADAPTER.encodeWithTag(writer, 2, value.type)
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.number)
        }

        override fun decode(reader: ProtoReader): PhoneNumber {
          var number: String? = null
          var type: PhoneType? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> number = ProtoAdapter.STRING.decode(reader)
              2 -> try {
                type = PhoneType.ADAPTER.decode(reader)
              } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
                reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
              }
              else -> reader.readUnknownField(tag)
            }
          }
          return PhoneNumber(
            number = number ?: throw missingRequiredFields(number, "number"),
            type = type,
            unknownFields = unknownFields
          )
        }

        override fun redact(`value`: PhoneNumber): PhoneNumber = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L

      public inline fun build(body: Builder.() -> Unit): PhoneNumber = Builder().apply(body).build()
    }
  }
}
