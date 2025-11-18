package org.example.lesson_11

class Category(
    val image: Any,
    val name: String,
    val descriptor: String,
    val inFavorite: Boolean = false,
)

class Recipe(
    val image: Any,
    val name: String,
    val ingredient: Map<Ingredient, Int>,
    val instruction: String,
    val inFavorite: Boolean = false,
)

class Ingredient(
    val name: String,
)