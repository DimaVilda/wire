// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.packed_encoding.EmbeddedMessage in packed_encoding.proto
import Wire

public struct EmbeddedMessage {

    public var inner_repeated_number: [Int32] = []
    @ProtoDefaulted
    public var inner_number_after: Int32?
    public var unknownFields: UnknownFields = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension EmbeddedMessage : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension EmbeddedMessage : Hashable {
}
#endif

extension EmbeddedMessage : Sendable {
}

extension EmbeddedMessage : ProtoDefaultedValue {

    public static var defaultedValue: EmbeddedMessage {
        EmbeddedMessage()
    }
}

extension EmbeddedMessage : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.packed_encoding.EmbeddedMessage"
    }

}

extension EmbeddedMessage : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var inner_repeated_number: [Int32] = []
        var inner_number_after: Int32? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: try protoReader.decode(into: &inner_repeated_number)
            case 2: inner_number_after = try protoReader.decode(Int32.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self.inner_repeated_number = inner_repeated_number
        self._inner_number_after.wrappedValue = inner_number_after
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.inner_repeated_number, packed: true)
        try protoWriter.encode(tag: 2, value: self.inner_number_after)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension EmbeddedMessage : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self.inner_repeated_number = try container.decodeProtoArray(Int32.self, firstOfKeys: "innerRepeatedNumber", "inner_repeated_number")
        self._inner_number_after.wrappedValue = try container.decodeIfPresent(Int32.self, firstOfKeys: "innerNumberAfter", "inner_number_after")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)
        let preferCamelCase = encoder.protoKeyNameEncodingStrategy == .camelCase
        let includeDefaults = encoder.protoDefaultValuesEncodingStrategy == .include

        if includeDefaults || !self.inner_repeated_number.isEmpty {
            try container.encodeProtoArray(self.inner_repeated_number, forKey: preferCamelCase ? "innerRepeatedNumber" : "inner_repeated_number")
        }
        try container.encodeIfPresent(self.inner_number_after, forKey: preferCamelCase ? "innerNumberAfter" : "inner_number_after")
    }

}
#endif
