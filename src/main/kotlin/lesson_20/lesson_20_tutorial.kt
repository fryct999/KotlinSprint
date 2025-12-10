package org.example.lesson_20

import java.util.Calendar

// анонимные функции - классические функции, которые имеют собственное расширенное поведение, могут возвращать и принимать параметры, но не имеют имени
// лямбды - вид объекта, который содержит какой-то блок кода. Как правило это небольшая часть кода, которая содержащая определенную функциональность или
// выполняющая какое-то действие. Можно считать за анонимные функции. Лямбды можно присваивать переменным, передавать их и возвращать из обычных функций.
// Не используется return данные всегда возвращаются из последней прописанной строки или инструкции в теле лямбды.

// анонимные функции объявляются с помощью fun, лямбда объявляется с помощью заключения кода в {} не используя fun.

fun main() {
    val calendar: Calendar = Calendar.getInstance()

    val getDaysToEndYear: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR] // анонимная функция

    //println(getDaysToEndYear.invoke())
    println(getDaysToEndYear())

    val convertEndDaysToMills: (Int) -> Unit = fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)
    convertEndDaysToMills(getDaysToEndYear())

    val printStringWithLambda: (Int) -> String

    printStringWithLambda = { answer: Int ->
        "print string with lambda $answer"
    }

    println(printStringWithLambda(42));

    //короткая запись
    println({ it: Int -> "print string with lambda 2 $it" }(52))

    val convertLambda = { endDays: Int ->
        println("Convert from lambda: ${1000 * 60 * 60 * 24 * endDays}")
    }

    convertLambda(getDaysToEndYear())
}