// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebRTCDataChannel internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  fun close() {
    __method_bind.close.call(this.toVariant())
  }

  fun getId(): Int {
    val _ret = __method_bind.get_id.call(this.toVariant())
    return _ret.asInt()
  }

  fun getLabel(): String {
    val _ret = __method_bind.get_label.call(this.toVariant())
    return _ret.asString()
  }

  fun getMaxPacketLifeTime(): Int {
    val _ret = __method_bind.get_max_packet_life_time.call(this.toVariant())
    return _ret.asInt()
  }

  fun getMaxRetransmits(): Int {
    val _ret = __method_bind.get_max_retransmits.call(this.toVariant())
    return _ret.asInt()
  }

  fun getProtocol(): String {
    val _ret = __method_bind.get_protocol.call(this.toVariant())
    return _ret.asString()
  }

  fun getReadyState(): ChannelState {
    val _ret = __method_bind.get_ready_state.call(this.toVariant())
    return WebRTCDataChannel.ChannelState.from(_ret.asInt())
  }

  fun getWriteMode(): WriteMode {
    val _ret = __method_bind.get_write_mode.call(this.toVariant())
    return WebRTCDataChannel.WriteMode.from(_ret.asInt())
  }

  fun isNegotiated(): Boolean {
    val _ret = __method_bind.is_negotiated.call(this.toVariant())
    return _ret.asBool()
  }

  fun isOrdered(): Boolean {
    val _ret = __method_bind.is_ordered.call(this.toVariant())
    return _ret.asBool()
  }

  fun poll(): GDError {
    val _ret = __method_bind.poll.call(this.toVariant())
    return GDError.from(_ret.asInt())
  }

  fun setWriteMode(writeMode: Int) {
    val _arg = Variant.new(writeMode)
    __method_bind.set_write_mode.call(this.toVariant(), _arg, 1)
  }

  fun wasStringPacket(): Boolean {
    val _ret = __method_bind.was_string_packet.call(this.toVariant())
    return _ret.asBool()
  }

  enum class WriteMode(
    val value: Int
  ) {
    WRITE_MODE_TEXT(0),

    WRITE_MODE_BINARY(1);

    companion object {
      fun from(value: Int): WriteMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ChannelState(
    val value: Int
  ) {
    STATE_CONNECTING(0),

    STATE_OPEN(1),

    STATE_CLOSING(2),

    STATE_CLOSED(3);

    companion object {
      fun from(value: Int): ChannelState {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val STATE_CLOSED: Int = 3

    val STATE_CLOSING: Int = 2

    val STATE_CONNECTING: Int = 0

    val STATE_OPEN: Int = 1

    val WRITE_MODE_BINARY: Int = 1

    val WRITE_MODE_TEXT: Int = 0

    /**
     * Container for method_bind pointers for WebRTCDataChannel
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val get_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_id" }
        }
      val get_label: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_label" }
        }
      val get_max_packet_life_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_max_packet_life_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_packet_life_time" }
        }
      val get_max_retransmits: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_max_retransmits".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_retransmits" }
        }
      val get_protocol: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_protocol".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_protocol" }
        }
      val get_ready_state: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_ready_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ready_state" }
        }
      val get_write_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_write_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_write_mode" }
        }
      val is_negotiated: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "is_negotiated".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_negotiated" }
        }
      val is_ordered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "is_ordered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ordered" }
        }
      val poll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val set_write_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "set_write_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_write_mode" }
        }
      val was_string_packet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "was_string_packet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method was_string_packet" }
        }}
  }
}
