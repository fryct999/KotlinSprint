package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.pow

abstract class Figure(
    val color: String,
) {
    abstract fun Perimeter(): Double
    abstract fun Area(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun Area(): Double {
        return radius.pow(2) * PI
    }

    override fun Perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    val height: Double,
    val weight: Double,
) : Figure(color) {
    override fun Area(): Double {
        return height * weight
    }

    override fun Perimeter(): Double {
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

    var blackFigurePerimeterSum = 0.0
    var whiteFigureAreaSum = 0.0

    figureList.forEach {
        if (it.color == blackColor) blackFigurePerimeterSum += it.Perimeter()
        else whiteFigureAreaSum += it.Area()
    }

    println("The sum of the perimeters of the black shapes: ${"%.2f".format(blackFigurePerimeterSum)}, " +
            "The sum of the areas of the white pieces: ${"%.2f".format(whiteFigureAreaSum)}.")
}