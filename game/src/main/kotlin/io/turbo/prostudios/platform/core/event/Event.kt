package io.turbo.prostudios.platform.core.event

import io.turbo.prostudios.platform.core.event.domain.EventType

/**
 * Basic event.
 *
 */

interface Event {

    fun type(): EventType
}