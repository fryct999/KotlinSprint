package org.example.lesson_14

open class LinerShip(
    open val name: String,
    open val speed: Int = 150,
    open val passengerCount: Int = 300,
    open val cargoVolume: Int = 1000,
    open val canIceBreaking: Boolean = false,
) {
    fun printShipData() {
        val iceString = if (canIceBreaking) "can break ice" else "can't break the ice"

        println(
            "Ship name: $name. Max ship speed: $speed. The ship holds $cargoVolume tons of cargo." +
                    "The ship accommodates $passengerCount passengers. The ship $iceString."
        )
    }

    open fun load() {
        println("$name extends the horizontal ramp.")
    }
}

class IndustrialShip(
    override val name: String
) : LinerShip(
    name = name,
    speed = 100,
    passengerCount = 100,
    cargoVolume = 5000,
) {
    override fun load() {
        println("$name activates the loading crane.")
    }
}

class IcebreakerShip(
    override val name: String
) : LinerShip(
    name = name,
    speed = 50,
    passengerCount = 100,
    cargoVolume = 500,
    canIceBreaking = true,
) {
    override fun load() {
        println("$name opens the gate from the back.")
    }
}

fun main() {
    val liner1 = LinerShip(name = "Liner1")
    val industrial1 = IndustrialShip(name = "Industrial1")
    val icebreakerShip1 = IcebreakerShip(name = "iceBreaker1")

    liner1.printShipData()
    println()
    industrial1.printShipData()
    println()
    icebreakerShip1.printShipData()
    println()
}