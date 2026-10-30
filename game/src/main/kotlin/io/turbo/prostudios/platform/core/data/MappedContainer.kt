package io.turbo.prostudios.platform.core.data

import io.turbo.prostudios.platform.`object`.BukkitObject
import io.turbo.prostudios.kernel.domain.storage.StorageScope
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