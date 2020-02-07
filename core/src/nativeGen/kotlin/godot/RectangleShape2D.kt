// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RectangleShape2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape2D(null) {
  var extents: Vector2
    get() {
       return getExtents() 
    }
    set(value) {
      setExtents(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for extents
   */
  fun extents(cb: Vector2.() -> Unit) {
    val _p = extents
    cb(_p)
    extents = _p
  }

  fun getExtents(): Vector2 {
    val _ret = __method_bind.getExtents.call(this._handle)
    return _ret.asVector2()
  }

  fun setExtents(extents: Vector2) {
    val _arg = Variant.new(extents)
    __method_bind.setExtents.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RectangleShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RectangleShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RectangleShape2D
     */
    private object __method_bind {
      val getExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RectangleShape2D".cstr.ptr,
            "get_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_extents" }
        }
      val setExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RectangleShape2D".cstr.ptr,
            "set_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_extents" }
        }}
  }
}
