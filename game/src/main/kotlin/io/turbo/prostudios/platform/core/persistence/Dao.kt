package io.turbo.prostudios.platform.core.persistence

import org.checkerframework.checker.units.qual.t
import java.util.UUID

interface Dao<T> {

    fun read(id: UUID): T

    fun write(data: T): UUID

    fun update(data: T, vararg param: String): Unit

    fun delete(data: T)

}