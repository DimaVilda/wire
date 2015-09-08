// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 332:1
package com.google.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;

public final class FieldOptions extends Message<FieldOptions> {
  private static final long serialVersionUID = 0L;

  public static final CType DEFAULT_CTYPE = CType.STRING;

  public static final Boolean DEFAULT_PACKED = false;

  public static final Boolean DEFAULT_DEPRECATED = false;

  public static final String DEFAULT_EXPERIMENTAL_MAP_KEY = "";

  /**
   * The ctype option instructs the C++ code generator to use a different
   * representation of the field than it normally would.  See the specific
   * options below.  This option is not yet implemented in the open source
   * release -- sorry, we'll try to include it in a future version!
   */
  @ProtoField(
      tag = 1,
      type = Message.Datatype.ENUM
  )
  public final CType ctype;

  /**
   * The packed option can be enabled for repeated primitive fields to enable
   * a more efficient representation on the wire. Rather than repeatedly
   * writing the tag and type for each element, the entire array is encoded as
   * a single length-delimited blob.
   */
  @ProtoField(
      tag = 2,
      type = Message.Datatype.BOOL
  )
  public final Boolean packed;

  /**
   * Is this field deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for accessors, or it will be completely ignored; in the very least, this
   * is a formalization for deprecating fields.
   */
  @ProtoField(
      tag = 3,
      type = Message.Datatype.BOOL
  )
  public final Boolean deprecated;

  /**
   * EXPERIMENTAL.  DO NOT USE.
   * For "map" fields, the name of the field in the enclosed type that
   * is the key for this map.  For example, suppose we have:
   *   message Item {
   *     required string name = 1;
   *     required string value = 2;
   *   }
   *   message Config {
   *     repeated Item items = 1 [experimental_map_key="name"];
   *   }
   * In this situation, the map key for Item will be set to "name".
   * TODO: Fully-implement this, then remove the "experimental_" prefix.
   */
  @ProtoField(
      tag = 9,
      type = Message.Datatype.STRING
  )
  public final String experimental_map_key;

  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @ProtoField(
      tag = 999,
      label = Message.Label.REPEATED
  )
  public final List<UninterpretedOption> uninterpreted_option;

  public FieldOptions(CType ctype, Boolean packed, Boolean deprecated, String experimental_map_key, List<UninterpretedOption> uninterpreted_option) {
    this.ctype = ctype;
    this.packed = packed;
    this.deprecated = deprecated;
    this.experimental_map_key = experimental_map_key;
    this.uninterpreted_option = immutableCopyOf(uninterpreted_option);
  }

  private FieldOptions(Builder builder) {
    this(builder.ctype, builder.packed, builder.deprecated, builder.experimental_map_key, builder.uninterpreted_option);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FieldOptions)) return false;
    FieldOptions o = (FieldOptions) other;
    if (!extensionsEqual(o)) return false;
    return equals(ctype, o.ctype)
        && equals(packed, o.packed)
        && equals(deprecated, o.deprecated)
        && equals(experimental_map_key, o.experimental_map_key)
        && equals(uninterpreted_option, o.uninterpreted_option);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = extensionsHashCode();
      result = result * 37 + (ctype != null ? ctype.hashCode() : 0);
      result = result * 37 + (packed != null ? packed.hashCode() : 0);
      result = result * 37 + (deprecated != null ? deprecated.hashCode() : 0);
      result = result * 37 + (experimental_map_key != null ? experimental_map_key.hashCode() : 0);
      result = result * 37 + (uninterpreted_option != null ? uninterpreted_option.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<FieldOptions, Builder> {
    public CType ctype;

    public Boolean packed;

    public Boolean deprecated;

    public String experimental_map_key;

    public List<UninterpretedOption> uninterpreted_option = Collections.emptyList();

    public Builder() {
    }

    public Builder(FieldOptions message) {
      super(message);
      if (message == null) return;
      this.ctype = message.ctype;
      this.packed = message.packed;
      this.deprecated = message.deprecated;
      this.experimental_map_key = message.experimental_map_key;
      this.uninterpreted_option = copyOf(message.uninterpreted_option);
    }

    /**
     * The ctype option instructs the C++ code generator to use a different
     * representation of the field than it normally would.  See the specific
     * options below.  This option is not yet implemented in the open source
     * release -- sorry, we'll try to include it in a future version!
     */
    public Builder ctype(CType ctype) {
      this.ctype = ctype;
      return this;
    }

    /**
     * The packed option can be enabled for repeated primitive fields to enable
     * a more efficient representation on the wire. Rather than repeatedly
     * writing the tag and type for each element, the entire array is encoded as
     * a single length-delimited blob.
     */
    public Builder packed(Boolean packed) {
      this.packed = packed;
      return this;
    }

    /**
     * Is this field deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for accessors, or it will be completely ignored; in the very least, this
     * is a formalization for deprecating fields.
     */
    public Builder deprecated(Boolean deprecated) {
      this.deprecated = deprecated;
      return this;
    }

    /**
     * EXPERIMENTAL.  DO NOT USE.
     * For "map" fields, the name of the field in the enclosed type that
     * is the key for this map.  For example, suppose we have:
     *   message Item {
     *     required string name = 1;
     *     required string value = 2;
     *   }
     *   message Config {
     *     repeated Item items = 1 [experimental_map_key="name"];
     *   }
     * In this situation, the map key for Item will be set to "name".
     * TODO: Fully-implement this, then remove the "experimental_" prefix.
     */
    public Builder experimental_map_key(String experimental_map_key) {
      this.experimental_map_key = experimental_map_key;
      return this;
    }

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    public Builder uninterpreted_option(List<UninterpretedOption> uninterpreted_option) {
      this.uninterpreted_option = canonicalizeList(uninterpreted_option);
      return this;
    }

    @Override
    public FieldOptions build() {
      return new FieldOptions(this);
    }
  }

  public enum CType implements ProtoEnum {
    /**
     * Default mode.
     */
    STRING(0),

    CORD(1),

    STRING_PIECE(2);

    private final int value;

    CType(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
