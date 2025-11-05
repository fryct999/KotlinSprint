package org.example.lesson_5

const val HUNDRED_KM = 100
const val SAFE_CALL = 0.0

fun main() {
    println("Enter the distance in km:")
    val distance = readln().toDoubleOrNull()

    println("Enter fuel consumption in liters per 100 km:")
    val consumption = readln().toDoubleOrNull()

    println("Enter price per liter of fuel:")
    val price = readln().toDoubleOrNull()

    if (distance == null && consumption == null && price == null) {
        println("Incorrect data has been entered!")
        return
    }

    val totalFuel = ((distance ?: SAFE_CALL) * (consumption ?: SAFE_CALL)) / HUNDRED_KM
    val totalCost = totalFuel * (price ?: SAFE_CALL)

    println("Fuel consumption is $totalFuel, the total cost of the trip is ${"%.2f".format(totalCost)}.")
}