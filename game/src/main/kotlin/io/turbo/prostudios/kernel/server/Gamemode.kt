package io.turbo.prostudios.kernel.server

import io.turbo.prostudios.kernel.domain.context.GameContext
import io.turbo.prostudios.platform.core.data.GenericContainer

interface Gamemode {

    fun online(): Int

    fun availableObj(): List<GenericContainer>

    fun context(): GameContext
}