package io.turbo.prostudios.kernel.storage

enum class Scope {
   INTERNAL, // Accessible from one gamemode
   SHARED, // Shared across multiple gamemodes
   GLOBAL // Shared across the server
}