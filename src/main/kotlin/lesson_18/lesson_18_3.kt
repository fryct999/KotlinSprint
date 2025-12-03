package org.example.lesson_18

abstract class Animal(protected val name: String) {
    abstract fun eat()

    fun sleep() {
        println("$name -> going to sleep.")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> eat berries.")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> eat bones.")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> eat fish.")
    }
}

fun main() {
    val animalList: List<Animal> = listOf(Fox("Alice"), Dog("Bobik"), Cat("German"))
    animalList.forEach { it.eat() }
}