package io.turbo.prostudios.kernel.data

import io.turbo.prostudios.kernel.bukkit.BukkitObject
import io.turbo.prostudios.kernel.storage.StorageScope
import jdk.internal.vm.ThreadContainers.container
import java.util.*

open class MappedContainer(name: String,
                      data: List<BukkitObject>,
                      scope: StorageScope,
                      val id: UUID
) : GenericContainer(name, data, scope) {

    constructor(container: GenericContainer) :
            this(container.name,
                 container.data,
                 container.scope,
                 UUID.randomUUID()
    ) {

    }



}