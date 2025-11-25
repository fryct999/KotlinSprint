package org.example.lesson_15

interface FlyMovable {
    fun startFly(name: String) {
        println("$name began to climb.")
    }

    fun endFly(name: String) {
        println("$name began to descend.")
    }
}

interface SwimMovable {
    fun startSwim(name: String) {
        println("$name started diving.")
    }

    fun endSwim(name: String) {
        println("$name rise to the surface.")
    }
}

abstract class Animal {
    abstract val name: String

    fun printMovementInfo() {
        val flyAnimal = this is FlyMovable
        val swimAnimal = this is SwimMovable

        when {
            flyAnimal && swimAnimal -> println("$name can swim and fly.")
            flyAnimal -> println("$name can only fly.")
            swimAnimal -> println("$name can only swim.")
        }
    }
}

class Caras(override val name: String) : Animal(), SwimMovable
class Chaika(override val name: String) : Animal(), FlyMovable
class Duck(override val name: String) : Animal(), FlyMovable, SwimMovable

fun main() {
    val caras = Caras("Caras")
    val chaika = Chaika("Chaika")
    val duck = Duck("Duck")

    caras.printMovementInfo()
    chaika.printMovementInfo()
    duck.printMovementInfo()
}