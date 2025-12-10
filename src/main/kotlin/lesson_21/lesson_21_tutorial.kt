package org.example.lesson_21

import java.io.File

// extension fun - функция расширяющая функционал, не являющаяся участником какого-либо класса, имея доступ к публичным полям
// свойства расширения не может иметь контейнеров field.
// расширения не добавляет никаких членов к классу.

val File.nameWithoutExtension: String
    get() = name.substringBeforeLast(".")

fun main() {
    val file = File("textFile.txt")
    file.writeToFileAndSend()
    file.writeText("sfeefge")

    println(file.nameWithoutExtension)
}

fun File.writeToFileAndSend() {
    val message = "some message for file"
    createNewFile()
    writeText(message)
    println("message: \"$message\" added to file $name and send.")
}