package io.turbo.prostudios.platform.core.event.domain.game

import io.turbo.prostudios.kernel.domain.event.types.Event

/**
 *
 * Define a feature-specific event.
 *
 * @author TurboMaxe
 */

interface FeatureEvent : Event {

    fun feature(): String

}