package org.example.lesson_18

class Screen() {
    fun drawCircle(x: Int, y: Int): String {
        return "The circle shape is drawn in coordinates {x = $x; y = $y}"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "The circle shape is drawn in coordinates {x = $x; y = $y}"
    }

    fun drawRect(x: Int, y: Int): String {
        return "The rectangle shape is drawn in coordinates {x = $x; y = $y}"
    }

    fun drawRect(x: Float, y: Float): String {
        return "The rectangle shape is drawn in coordinates {x = $x; y = $y}"
    }

    fun drawDot(x: Int, y: Int): String {
        return "A point is drawn in coordinates {x = $x; y = $y}"
    }

    fun drawDot(x: Float, y: Float): String {
        return "A point is drawn in coordinates {x = $x; y = $y}"
    }
}

fun main() {
    val screen = Screen()

    println(screen.drawDot(24, 41))
    println(screen.drawCircle(24.5f, 41.1f))
}