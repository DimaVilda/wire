// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/external_message.proto
package com.squareup.wire.protos.simple;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.Extension;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.FLOAT;

public final class ExternalMessage extends ExtendableMessage<ExternalMessage> {

  public static final Float DEFAULT_F = 20F;

  @ProtoField(
    tag = 1,
    type = FLOAT
  )
  public final Float f;

  private ExternalMessage(Builder builder) {
    super(builder);
    this.f = builder.f;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof ExternalMessage)) return false;
    ExternalMessage o = (ExternalMessage) other;
    if (!extensionsEqual(o)) return false;
    return equals(f, o.f);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = extensionsHashCode();
      result = result * 37 + (f != null ? f.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends ExtendableBuilder<ExternalMessage> {

    public Float f;

    public Builder() {
    }

    public Builder(ExternalMessage message) {
      super(message);
      if (message == null) return;
      this.f = message.f;
    }

    public Builder f(Float f) {
      this.f = f;
      return this;
    }

    @Override
    public <E> Builder setExtension(Extension<ExternalMessage, E> extension, E value) {
      super.setExtension(extension, value);
      return this;
    }

    @Override
    public ExternalMessage build() {
      return new ExternalMessage(this);
    }
  }
}
