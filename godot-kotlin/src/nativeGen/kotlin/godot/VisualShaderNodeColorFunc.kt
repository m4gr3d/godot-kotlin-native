// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class VisualShaderNodeColorFunc(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNode(null) {
  var function: Function
    get() {
       return getFunction() 
    }
    set(value) {
      setFunction(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFunction(): Function {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFunction.call(self._handle, emptyList(), _retPtr)
      VisualShaderNodeColorFunc.Function.from(_ret.value)
    }
  }

  fun setFunction(func: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFunction.call(self._handle, listOf(func), null)
    }
  }

  enum class Function(
    val value: Int
  ) {
    FUNC_GRAYSCALE(0),

    FUNC_SEPIA(1);

    companion object {
      fun from(value: Int): Function {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeColorFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeColorFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeColorFunc
     */
    private object __method_bind {
      val getFunction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeColorFunc".cstr.ptr,
            "get_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function" }
        }
      val setFunction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeColorFunc".cstr.ptr,
            "set_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function" }
        }}
  }
}
