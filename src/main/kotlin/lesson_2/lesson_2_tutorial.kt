package org.example.lesson_2

fun main() {
    val a = 5
    val b = 7
    val sum = a + b

    //val c: Int

    //println(a + b)
    //println(sum)

    val intNum1: Int = 10
    val intNum2: Int = 3
//    println(intNum1 / intNum2)

    val floatNum1: Float = 10f
    val floatNum2: Float = 3f
//    println(floatNum1 / floatNum2)

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
//    println(doubleNum1 / doubleNum2)

    // остаток от деления %
    //println(10 % 3)
    //println(10 % 2)

    //конечный тип переменной
    val c = intNum1 + floatNum1
    //println(c) // float
    //println(c::class)
    //println(c::class.simpleName)

    val d = intNum1 + floatNum1 + doubleNum1
    //println(d) // double

    var counter = 0
    counter = counter + 1
    counter += 1
    counter++

    //println(counter)

    counter -= 1
    --counter

    //println(counter)

    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)
}