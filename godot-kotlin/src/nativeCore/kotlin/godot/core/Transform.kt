package godot.core

import gdnative.godot_transform
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.readValue

class Transform(
  value: CValue<godot_transform>
) : CoreType<godot_transform>(value) {

  constructor(): this(__new())
  constructor(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3, origin: Vector3): this(__new(xAxis, yAxis, zAxis, origin))
  constructor(basis: Basis, origin: Vector3): this(__new(basis, origin))
  constructor(from: Quat): this(__new(from))

  var basis: Basis
    get() = Allocator.allocationScope {
      Basis(
        checkNotNull(Godot.gdnative.godot_transform_get_basis)(_value.ptr)
      )
    }
    set(value) {
      _value = Allocator.allocationScope {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_transform_set_basis)(ptr, value._value.ptr)
        ptr.pointed.readValue()
      }
    }

  fun basis(cb: Basis.() -> Unit) {
    val value = basis
    cb(value)
    basis = value
  }

  var origin: Vector3
    get() = Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_transform_get_origin)(_value.ptr)
      )
    }
    set(value) {
      _value = Allocator.allocationScope {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_transform_set_origin)(ptr, value._value.ptr)
        ptr.pointed.readValue()
      }
    }

  fun origin(cb: Vector3.() -> Unit) {
    val value = origin
    cb(value)
    origin = value
  }

  fun affineInverse(): Transform {
    return Allocator.allocationScope {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_affine_inverse)(_value.ptr)
      )
    }
  }

  @MissingGDNativeAPI("Transform::interpolate_with")
  fun interpolateWith(transform: Transform, weight: Float): Transform = missingGDNativeAPI()

  fun lookingAt(target: Vector3, up: Vector3): Transform {
    return Allocator.allocationScope {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_looking_at)(_value.ptr, target._value.ptr, up._value.ptr)
      )
    }
  }

  fun orthonormalized(): Transform {
    return Allocator.allocationScope {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_orthonormalized)(_value.ptr)
      )
    }
  }

  fun rotated(axis: Vector3, phi: Float): Transform {
    return Allocator.allocationScope {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_rotated)(_value.ptr, axis._value.ptr, phi)
      )
    }
  }

  fun scaled(scale: Vector3): Transform {
    return Allocator.allocationScope {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_scaled)(_value.ptr, scale._value.ptr)
      )
    }
  }

  fun translated(offset: Vector3): Transform {
    return Allocator.allocationScope {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_translated)(_value.ptr, offset._value.ptr)
      )
    }
  }

  fun xform(aabb: AABB): AABB {
    return Allocator.allocationScope {
      AABB(
        checkNotNull(Godot.gdnative.godot_transform_xform_aabb)(_value.ptr, aabb._value.ptr)
      )
    }
  }

  fun xform(vec: Vector3): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_transform_xform_vector3)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun xform(plane: Plane): Plane {
    return Allocator.allocationScope {
      Plane(
        checkNotNull(Godot.gdnative.godot_transform_xform_plane)(_value.ptr, plane._value.ptr)
      )
    }
  }

  fun xformInverse(aabb: AABB): AABB {
    return Allocator.allocationScope {
      AABB(
        checkNotNull(Godot.gdnative.godot_transform_xform_inv_aabb)(_value.ptr, aabb._value.ptr)
      )
    }
  }

  fun xformInverse(vec: Vector3): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_transform_xform_inv_vector3)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun xformInverse(plane: Plane): Plane {
    return Allocator.allocationScope {
      Plane(
        checkNotNull(Godot.gdnative.godot_transform_xform_inv_plane)(_value.ptr, plane._value.ptr)
      )
    }
  }

  operator fun times(other: Transform): Transform {
    return Allocator.allocationScope {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_operator_multiply)(_value.ptr, other._value.ptr)
      )
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null || other !is Transform) {
      return false
    }
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_transform_operator_equal)(_value.ptr, other._value.ptr)
    }
  }

  override fun hashCode(): Int {
    return _value.hashCode()
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_transform_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    val IDENTITY: Transform
      get() = Transform(Vector3(1, 0, 0), Vector3(0, 1, 0), Vector3(0, 0, 1), Vector3(0, 0, 0))

    val FLIP_X: Transform
      get() = Transform(Vector3(-1, 0, 0), Vector3(0, 1, 0), Vector3(0, 0, 1), Vector3(0, 0, 0))

    val FLIP_Y: Transform
      get() = Transform(Vector3(1, 0, 0), Vector3(0, -1, 0), Vector3(0, 0, 1), Vector3(0, 0, 0))

    val FLIP_Z: Transform
      get() = Transform(Vector3(1, 0, 0), Vector3(0, 1, 0), Vector3(0, 0, -1), Vector3(0, 0, 0))

    internal fun __new() = allocType2<godot_transform> {
      checkNotNull(Godot.gdnative.godot_transform_new_identity)(it)
    }

    internal fun __new(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3, origin: Vector3) = allocType2<godot_transform> {
      checkNotNull(Godot.gdnative.godot_transform_new_with_axis_origin)(
        it,
        xAxis._value.ptr,
        yAxis._value.ptr,
        zAxis._value.ptr,
        origin._value.ptr
      )
    }

    internal fun __new(basis: Basis, origin: Vector3) = allocType2<godot_transform> {
      checkNotNull(Godot.gdnative.godot_transform_new)(it, basis._value.ptr, origin._value.ptr)
    }

    internal fun __new(from: Quat) = allocType2<godot_transform> {
      checkNotNull(Godot.gdnative11.godot_transform_new_with_quat)(it, from._value.ptr)
    }
  }
}