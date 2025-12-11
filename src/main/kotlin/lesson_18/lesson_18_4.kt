package org.example.lesson_18

abstract class Package() {
    abstract fun getArea(): Int
}

class CubePackage(private val length: Int) : Package() {
    override fun getArea(): Int {
        return 6 * length * length
    }
}

class BoxPackage(
    private val length: Int,
    private val wide: Int,
    private val height: Int,
) : Package() {
    override fun getArea(): Int {
        return 2 * (length * wide + wide * height + length * height)
    }
}

fun main() {
    val package1: Package = BoxPackage(10, 5, 8)
    val package2: Package = CubePackage(6)

    println(package1.getArea())
    println(package2.getArea())
}