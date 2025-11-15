package org.example.lesson_7

fun main() {
    val numRange = 1 .. 9
    val charRange = 'a' .. 'z'
    val passwordRange = 1.. 6
    var password = ""

    for (i in passwordRange ) {
        if(i % 2 == 0) password += numRange.random()
        else password += charRange.random()
    }

    println(password)
}