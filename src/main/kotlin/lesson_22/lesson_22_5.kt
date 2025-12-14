package org.example.lesson_22

import java.time.LocalDate

data class GalacticGuide(
    val locationName: String,
    val locationDescription: String,
    val date: LocalDate,
    val distance: Double,
)

fun main() {
    val alpha = GalacticGuide(
        "Alpha Centauri",
        "Is the closest star system to our Sun",
        LocalDate.of(2027, 12, 31),
        4.36
    )

    println("Location Information:")
    println("Name: ${alpha.component1()}.")
    println("Description: ${alpha.component2()}.")
    println("Date: ${alpha.component3()}.")
    println("Distance from Earth: ${alpha.component4()} light years away.")
}