package org.example.lesson_11_12.tutorial

class Ingredient constructor(val name: String, val weight: Int, val count: Int) { // первичный конструктор
    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        _isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {
        this.isNeedToPrepare = _isNeedToPrepare
    }

    init {
        println("Ingredient $name created.")
    }

    // вторичный конструктор
    // первичный конструктор
    // блоки init
    // тело вторичного конструктора
}