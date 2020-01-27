// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CenterContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  fun isUsingTopLeft(): Boolean {
    val _ret = __method_bind.is_using_top_left.call(this._handle)
    return _ret.asBool()
  }

  fun setUseTopLeft(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_use_top_left.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CenterContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CenterContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CenterContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CenterContainer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CenterContainer = CenterContainer(ptr)
    /**
     * Container for method_bind pointers for CenterContainer
     */
    private object __method_bind {
      val is_using_top_left: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CenterContainer".cstr.ptr,
            "is_using_top_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_top_left" }
        }
      val set_use_top_left: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CenterContainer".cstr.ptr,
            "set_use_top_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_top_left" }
        }}
  }
}
