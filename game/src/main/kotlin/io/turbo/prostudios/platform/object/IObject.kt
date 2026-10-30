package io.turbo.prostudios.platform.`object`

import io.turbo.prostudios.kernel.domain.storage.StorageScope

interface IObject {

    fun scope(): StorageScope

}