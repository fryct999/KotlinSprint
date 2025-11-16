package org.example.lesson_8

fun main() {
    println("Enter the planned number of ingredients:")
    val ingredientCount = readln().toInt()

    val recipe = Array(ingredientCount) {""}

    for (i in recipe.indices) {
        println("Enter the name of ${i + 1} ingredient:")
        recipe[i] = readln()
    }

    println("The recipe uses the following ingredients: ${recipe.joinToString(", ")}.")
}