package main.kotlin.io.turbo.prostudios.kernel.user.profile

import main.kotlin.io.turbo.prostudios.kernel.user.User
import main.kotlin.io.turbo.prostudios.data.UserContainer
import kotlin.reflect.KClass

class PlayerProfile<T : User>(
    val container: UserContainer
) {

    inline fun <reified T : User> userType(): KClass<User> {
        return T::class as KClass<User>;
    }

}