package io.turbo.prostudios.kernel.domain.event.types.integrated

import io.turbo.prostudios.kernel.domain.context.GameContext


/**
 *
 * Represents an integrated event, executed between contexts (i.e. two or more GameContext(s)),
 * extended by event classes who are to be executed when an operation is done between two
 * contexts.
 *
 * @author TurboMaxe
 */

interface Integrated {

    fun context(): List<GameContext>

}