package dev.ellestria.aurelia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform