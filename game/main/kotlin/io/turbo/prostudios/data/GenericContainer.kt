package main.kotlin.io.turbo.prostudios.data

import main.kotlin.io.turbo.prostudios.kernel.bukkit.BukkitObject

abstract class GenericContainer(
    val name: String,
    val data: List<BukkitObject<*>>
) {

}