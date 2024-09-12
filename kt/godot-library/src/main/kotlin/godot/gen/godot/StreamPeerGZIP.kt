// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This class allows to compress or decompress data using GZIP/deflate in a streaming fashion. This
 * is particularly useful when compressing or decompressing files that have to be sent through the
 * network without needing to allocate them all in memory.
 * After starting the stream via [startCompression] (or [startDecompression]), calling
 * [StreamPeer.putPartialData] on this stream will compress (or decompress) the data, writing it to the
 * internal buffer. Calling [StreamPeer.getAvailableBytes] will return the pending bytes in the
 * internal buffer, and [StreamPeer.getPartialData] will retrieve the compressed (or decompressed)
 * bytes from it. When the stream is over, you must call [finish] to ensure the internal buffer is
 * properly flushed (make sure to call [StreamPeer.getAvailableBytes] on last time to check if more
 * data needs to be read after that).
 */
@GodotBaseType
public open class StreamPeerGZIP : StreamPeer() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_STREAMPEERGZIP, scriptIndex)
  }

  /**
   * Start the stream in compression mode with the given [bufferSize], if [useDeflate] is `true`
   * uses deflate instead of GZIP.
   */
  @JvmOverloads
  public final fun startCompression(useDeflate: Boolean = false, bufferSize: Int = 65535):
      GodotError {
    TransferContext.writeArguments(BOOL to useDeflate, LONG to bufferSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.startCompressionPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Start the stream in decompression mode with the given [bufferSize], if [useDeflate] is `true`
   * uses deflate instead of GZIP.
   */
  @JvmOverloads
  public final fun startDecompression(useDeflate: Boolean = false, bufferSize: Int = 65535):
      GodotError {
    TransferContext.writeArguments(BOOL to useDeflate, LONG to bufferSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.startDecompressionPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Finalizes the stream, compressing or decompressing any buffered chunk left.
   */
  public final fun finish(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.finishPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Clears this stream, resetting the internal state.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val startCompressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerGZIP", "start_compression", 781582770)

    public val startDecompressionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerGZIP", "start_decompression", 781582770)

    public val finishPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerGZIP", "finish", 166280745)

    public val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StreamPeerGZIP", "clear", 3218959716)
  }
}
