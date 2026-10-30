package io.turbo.prostudios.platform.`object`.user.profile

import main.kotlin.io.turbo.prostudios.kernel.user.User
import kotlin.reflect.KClass

class PlayerProfile<T : User>(
    val container: ProfileContainer
) {

    inline fun <reified T : User> userType(): KClass<User> {
        return T::class as KClass<User>;
    }

}