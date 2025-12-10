package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y')
    val count = this.lowercase().count { it in vowels }

    return count
}

fun main() {
    val word = "Hello"
    println("The word $word has ${word.vowelCount()} vowels.")
}