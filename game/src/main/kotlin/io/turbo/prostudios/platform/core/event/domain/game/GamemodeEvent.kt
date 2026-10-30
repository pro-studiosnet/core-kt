package io.turbo.prostudios.platform.core.event.domain.game

import io.turbo.prostudios.kernel.server.Gamemode
import io.turbo.prostudios.kernel.domain.event.types.Event
import io.turbo.prostudios.platform.core.event.GameEvent

/**
 *
 * Define a gamemode-specific event.
 *
 * @author TurboMaxe
 */

abstract class GamemodeEvent(
    val gamemode: Gamemode
) : GameEvent(gamemode.context().scope, gamemode.context()) {

}