package io.turbo.prostudios.platform.`object`.user

import main.kotlin.io.turbo.prostudios.kernel.user.User
import org.bukkit.entity.Player

/**
 * Defines an online or offline player.
 *
 * @author TurboMaxe
 */

abstract class BaseUser(
    val name: String,
    val connected: Boolean,
) : User {

    constructor(player: Player) : this(player.name, player.isConnected) {

    }

}