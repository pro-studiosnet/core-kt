package io.turbo.prostudios.kernel.event.domain.game

import io.turbo.prostudios.kernel.server.platform.Gamemode

interface GamemodeEvent {

    fun type(): Gamemode

}