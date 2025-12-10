package org.example.lesson_22

// data class vs class
// equals() - сравнение 2 объектов
// hashCode() - уникальный хэш код объекта
// toString() - строковое представление объекта (в виде понятной строк)
// copy() - копирует данные объекта в другой объект

// 1 способ переопределение метода toString
//class Word(
//    val text: String,
//    val translate: String,
//) {
//    override fun toString(): String {
//        return "Word(text='$text', translate='$translate')"
//    }
//}

// 2 способ добавление data
data class Word(
    val text: String,
    val translate: String,
)

fun main() {
    val word1 = Word("Red", "Красный")
    //println(word)

    val word2 = Word("Blue", "Синий")
    val word3 = Word("Red", "Красный")

//    println(word3 == word2) // equals
//    println(word1 == word3)

    val word4 = word3.copy(translate = "White")
//    println(word4)
//    println(word3)

    // в data class переопределен; возвращает уникальный код объекта для сравнения работает быстрее
    // если 2 объекта data class имеют одинаковые свойства то и хэш код будет одинаковым. В data class генерируется хэш код функция основанная на полях внутри класса.
    // обычные классы используют хэш код базового класса Object, который игнорирует поля класса.
    println(word1.hashCode())
    println(word2.hashCode())
    println(word1.hashCode())
}