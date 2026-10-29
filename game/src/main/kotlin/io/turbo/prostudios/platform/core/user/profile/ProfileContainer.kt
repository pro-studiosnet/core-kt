package io.turbo.prostudios.platform.core.user.profile

import main.kotlin.io.turbo.prostudios.data.GenericContainer
import main.kotlin.io.turbo.prostudios.kernel.bukkit.BukkitObject
import java.lang.IllegalStateException

class ProfileContainer(playerName: String,
                       data: List<BukkitObject<*>>
    ) : GenericContainer(playerName, data) {

    inner class Builder {
        private val data: MutableList<BukkitObject<*>> = mutableListOf()
        private var name = ""


        fun name(string: String): Builder {
            this.name = string
            return this
        }

        fun add(obj: BukkitObject<*>): Builder {
            this.data.add(obj)
            return this
        }

        fun build(): GenericContainer {
            if (name.isEmpty() ||
                data.isEmpty()
            ) {
                throw IllegalStateException("Data or Name is Empty!!!!")
            }
            return ProfileContainer(name, data)
        }
    }
}