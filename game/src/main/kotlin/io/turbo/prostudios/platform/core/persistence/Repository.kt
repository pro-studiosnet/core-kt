package io.turbo.prostudios.platform.core.persistence

interface Repository<T> {
    // we fetch the DAO, from some random ass cahceo r some shit
    fun get(): Dao<T>

}