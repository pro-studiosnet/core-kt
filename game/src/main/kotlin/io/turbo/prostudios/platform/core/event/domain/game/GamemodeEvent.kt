package io.turbo.prostudios.platform.core.event.domain.game

import io.turbo.prostudios.kernel.server.Gamemode

/**
 *
 * Define a gamemode-specific event.
 *
 * @author TurboMaxe
 */

interface GamemodeEvent {

    fun type(): Gamemode

}