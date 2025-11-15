package org.example.lesson_8

fun main() {
    println("Enter the planned number of ingredients:")
    val ingredientCount = readln().toInt()
    val loopRange = 0 until ingredientCount

    val recipe = Array(ingredientCount) {""}

    for (i in loopRange) {
        println("Enter the name of ${i + 1} ingredient:")
        val ingredient = readln()

        recipe[i] = ingredient
    }

    println("The recipe uses the following ingredients: ${recipe.joinToString(", ")}.")
}