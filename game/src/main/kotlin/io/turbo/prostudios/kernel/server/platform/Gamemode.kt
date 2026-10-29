package io.turbo.prostudios.kernel.server.platform

import main.kotlin.io.turbo.prostudios.data.GenericContainer

interface Gamemode {

    fun online(): Int

    fun availableObj(): List<GenericContainer>

}