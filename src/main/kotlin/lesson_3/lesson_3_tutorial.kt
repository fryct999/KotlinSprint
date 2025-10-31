package org.example.lesson_3

fun main() {
    val greeting = "Hello"
    val space = ' '
    val userName = "Lord"

    // конкатенация строк
    println(greeting + ", " + userName + "!" + space + "What is your question?")

    // интерполяция строк
    println("$greeting, $userName! What is your question?")
    println("To wich you can respond ${40 + 2}")

    val multiString = """
                        |fffff
                |nnnnnnn
           |vvvvvv
    """.trimMargin()

    //println(multiString)

    val phrase = "And he said - \"it is magnificent!\""
    println(phrase)
}