// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ARVRInterface internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    val ArvrAr: Int = 4

    val ArvrExcessiveMotion: Int = 1

    val ArvrExternal: Int = 8

    val ArvrInsufficientFeatures: Int = 2

    val ArvrMono: Int = 1

    val ArvrNone: Int = 0

    val ArvrNormalTracking: Int = 0

    val ArvrNotTracking: Int = 4

    val ArvrStereo: Int = 2

    val ArvrUnknownTracking: Int = 3

    val EyeLeft: Int = 1

    val EyeMono: Int = 0

    val EyeRight: Int = 2
  }
}