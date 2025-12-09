package org.example.lesson_19

class StarShip193(
    val name: String,
    val hp: Int,
) {
    fun shooting() {
        TODO("Make a shooting method.")
    }

    fun takeOff() {
        //TODO Add extra functions
        println("Ship take off")
    }

    fun boarding() {
        println("Ship boarding.")
    }
}

fun main() {
    val ship = StarShip193("Caracal", 150)
    ship.boarding()
    ship.takeOff()
    ship.shooting()
}