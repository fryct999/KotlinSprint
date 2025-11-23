package org.example.lesson_14.tutorial

open class Spaceship(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false
) {
    fun switchToWarpMode() {
        println("$name: start warp mode.")
    }

    open fun runSystemDiagnostic() {
        println("$name: start ship diagnostic.")
    }
}