package org.example.lesson_14

open class LinerShip(
    open val name: String,
    open val speed: Int = 150,
    open val passengerCount: Int = 300,
    open val cargoVolume: Int = 1000,
    open val canIceBreaking: Boolean = false,
)

class IndustrialShip(
    override val name: String
) : LinerShip(
    name = name,
    speed = 100,
    passengerCount = 100,
    cargoVolume = 5000,
)

class IcebreakerShip(
    override val name: String
) : LinerShip(
    name = name,
    speed = 50,
    passengerCount = 100,
    cargoVolume = 500,
    canIceBreaking = true,
)

fun main() {
    val liner1 = LinerShip(name = "Liner1")
    val industrial1 = IndustrialShip(name = "Industrial1")
    val icebreakerShip1 = IcebreakerShip(name = "iceBreaker1")
}