package org.example.lesson_14.tutorial

class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterburnerSpeed: Int,
) : Spaceship(name, speed) {
    fun handleDataFromRadar() {
        println("$name: handle radar data.")
    }

    fun runAfterburner() {
        println("$name start afterburner.")
    }
}