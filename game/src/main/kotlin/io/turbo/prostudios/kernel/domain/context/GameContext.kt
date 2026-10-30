package io.turbo.prostudios.kernel.domain.context

import io.turbo.prostudios.kernel.domain.storage.Scope
import io.turbo.prostudios.kernel.domain.storage.StorageScope
import io.turbo.prostudios.kernel.server.Gamemode

class GameContext(
    val game: Gamemode,
    val scope: Scope = Scope.INTERNAL
) {



}