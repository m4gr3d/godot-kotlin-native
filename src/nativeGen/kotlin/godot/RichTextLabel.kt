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

open class RichTextLabel internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    val AlignCenter: Int = 1

    val AlignFill: Int = 3

    val AlignLeft: Int = 0

    val AlignRight: Int = 2

    val ItemAlign: Int = 8

    val ItemColor: Int = 5

    val ItemFont: Int = 4

    val ItemFrame: Int = 0

    val ItemImage: Int = 2

    val ItemIndent: Int = 9

    val ItemList: Int = 10

    val ItemMeta: Int = 12

    val ItemNewline: Int = 3

    val ItemStrikethrough: Int = 7

    val ItemTable: Int = 11

    val ItemText: Int = 1

    val ItemUnderline: Int = 6

    val ListDots: Int = 2

    val ListLetters: Int = 1

    val ListNumbers: Int = 0

    fun new(): RichTextLabel = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RichTextLabel".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for RichTextLabel" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      RichTextLabel(
        fn()
      )
    }}
}