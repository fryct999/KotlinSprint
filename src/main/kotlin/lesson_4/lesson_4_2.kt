package org.example.lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100
    val printMsg = "Cargo with weight %d and the volume of %d liters corresponds to the category \'Average\':%b"

    var cargoWeight = 20
    var cargoVolume = 80
    println(printMsg.format(cargoWeight, cargoVolume, cargoWeight > minWeight && cargoWeight <= maxWeight && cargoVolume < maxVolume))

    cargoWeight = 50
    cargoVolume = 100
    println(printMsg.format(cargoWeight, cargoVolume, cargoWeight > minWeight && cargoWeight <= maxWeight && cargoVolume < maxVolume))
}

