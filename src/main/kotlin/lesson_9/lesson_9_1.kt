package org.example.lesson_9

fun main() {
    val ingredientList = listOf("Egg", "Green", "Pepper", "Salt")

    println("The recipe contains the following ingredients: $ingredientList")
    ingredientList.forEach { println(it) }
}