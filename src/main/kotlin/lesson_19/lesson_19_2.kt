package org.example.lesson_19

enum class Categories {
    GARDEN,
    KITCHEN,
    BEDROOM,
    DININGROOM;

    fun getCategoryName(): String {
        return when (this) {
            GARDEN -> "Garden"
            KITCHEN -> "Kitchen"
            BEDROOM -> "Bedroom"
            DININGROOM -> "Dining room"
        }
    }
}

class Product(
    val id: Int,
    val name: String,
    val category: Categories,
) {
    fun getProductData() = "Product name - $name. Product article - $id. Product category - ${category.getCategoryName()}."
}

fun main() {
    val axe = Product(100, "Axe", Categories.GARDEN)
    val skillet = Product(110, "Skillet", Categories.KITCHEN)
    val pillow = Product(120, "Pillow", Categories.BEDROOM)

    println(axe.getProductData())
    println(skillet.getProductData())
    println(pillow.getProductData())
}