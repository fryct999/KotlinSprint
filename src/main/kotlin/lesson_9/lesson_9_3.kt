package org.example.lesson_9

fun main() {
    val omeletIngredientName = listOf("Egg", "Milk", "Butter")
    val omeletIngredientCount = listOf(2, 50, 15)

    println("Enter the number of portion:")
    val portionNum = readln().toInt()

    println("For $portionNum of portion you will need: ${omeletIngredientName[0]}: ${omeletIngredientCount[0] * portionNum}, " +
            "${omeletIngredientName[1]}: ${omeletIngredientCount[1] * portionNum}, ${omeletIngredientName[2]}: ${omeletIngredientCount[2] * portionNum}")
}