// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * Represents a key on a keyboard being pressed or released.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/inputs/inputevent.html]($DOCS_URL/tutorials/inputs/inputevent.html)
 *
 * An input event for keys on a keyboard. Supports key presses, key releases and [echo] events. It can also be received in [godot.Node.UnhandledKeyInput].
 *
 * **Note:** Events received from the keyboard usually have all properties set. Event mappings should have only one of the [keycode], [physicalKeycode] or [unicode] set.
 *
 * When events are compared, properties are checked in the following priority - [keycode], [physicalKeycode] and [unicode]. Events with the first matching value will be considered equal.
 */
@GodotBaseType
public open class InputEventKey : InputEventWithModifiers() {
  /**
   * If `true`, the key's state is pressed. If `false`, the key's state is released.
   */
  public var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_PRESSED, NIL)
    }

  /**
   * Latin label printed on the key in the current keyboard layout, which corresponds to one of the [enum Key] constants.
   *
   * To get a human-readable representation of the [godot.InputEventKey], use `OS.get_keycode_string(event.keycode)` where `event` is the [godot.InputEventKey].
   *
   * ```
   * 			    +-----+ +-----+
   * 			    | Q   | | Q   | - "Q" - keycode
   * 			    |   Й | |  ض | - "Й" and "ض" - key_label
   * 			    +-----+ +-----+
   * 			```
   */
  public var keycode: Key
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_KEYCODE, LONG)
      return Key.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_KEYCODE, NIL)
    }

  /**
   * Represents the physical location of a key on the 101/102-key US QWERTY keyboard, which corresponds to one of the [enum Key] constants.
   *
   * To get a human-readable representation of the [godot.InputEventKey], use `OS.get_keycode_string(event.keycode)` where `event` is the [godot.InputEventKey].
   */
  public var physicalKeycode: Key
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_PHYSICAL_KEYCODE, LONG)
      return Key.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_PHYSICAL_KEYCODE, NIL)
    }

  /**
   * Represents the localized label printed on the key in the current keyboard layout, which corresponds to one of the [enum Key] constants or any valid Unicode character.
   *
   * For keyboard layouts with a single label on the key, it is equivalent to [keycode].
   *
   * To get a human-readable representation of the [godot.InputEventKey], use `OS.get_keycode_string(event.key_label)` where `event` is the [godot.InputEventKey].
   *
   * ```
   * 			    +-----+ +-----+
   * 			    | Q   | | Q   | - "Q" - keycode
   * 			    |   Й | |  ض | - "Й" and "ض" - key_label
   * 			    +-----+ +-----+
   * 			```
   */
  public var keyLabel: Key
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_KEY_LABEL, LONG)
      return Key.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_KEY_LABEL, NIL)
    }

  /**
   * The key Unicode character code (when relevant), shifted by modifier keys. Unicode character codes for composite characters and complex scripts may not be available unless IME input mode is active. See [godot.Window.setImeActive] for more information.
   */
  public var unicode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_UNICODE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_UNICODE, NIL)
    }

  /**
   * If `true`, the key was already pressed before this event. It means the user is holding the key down.
   */
  public var echo: Boolean
    @JvmName("isEcho_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isEcho()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_ECHO, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTKEY, scriptIndex)
    return true
  }

  /**
   * Returns the Latin keycode combined with modifier keys such as [kbd]Shift[/kbd] or [kbd]Alt[/kbd]. See also [godot.InputEventWithModifiers].
   *
   * To get a human-readable representation of the [godot.InputEventKey] with modifiers, use `OS.get_keycode_string(event.get_keycode_with_modifiers())` where `event` is the [godot.InputEventKey].
   */
  public fun getKeycodeWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_KEYCODE_WITH_MODIFIERS, LONG)
    return Key.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the physical keycode combined with modifier keys such as [kbd]Shift[/kbd] or [kbd]Alt[/kbd]. See also [godot.InputEventWithModifiers].
   *
   * To get a human-readable representation of the [godot.InputEventKey] with modifiers, use `OS.get_keycode_string(event.get_physical_keycode_with_modifiers())` where `event` is the [godot.InputEventKey].
   */
  public fun getPhysicalKeycodeWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_PHYSICAL_KEYCODE_WITH_MODIFIERS, LONG)
    return Key.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns the localized key label combined with modifier keys such as [kbd]Shift[/kbd] or [kbd]Alt[/kbd]. See also [godot.InputEventWithModifiers].
   *
   * To get a human-readable representation of the [godot.InputEventKey] with modifiers, use `OS.get_keycode_string(event.get_key_label_with_modifiers())` where `event` is the [godot.InputEventKey].
   */
  public fun getKeyLabelWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_KEY_LABEL_WITH_MODIFIERS, LONG)
    return Key.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Returns a [godot.String] representation of the event's [keycode] and modifiers.
   */
  public fun asTextKeycode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_AS_TEXT_KEYCODE,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a [godot.String] representation of the event's [physicalKeycode] and modifiers.
   */
  public fun asTextPhysicalKeycode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_AS_TEXT_PHYSICAL_KEYCODE, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a [godot.String] representation of the event's [keyLabel] and modifiers.
   */
  public fun asTextKeyLabel(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_AS_TEXT_KEY_LABEL,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object
}
