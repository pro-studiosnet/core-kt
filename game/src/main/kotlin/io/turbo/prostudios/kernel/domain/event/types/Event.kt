package io.turbo.prostudios.kernel.domain.event.types

import io.turbo.prostudios.platform.core.event.domain.EventType

/**
 * Basic event.
 *
 */

interface Event {

    fun type(): EventType
}