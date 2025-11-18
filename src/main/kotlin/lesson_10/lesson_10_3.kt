package org.example.lesson_10

fun main() {
    println("Enter the password length:")
    val passLength = readln().toInt()

    if (passLength <= 0) {
        println("The password can't be that short.")
        return
    }

    println("Your password: ${passwordGenerator(passLength)}")
}

fun passwordGenerator(passLength: Int) : String {
    val numRange = 0.. 9
    val charRange = ' '..'/'
    var pass = ""

    for (i in 0 until  passLength) {
        pass += if (i % 2 == 0) numRange.random() else charRange.random()
    }

    return pass
}