package org.example.lesson_22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {
    val book1 = RegularBook("Nemesis games", "James S. A. Corey")
    val book2 = RegularBook("Nemesis games", "James S. A. Corey")
    val dataBook1 = DataBook("Nemesis games", "James S. A. Corey")
    val dataBook2 = DataBook("Nemesis games", "James S. A. Corey")

    println(book1 == book2) // false - т.к. сравниваются ссылки на объекты
    println(dataBook1 == dataBook2) // true - т.к. сравниваются проинициализированные значения
}