package org.example.lesson_20

fun main() {
    val welcomeLambda: (String) -> String = {
        "Happy New Year, $it!"
    }

    println(welcomeLambda("Atlas"))
}