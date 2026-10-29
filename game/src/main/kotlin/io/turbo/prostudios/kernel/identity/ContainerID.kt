package io.turbo.prostudios.kernel.identity

import io.turbo.prostudios.kernel.data.GenericContainer
import io.turbo.prostudios.kernel.data.MappedContainer
import java.util.UUID

class ContainerID(
    val container: GenericContainer
) {
    private val mapping: MutableMap<UUID, GenericContainer> = mutableMapOf()


    fun id(id: UUID = UUID.randomUUID()) : MappedContainer {
        mapping[id] = this.container
        if (mapping.containsKey(id)) {
            throw IllegalStateException("Mapping already contains key!")
        }

        return MappedContainer(container.name,
                               container.data,
                               container.scope,
                               id)
    }
}