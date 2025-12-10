package org.example.lesson_21

import java.io.File

fun File.addStingToStart(string: String) {
    val oldText = this.readText()
    val newText = string.lowercase() + "\n" + oldText
    this.writeText(newText)
}

fun main() {
    val fileName = "test_file.txt"
    val file = File(fileName)
    file.writeText("Smth text")
    file.addStingToStart("ADD text")
}