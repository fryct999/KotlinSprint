package org.example.lesson_14

open class LinerShip(
    val name: String,
    val speed: Int,
    val cargoVolume: Int = 0,
    val passengerCount: Int = 0,
    val canIceBreaking: Boolean = false,
) {
    fun printShipData() {
        val iceString = if (canIceBreaking) "can break ice" else "can't break the ice"

        println("Ship name: $name. Max ship speed: $speed. The ship holds $cargoVolume tons of cargo." +
                "The ship accommodates $passengerCount passengers. The ship $iceString.")
    }

    open fun loading() {
        println("$name extends the horizontal ramp.")
    }
}

class IndustrialShip(
    name: String,
    speed: Int,
    cargoVolume: Int,
) : LinerShip(name, speed, cargoVolume) {
    override fun loading() {
        println("$name activates the loading crane.")
    }
}

class IcebreakerShip(
    name: String,
    speed: Int,
    cargoVolume: Int,
    canIceBreaking: Boolean = true,
) : LinerShip(name, speed, cargoVolume, canIceBreaking = canIceBreaking) {
    override fun loading() {
        println("$name opens the gate from the back.")
    }
}

fun main() {
    val liner1 = LinerShip(name = "Liner1", speed = 500, cargoVolume = 150, passengerCount = 300)
    val industrial1 = IndustrialShip(name = "Industrial1", speed = 320, cargoVolume = 500)
    val icebreakerShip1 = IcebreakerShip(name = "iceBreaker1", speed = 300, cargoVolume = 100)

    liner1.printShipData()
    println()
    industrial1.printShipData()
    println()
    icebreakerShip1.printShipData()
    println()
}