package godot

import gdnative.*
import kotlinx.cinterop.*
import kotlin.native.concurrent.AtomicReference

object Godot {
  private val gdnativeWrapper = AtomicReference<CPointer<godot_gdnative_core_api_struct>?>(null)
  private val nativescriptWrapper = AtomicReference<CPointer<godot_gdnative_ext_nativescript_api_struct>?>(null)

  internal val gdnative: godot_gdnative_core_api_struct
    get() = checkNotNull(gdnativeWrapper.value).pointed

  internal val gdnative11: godot_gdnative_core_1_1_api_struct
    get() = checkNotNull(gdnative.next).reinterpret<godot_gdnative_core_1_1_api_struct>().pointed

  internal val gdnative12: godot_gdnative_core_1_2_api_struct
    get() = checkNotNull(gdnative11.next).reinterpret<godot_gdnative_core_1_2_api_struct>().pointed

  internal val nativescript: godot_gdnative_ext_nativescript_api_struct
    get() = checkNotNull(nativescriptWrapper.value).pointed

  fun init(options: godot_gdnative_init_options) {
    val gdnative = checkNotNull(options.api_struct)
    val extensionCount = gdnative.pointed.num_extensions.toInt()
    val extensions = checkNotNull(gdnative.pointed.extensions)
    lateinit var nativescript: CPointer<godot_gdnative_ext_nativescript_api_struct>
    (0..extensionCount).forEach { i ->
      val extension = checkNotNull(extensions[i])
      when (extension.pointed.type) {
        GDNATIVE_API_TYPES.GDNATIVE_EXT_NATIVESCRIPT.value -> {
          nativescript = extension.reinterpret()
        }
        else -> {
        }
      }
    }

    gdnativeWrapper.compareAndSwap(null, gdnative)
    nativescriptWrapper.compareAndSwap(null, nativescript)
  }

  fun terminate(options: godot_gdnative_terminate_options) {
    gdnativeWrapper.compareAndSwap(gdnativeWrapper.value, null)
    nativescriptWrapper.compareAndSwap(nativescriptWrapper.value, null)
  }

  fun nativescriptInit(handle: COpaquePointer, setup: NativeScriptApi.() -> Unit) {
    setup(NativeScriptApi(handle))
  }

  fun print(msg: String) {
    print(GDString.new(msg))
  }

  fun print(msg: GDString) {
    memScoped {
      checkNotNull(gdnative.godot_print)(msg._value.ptr)
    }
  }
}