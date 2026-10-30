package io.turbo.prostudios.platform.`object`

import io.turbo.prostudios.kernel.domain.storage.StorageScope
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import javax.xml.stream.Location

/**
 *
 * Provides an interface to construct immutable
 * Bukkit objects using a number of functions.
 *
 * @author TurboMaxe
 */

class BukkitObject private constructor(
    val obj: Any,
    val scope: StorageScope = StorageScope()
) : IObject {

    override fun scope() = this.scope

    companion object {
        val objectConsumer: (Any) -> BukkitObject = { t -> BukkitObject(t) }

        fun location(location: Location): BukkitObject {
            return objectConsumer(location)
        }

        fun item(item: ItemStack): BukkitObject {
            return objectConsumer(item)
        }

        fun player(player: Player): BukkitObject {
            return objectConsumer(player)
        }

        fun material(material: Material): BukkitObject {
            return objectConsumer(material)
        }

        fun world(world: World): BukkitObject {
            return objectConsumer(world)
        }
    }
}