package org.example.cinescope

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform