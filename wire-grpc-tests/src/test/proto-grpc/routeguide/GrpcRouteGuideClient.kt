// Code generated by Wire protocol buffer compiler, do not edit.
// Source: routeguide.RouteGuide in routeguide/RouteGuideProto.proto
@file:Suppress(
  "DEPRECATION",
  "RUNTIME_ANNOTATION_NOT_SUPPORTED",
)

package routeguide

import com.squareup.wire.GrpcCall
import com.squareup.wire.GrpcClient
import com.squareup.wire.GrpcMethod
import com.squareup.wire.GrpcStreamingCall
import kotlin.Suppress

/**
 * Interface exported by the server.
 */
public class GrpcRouteGuideClient(
  private val client: GrpcClient,
) : RouteGuideClient {
  /**
   * A simple RPC.
   *
   * Obtains the feature at a given position.
   *
   * A feature with an empty name is returned if there's no feature at the given
   * position.
   */
  override fun GetFeature(): GrpcCall<Point, Feature> = client.newCall(GrpcMethod(
      path = "/routeguide.RouteGuide/GetFeature",
      requestAdapter = Point.ADAPTER,
      responseAdapter = Feature.ADAPTER
  ))

  /**
   * A server-to-client streaming RPC.
   *
   * Obtains the Features available within the given Rectangle.  Results are
   * streamed rather than returned at once (e.g. in a response message with a
   * repeated field), as the rectangle may cover a large area and contain a
   * huge number of features.
   */
  override fun ListFeatures(): GrpcStreamingCall<Rectangle, Feature> =
      client.newStreamingCall(GrpcMethod(
      path = "/routeguide.RouteGuide/ListFeatures",
      requestAdapter = Rectangle.ADAPTER,
      responseAdapter = Feature.ADAPTER
  ))

  /**
   * A client-to-server streaming RPC.
   *
   * Accepts a stream of Points on a route being traversed, returning a
   * RouteSummary when traversal is completed.
   */
  override fun RecordRoute(): GrpcStreamingCall<Point, RouteSummary> =
      client.newStreamingCall(GrpcMethod(
      path = "/routeguide.RouteGuide/RecordRoute",
      requestAdapter = Point.ADAPTER,
      responseAdapter = RouteSummary.ADAPTER
  ))

  /**
   * A Bidirectional streaming RPC.
   *
   * Accepts a stream of RouteNotes sent while a route is being traversed,
   * while receiving other RouteNotes (e.g. from other users).
   */
  override fun RouteChat(): GrpcStreamingCall<RouteNote, RouteNote> =
      client.newStreamingCall(GrpcMethod(
      path = "/routeguide.RouteGuide/RouteChat",
      requestAdapter = RouteNote.ADAPTER,
      responseAdapter = RouteNote.ADAPTER
  ))
}
