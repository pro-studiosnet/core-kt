package io.turbo.prostudios.platform.core.event

import io.turbo.prostudios.kernel.domain.context.GameContext
import io.turbo.prostudios.kernel.domain.event.types.Event
import io.turbo.prostudios.kernel.domain.storage.Scope

abstract class GameEvent(
    val scope: Scope,
    val context: GameContext
) : Event {



}