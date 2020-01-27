// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Popup internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun isExclusive(): Boolean {
    val _ret = __method_bind.is_exclusive.call(this._handle)
    return _ret.asBool()
  }

  fun popup(bounds: Rect2) {
    val _arg = Variant.new(bounds)
    __method_bind.popup.call(this._handle, _arg, 1)
  }

  fun popupCentered(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.popup_centered.call(this._handle, _arg, 1)
  }

  fun popupCenteredClamped(size: Vector2, fallbackRatio: Float) {
    val _args = VariantArray.new()
    _args.append(size)
    _args.append(fallbackRatio)
    __method_bind.popup_centered_clamped.call(this._handle, _args.toVariant(), 2)
  }

  fun popupCenteredMinsize(minsize: Vector2) {
    val _arg = Variant.new(minsize)
    __method_bind.popup_centered_minsize.call(this._handle, _arg, 1)
  }

  fun popupCenteredRatio(ratio: Float) {
    val _arg = Variant.new(ratio)
    __method_bind.popup_centered_ratio.call(this._handle, _arg, 1)
  }

  fun setExclusive(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_exclusive.call(this._handle, _arg, 1)
  }

  companion object {
    val NOTIFICATION_POPUP_HIDE: Int = 81

    val NOTIFICATION_POST_POPUP: Int = 80

    fun new(): Popup = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Popup".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Popup" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Popup(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Popup = Popup(ptr)
    /**
     * Container for method_bind pointers for Popup
     */
    private object __method_bind {
      val is_exclusive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "is_exclusive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_exclusive" }
        }
      val popup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup" }
        }
      val popup_centered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered" }
        }
      val popup_centered_clamped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered_clamped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered_clamped" }
        }
      val popup_centered_minsize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered_minsize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered_minsize" }
        }
      val popup_centered_ratio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered_ratio" }
        }
      val set_exclusive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "set_exclusive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exclusive" }
        }}
  }
}
