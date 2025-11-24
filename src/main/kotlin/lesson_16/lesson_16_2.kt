package org.example.lesson_16

import kotlin.math.pow

class Circle(
    protected val radius: Double,
) {
    private val pi = 3.14

    fun getArea() : Double {
        return pi * radius.pow(2)
    }

    fun getLength() : Double {
        return 2 * pi * radius
    }
}

fun main() {
    val circle1 = Circle(20.0)

    println(circle1.getArea())
    println(circle1.getLength())
}