package org.example.lesson_11.tutorial

fun main() {
    val dish1: Dish = Dish(
        id = 1,
        name = "Eggs",
        category = "Breakfast",
        ingredients = listOf("Egg", "Tomato", "Salt", "Pepper"),
    )

    val dish2: Dish = Dish(
        2,
        "Soup",
        "Lunch",
        listOf("Water", "Chicken", "Salt", "Pepper"),
    )

//    println(dish1.name)
//    println(dish1.ingredients)
//    println(dish1.inFavorites)
//    println()
//    println(dish2.name)
//    println(dish2.ingredients)
//    println(dish2.inFavorites)

//    dish1.category = "Lunch"
//    dish2.inFavorites = true
//    println(dish1.category)
//    println(dish2.inFavorites)

    println("Action for Eggs dish")
    dish1.addToFavorites()
    println(dish1.inFavorites)
    dish1.startCooking()

    println()

    println("Action for Soup dish")
    dish2.addToFavorites()
    println(dish2.inFavorites)
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.inFavorites)
}