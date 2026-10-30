package io.turbo.prostudios.platform.`object`

import org.bukkit.Location
import org.bukkit.World
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import kotlin.reflect.KClass

/**
 * A way to map Bukkit objects (e.g. Players, ItemStack), to a
 * server object.
 *
 * @author TurboMaxe
 */

enum class ObjectType(
    val clazz: KClass<*>
) {
    PLAYER(Class<Player>),
    ITEM(Class<ItemStack>),
    WORLD(Class<World>),
    LOC(Class<Location>)

}