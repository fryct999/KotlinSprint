package org.example.lesson_3

fun main() {
    var stepNum = 1
    var fromCell = "E2"
    var whereCell = "E4"

    var historyStepString = "$fromCell-$whereCell;$stepNum"
    println(historyStepString)

    stepNum += 1
    fromCell = "D2"
    whereCell = "D3"

    historyStepString = "$fromCell-$whereCell;$stepNum"
    println(historyStepString)
}