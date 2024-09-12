// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * [TextServerManager] is the API backend for loading, enumerating, and switching [TextServer]s.
 * **Note:** Switching text server at runtime is possible, but will invalidate all fonts and text
 * buffers. Make sure to unload all controls, fonts, and themes before doing so.
 */
@GodotBaseType
public object TextServerManager : Object() {
  /**
   * Emitted when a new interface has been added.
   */
  public val interfaceAdded: Signal1<StringName> by signal("interfaceName")

  /**
   * Emitted when an interface is removed.
   */
  public val interfaceRemoved: Signal1<StringName> by signal("interfaceName")

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_TEXTSERVERMANAGER)
  }

  /**
   * Registers a [TextServer] interface.
   */
  public final fun addInterface(_interface: TextServer?): Unit {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.addInterfacePtr, NIL)
  }

  /**
   * Returns the number of interfaces currently registered.
   */
  public final fun getInterfaceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes an interface. All fonts and shaped text caches should be freed before removing an
   * interface.
   */
  public final fun removeInterface(_interface: TextServer?): Unit {
    TransferContext.writeArguments(OBJECT to _interface)
    TransferContext.callMethod(rawPtr, MethodBindings.removeInterfacePtr, NIL)
  }

  /**
   * Returns the interface registered at a given index.
   */
  public final fun getInterface(idx: Int): TextServer? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TextServer?)
  }

  /**
   * Returns a list of available interfaces, with the index and name of each interface.
   */
  public final fun getInterfaces(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInterfacesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Finds an interface by its [name].
   */
  public final fun findInterface(name: String): TextServer? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TextServer?)
  }

  /**
   * Sets the primary [TextServer] interface.
   */
  public final fun setPrimaryInterface(index: TextServer?): Unit {
    TransferContext.writeArguments(OBJECT to index)
    TransferContext.callMethod(rawPtr, MethodBindings.setPrimaryInterfacePtr, NIL)
  }

  /**
   * Returns the primary [TextServer] interface currently in use.
   */
  public final fun getPrimaryInterface(): TextServer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPrimaryInterfacePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as TextServer?)
  }

  internal object MethodBindings {
    public val addInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "add_interface", 1799689403)

    public val getInterfaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_interface_count", 3905245786)

    public val removeInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "remove_interface", 1799689403)

    public val getInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_interface", 1672475555)

    public val getInterfacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_interfaces", 3995934104)

    public val findInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "find_interface", 2240905781)

    public val setPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "set_primary_interface", 1799689403)

    public val getPrimaryInterfacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerManager", "get_primary_interface", 905850878)
  }
}
