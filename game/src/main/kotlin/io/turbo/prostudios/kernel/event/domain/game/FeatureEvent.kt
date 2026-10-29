package io.turbo.prostudios.kernel.event.domain.game

import io.turbo.prostudios.kernel.event.Event

interface FeatureEvent : Event {

    fun name(): String

}