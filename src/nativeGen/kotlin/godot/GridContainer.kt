// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GridContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  fun getColumns(): Int {
    val _ret = __method_bind.get_columns.call(this.toVariant())
    return _ret.asInt()
  }

  fun setColumns(columns: Int) {
    val _arg = Variant.new(columns)
    __method_bind.set_columns.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): GridContainer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GridContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GridContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GridContainer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): GridContainer = GridContainer(ptr)
    /**
     * Container for method_bind pointers for GridContainer
     */
    private object __method_bind {
      val get_columns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridContainer".cstr.ptr,
            "get_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_columns" }
        }
      val set_columns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridContainer".cstr.ptr,
            "set_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_columns" }
        }}
  }
}
