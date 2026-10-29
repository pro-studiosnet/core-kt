package io.turbo.prostudios.kernel.event.domain.bukkit.player

import io.turbo.prostudios.kernel.event.Event
import main.kotlin.io.turbo.prostudios.kernel.user.User

abstract class PlayerEvent(
    val player: User,
) : Event {

    abstract fun otherPlayer(): User?

}