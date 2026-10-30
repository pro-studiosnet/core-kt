package io.turbo.prostudios.platform.core.data

import io.turbo.prostudios.platform.`object`.BukkitObject
import io.turbo.prostudios.kernel.domain.storage.StorageScope

abstract class GenericContainer(
    val name: String,
    val data: List<BukkitObject>,
    val scope: StorageScope
) : BaseContainer {

}