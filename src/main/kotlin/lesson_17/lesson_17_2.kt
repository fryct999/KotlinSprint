package org.example.lesson_17

class Ship_17_2 {
    var name = "Palladin"
        set(value) {
            println("The name cannot be changed.")
        }

    val averageSpeed = 100
    val homeStation = "Terra"
}

fun main() {
    val ship1 = Ship_17_2()
    println(ship1.name)
    ship1.name = "Venture"
    println(ship1.name)
}