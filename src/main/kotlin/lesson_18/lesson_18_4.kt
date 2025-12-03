package org.example.lesson_18

class Package(
    private val height: Int,
    private val wide: Int,
) {
    constructor(size: Int) : this(size, size)

    fun getArea(): Int {
        return height * wide
    }
}

fun main() {
    val package1 = Package(10, 5)
    val package2 = Package(6)

    println(package1.getArea())
    println(package2.getArea())
}