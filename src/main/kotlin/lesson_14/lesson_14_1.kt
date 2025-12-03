package org.example.lesson_14

open class LinerShip2(
    open val name: String,
    open val speed: Int = 150,
    open val passengerCount: Int = 300,
    open val cargoVolume: Int = 1000,
    open val canIceBreaking: Boolean = false,
)

class IndustrialShip2(
    override val name: String
) : LinerShip2(
    name = name,
    speed = 100,
    passengerCount = 100,
    cargoVolume = 5000,
)

class IcebreakerShip2(
    override val name: String
) : LinerShip2(
    name = name,
    speed = 50,
    passengerCount = 100,
    cargoVolume = 500,
    canIceBreaking = true,
)

fun main() {
    val liner1 = LinerShip2(name = "Liner1")
    val industrial1 = IndustrialShip2(name = "Industrial1")
    val icebreakerShip1 = IcebreakerShip2(name = "iceBreaker1")
}