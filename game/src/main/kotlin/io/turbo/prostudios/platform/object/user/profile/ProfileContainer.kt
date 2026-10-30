package io.turbo.prostudios.platform.`object`.user.profile

import io.turbo.prostudios.platform.`object`.BukkitObject
import io.turbo.prostudios.kernel.domain.storage.StorageScope
import io.turbo.prostudios.platform.core.data.GenericContainer
import java.lang.IllegalStateException

class ProfileContainer(playerName: String,
                       data: List<BukkitObject>,
                       scope: StorageScope
    ) : GenericContainer(playerName, data, scope) {

    inner class Builder {
        private val data: MutableList<BukkitObject> = mutableListOf()
        private var name = ""


        fun name(string: String): Builder {
            this.name = string
            return this
        }

        fun add(obj: BukkitObject): Builder {
            this.data.add(obj)
            return this
        }

        fun build(): GenericContainer {
            if (name.isEmpty() ||
                data.isEmpty()
            ) {
                throw IllegalStateException("Data or Name is Empty!!!!")
            }
            return ProfileContainer(name, data, scope)
        }
    }
}