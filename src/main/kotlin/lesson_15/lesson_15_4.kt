package org.example.lesson_15

abstract class Article(
    val name: String,
    val type: String,
    val amount: Int,
)

class Instrument(
    name: String,
    amount: Int,
    type: String = "Instrument",
) : Article(name, type, amount), FoundAccessories

class Accessories(
    name: String,
    amount: Int,
    type: String = "Accessories",
    val instrument: Instrument,
) : Article(name, type, amount)

interface FoundAccessories {
    fun foundAccessories() {
        println("A search is being performed.")
    }
}