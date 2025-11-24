package org.example.lesson_14

open class LinerShip(
    open val name: String,
    open val speed: Int,
    open val cargoVolume: Int = 0,
    open val passengerCount: Int = 0,
    open val canIceBreaking: Boolean = false,
)

class IndustrialShip(
    name: String,
    speed: Int,
    override val cargoVolume: Int,
) : LinerShip(name, speed)

class IcebreakerShip(
    name: String,
    speed: Int,
    override val  cargoVolume: Int,
    override val  canIceBreaking: Boolean = true,
) : LinerShip(name, speed)

fun main() {
    val liner1 = LinerShip(name = "Liner1", speed = 500, cargoVolume = 150, passengerCount = 300)
    val industrial1 = IndustrialShip(name = "Industrial1", speed = 320, cargoVolume = 500)
    val icebreakerShip1 = IcebreakerShip(name = "iceBreaker1", speed = 300, cargoVolume = 100)
}