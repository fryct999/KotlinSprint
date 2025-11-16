package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Egg", "Tomato", "Green", "Salt", "Pepper")

    println("Enter the name of the ingredient:")
    val userIngredient = readln()

    val msg = when(userIngredient in arrayOfIngredients) {
        true -> "The ingredient $userIngredient is in the recipe."
        else -> "There's no such ingredient in the recipe."
    }

    println(msg)
}