package io.turbo.prostudios.kernel.event.domain.bukkit.world.block

import io.turbo.prostudios.kernel.event.Event
import org.bukkit.block.Block

abstract class BlockEvent(
    val block: Block,
) : Event {

}