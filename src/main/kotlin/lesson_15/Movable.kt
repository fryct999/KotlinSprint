package org.example.lesson_15

interface Movable {
    fun startEngine() {
        println("Start engine.")
    }

    fun prepareForTakeOff()
    fun prepareForLanding()
}