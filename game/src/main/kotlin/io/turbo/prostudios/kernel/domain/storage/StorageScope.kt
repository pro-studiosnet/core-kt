package io.turbo.prostudios.kernel.domain.storage

import io.turbo.prostudios.kernel.server.Gamemode

/**
 *  Defines the boundaries of where a
 *  container or object can be accessed.
 *
 *  @author TurboMaxe
 */

class StorageScope(
    scope: Scope = Scope.INTERNAL
) {
    var originGamemode: Gamemode? = null

}