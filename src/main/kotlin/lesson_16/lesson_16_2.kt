package org.example.lesson_16

import kotlin.math.pow

private const val PI_NUM = 3.14

class Circle(
    private val radius: Double,
) {

    fun getArea(): Double {
        return PI_NUM * radius.pow(2)
    }

    fun getLength(): Double {
        return 2 * PI_NUM * radius
    }
}

fun main() {
    val circle1 = Circle(20.0)

    println(circle1.getArea())
    println(circle1.getLength())
}