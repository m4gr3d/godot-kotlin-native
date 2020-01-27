// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptComment internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getDescription(): String {
    val _ret = __method_bind.get_description.call(this.toVariant())
    return _ret.asString()
  }

  fun getSize(): Vector2 {
    val _ret = __method_bind.get_size.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getTitle(): String {
    val _ret = __method_bind.get_title.call(this.toVariant())
    return _ret.asString()
  }

  fun setDescription(description: String) {
    val _arg = Variant.new(description)
    __method_bind.set_description.call(this.toVariant(), _arg, 1)
  }

  fun setSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.set_size.call(this.toVariant(), _arg, 1)
  }

  fun setTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.set_title.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): VisualScriptComment = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptComment".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptComment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptComment(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptComment = VisualScriptComment(ptr)
    /**
     * Container for method_bind pointers for VisualScriptComment
     */
    private object __method_bind {
      val get_description: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "get_description".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_description" }
        }
      val get_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val get_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "get_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_title" }
        }
      val set_description: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "set_description".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_description" }
        }
      val set_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val set_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "set_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_title" }
        }}
  }
}
