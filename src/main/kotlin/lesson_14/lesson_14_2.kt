package org.example.lesson_14

open class LinerShip(
    val name: String,
    val speed: Int,
    val cargoVolume: Int = 0,
    val passengerCount: Int = 0,
    val canIceBreaking: Boolean = false,
) {}

class IndustrialShip(
    name: String,
    speed: Int,
    cargoVolume: Int,
) : LinerShip(name, speed, cargoVolume) {}

class IcebreakerShip(
    name: String,
    speed: Int,
    cargoVolume: Int,
    canIceBreaking: Boolean = true,
) : LinerShip(name, speed, cargoVolume, canIceBreaking = canIceBreaking) {}

fun main() {

}