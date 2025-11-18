package org.example.lesson_9

fun main() {
    val omeletIngredientCount = listOf(2, 50, 15)

    println("Enter the number of portion:")
    val portionNum = readln().toInt()

    val portionIngredientsCount = omeletIngredientCount.map { it * portionNum }
    println("For $portionNum of portion you will need: Egg: ${portionIngredientsCount[0]}, Milk: ${portionIngredientsCount[1]}, Butter: ${portionIngredientsCount[2]}")
}