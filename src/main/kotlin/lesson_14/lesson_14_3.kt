package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.pow

abstract class Figure(
    val color: String,
) {
    abstract fun perimeter(): Double
    abstract fun area(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun area(): Double {
        return radius.pow(2) * PI
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    val height: Double,
    val weight: Double,
) : Figure(color) {
    override fun area(): Double {
        return height * weight
    }

    override fun perimeter(): Double {
        return 2 * (height + weight)
    }
}

fun main() {
    val blackColor = "Black"
    val whiteColor = "White"

    val figureList = listOf(
        Circle(color = blackColor, radius = 30.0),
        Circle(color = whiteColor, radius = 30.0),
        Rectangle(color = blackColor, weight = 10.0, height = 5.0),
        Rectangle(color = whiteColor, weight = 20.0, height = 25.0),
    )

    val blackFigure = figureList.filter { it.color == blackColor }
    val whiteFigure = figureList.filter { it.color == whiteColor }

    val blackFigurePerimeterSum = blackFigure.sumOf { it.perimeter() }
    val whiteFigureAreaSum = whiteFigure.sumOf { it.area() }

    println(
        "The sum of the perimeters of the black shapes: ${"%.2f".format(blackFigurePerimeterSum)}, " +
                "The sum of the areas of the white pieces: ${"%.2f".format(whiteFigureAreaSum)}."
    )
}