package io.turbo.prostudios.kernel.domain.event.types.internal

import io.turbo.prostudios.kernel.domain.context.GameContext

/**
 *
 * Represents an internal event, executed in a single bounded context (i.e. GameContext),
 * extended by event classes who are only executed in one bounded context.
 *
 * @author TurboMaxe
 */

interface Internal {

    fun context(): GameContext

}