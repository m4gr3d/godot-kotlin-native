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

open class VisualScriptMathConstant(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var constant: MathConstant
    get() {
       return getMathConstant() 
    }
    set(value) {
      setMathConstant(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getMathConstant(): MathConstant {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMathConstant.call(self._handle, emptyList(), _retPtr)
      VisualScriptMathConstant.MathConstant.from(_ret.value)
    }
  }

  fun setMathConstant(which: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMathConstant.call(self._handle, listOf(which), null)
    }
  }

  enum class MathConstant(
    val value: Int
  ) {
    ONE(0),

    PI(1),

    HALF_PI(2),

    TAU(3),

    E(4),

    SQRT2(5),

    INF(6),

    NAN(7),

    MAX(8);

    companion object {
      fun from(value: Int): MathConstant {
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptMathConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptMathConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptMathConstant
     */
    private object __method_bind {
      val getMathConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptMathConstant".cstr.ptr,
            "get_math_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_math_constant" }
        }
      val setMathConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptMathConstant".cstr.ptr,
            "set_math_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_math_constant" }
        }}
  }
}
