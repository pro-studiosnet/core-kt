package io.turbo.prostudios.kernel.storage

import io.turbo.prostudios.kernel.server.platform.Gamemode

/**
 *  Defines the boundaries of where a
 *  container or object can be accessed.
 *
 *  @author TurboMaxe
 */

class StorageScope(
    scope: Scope = Scope.INTERNAL
) {
    var objectNativeGamemode: Gamemode? = null

}