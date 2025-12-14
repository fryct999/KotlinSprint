package org.example.lesson_22

class RegularBook222(
    val name: String,
    val author: String,
)

data class DataBook222(
    val name: String,
    val author: String,
)

fun main() {
    val book = RegularBook222("Nemesis games", "James S. A. Corey")
    val dataBook = DataBook222("Nemesis games", "James S. A. Corey")

    println(book) // будет выведено строковое представление объекта по умолчанию: название пакета.имя класса.хеш код
    println(dataBook) // будет выведено осмысленное строковое представление класса (в data классе неявно переопределятся метод toString()):
// Название класса(все свойства объявленные в основном конструкторе)
}