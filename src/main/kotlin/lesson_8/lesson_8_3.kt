package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Egg", "Tomato", "Green", "Salt", "Pepper")

    println("Enter the name of the ingredient:")
    val userIngredient = readln()

    val msg = when(arrayOfIngredients.indexOf(userIngredient)) {
        -1 -> "There's no such ingredient in the recipe."
        else -> "The ingredient $userIngredient is in the recipe."
    }

    println(msg)
}