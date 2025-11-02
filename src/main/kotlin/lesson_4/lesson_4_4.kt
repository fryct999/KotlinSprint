package org.example.lesson_4

fun main() {
    var dayNum = 1
    println(getTodayExercises(dayNum) + "\n")

    dayNum += 1
    println(getTodayExercises(dayNum))
}

fun getTodayExercises(dayNum : Int) : String {
    val armsAndAbsTraining = dayNum % 2 != 0

    val workOutMsg = """
        |Exercises for the arms: $armsAndAbsTraining
        |Exercises for the legs: ${!armsAndAbsTraining}
        |Exercises for the back: ${!armsAndAbsTraining}
        |Exercises for the abs: $armsAndAbsTraining
    """.trimMargin()

    return workOutMsg
}