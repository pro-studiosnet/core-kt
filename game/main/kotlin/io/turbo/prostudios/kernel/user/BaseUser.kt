package main.kotlin.io.turbo.prostudios.kernel.user

/**
 * Defines an online or offline player.
 *
 * @author TurboMaxe
 */

abstract class BaseUser(
    val name: String,
    val connected: Boolean,
) : User {

}