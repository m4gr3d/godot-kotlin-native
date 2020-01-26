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

open class EditorPlugin internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  companion object {
    val ContainerCanvasEditorBottom: Int = 8

    val ContainerCanvasEditorMenu: Int = 5

    val ContainerCanvasEditorSideLeft: Int = 6

    val ContainerCanvasEditorSideRight: Int = 7

    val ContainerProjectSettingTabLeft: Int = 10

    val ContainerProjectSettingTabRight: Int = 11

    val ContainerPropertyEditorBottom: Int = 9

    val ContainerSpatialEditorBottom: Int = 4

    val ContainerSpatialEditorMenu: Int = 1

    val ContainerSpatialEditorSideLeft: Int = 2

    val ContainerSpatialEditorSideRight: Int = 3

    val ContainerToolbar: Int = 0

    val DockSlotLeftBl: Int = 1

    val DockSlotLeftBr: Int = 3

    val DockSlotLeftUl: Int = 0

    val DockSlotLeftUr: Int = 2

    val DockSlotMax: Int = 8

    val DockSlotRightBl: Int = 5

    val DockSlotRightBr: Int = 7

    val DockSlotRightUl: Int = 4

    val DockSlotRightUr: Int = 6

    fun new(): EditorPlugin = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for EditorPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      EditorPlugin(
        fn()
      )
    }}
}