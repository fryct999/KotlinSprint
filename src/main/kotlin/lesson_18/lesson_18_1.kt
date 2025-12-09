package org.example.lesson_18

class Order(private val num: Int) {
    private var items: Any? = null

    fun addItem(item: String) {
        items = item
    }

    fun addItem(item: List<String>) {
        items = item
    }

    fun printOrderData() {
        when {
            items is List<*> -> println("The following items have been ordered: $items.")
            items is String -> println("Item ordered: $items.")
            else -> return
        }
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)

    order1.addItem("Cake")
    order2.addItem(listOf("Cake, Chocolate, Ice cream"))

    order1.printOrderData()
    order2.printOrderData()
}