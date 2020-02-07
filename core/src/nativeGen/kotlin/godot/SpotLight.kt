// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SpotLight(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Light(null) {
  var spotAngle: Float
    get() {
       return getParam(5) 
    }
    set(value) {
      setParam(5, value)
    }

  var spotAngleAttenuation: Float
    get() {
       return getParam(6) 
    }
    set(value) {
      setParam(6, value)
    }

  var spotAttenuation: Float
    get() {
       return getParam(4) 
    }
    set(value) {
      setParam(4, value)
    }

  var spotRange: Float
    get() {
       return getParam(3) 
    }
    set(value) {
      setParam(3, value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpotLight".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpotLight" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SpotLight
     */
    private object __method_bind
  }
}
