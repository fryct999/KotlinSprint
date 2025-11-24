package org.example.lesson_15

interface FlyMovable {
    fun startMove() {
        println("Began to climb.")
    }

    fun endMove() {
        println("Began to descend.")
    }
}

interface SwimMovable {
    fun startMove() {
        println("Started diving.")
    }

    fun endMove() {
        println("Rise to the surface.")
    }
}

abstract class Animal {
    abstract val name: String
    abstract fun movement()
}

class FlyAnimal(override val name : String) : Animal(), FlyMovable {
    override fun movement() {
        startMove()
        endMove()
    }
}

class SwimAnimal(override val name : String) : Animal(), SwimMovable {
    override fun movement() {
        startMove()
        endMove()
    }
}

fun main() {
    val caras = SwimAnimal("Caras")
    val chaika = FlyAnimal("Chaika")
    val duck = FlyAnimal("Duck")

    caras.movement()
    chaika.movement()
    duck.movement()
}