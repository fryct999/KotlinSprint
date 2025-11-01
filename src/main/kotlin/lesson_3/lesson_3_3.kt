package org.example.lesson_3

fun main() {
    val num = 3
    val multiplicationTableForNum = """
        |${getMultiplicationStr(num, 1)}
        |${getMultiplicationStr(num, 2)}
        |${getMultiplicationStr(num, 3)}
        |${getMultiplicationStr(num, 4)}
        |${getMultiplicationStr(num, 5)}
        |${getMultiplicationStr(num, 6)}
        |${getMultiplicationStr(num, 7)}
        |${getMultiplicationStr(num, 8)}
        |${getMultiplicationStr(num, 9)}
    """.trimMargin()

    println(multiplicationTableForNum)
}

fun getMultiplicationStr(num : Int, multiplier : Int) : String {
    return "$num x $multiplier = ${num * multiplier}"
}