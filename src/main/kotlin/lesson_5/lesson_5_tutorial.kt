package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val userAge = readLine()!!.toInt()

    val resultText = if(userAge >= AGE_OF_MAJORITY) "Show screen"
    else if(userAge == 16 || userAge == 17) "Show special screen"
    else "Back to the main screen"

    //println(resultText)

    // when
    val consoleNum = when(userAge) {
        10 -> {
            println("Additional action when num equals 10")
            "Enter num 10"
        }
        20 -> "Enter num 20"
        42 -> "Enter num 42"
        else -> "different num"
    }

    println(consoleNum)
}

