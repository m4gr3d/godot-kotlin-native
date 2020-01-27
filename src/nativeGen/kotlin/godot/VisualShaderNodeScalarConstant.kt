// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeScalarConstant internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getConstant(): Float {
    val _ret = __method_bind.get_constant.call(this._handle)
    return _ret.asFloat()
  }

  fun setConstant(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.set_constant.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualShaderNodeScalarConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeScalarConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeScalarConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeScalarConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeScalarConstant =
        VisualShaderNodeScalarConstant(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeScalarConstant
     */
    private object __method_bind {
      val get_constant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarConstant".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val set_constant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarConstant".cstr.ptr,
            "set_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant" }
        }}
  }
}
