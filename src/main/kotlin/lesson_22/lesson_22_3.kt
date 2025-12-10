package org.example.lesson_22

data class Auto(
    val year: Int,
    val name: String,
    val brand: String,
)

fun main() {
    val auto = Auto(2012, "RX8", "Mazda")
    val (year, carName, carBrand) = auto
    println("Brand - $carBrand. Mark - $carName. Year - $year.")
}