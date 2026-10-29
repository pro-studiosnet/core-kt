package io.turbo.prostudios.platform.core.data

import io.turbo.prostudios.kernel.bukkit.BukkitObject
import io.turbo.prostudios.kernel.storage.StorageScope

abstract class GenericContainer(
    val name: String,
    val data: List<BukkitObject>,
    val scope: StorageScope
) : BaseContainer {

}