package org.example.lesson_15

abstract class SpaceShuttle : Movable, Shootable {
    abstract val tankSize: Int
    abstract fun runDiagnostic()
}

class Upsilon(override val tankSize: Int) : SpaceShuttle() {
    override fun runDiagnostic() {
        println("Start diagnostic.")
    }

    override fun prepareForTakeOff() {
        println("Unfold the wings.")
    }

    override fun prepareForLanding() {
        println("Fold the wings.")
    }

    override fun startShooting() {
        println("Start shooting,")
    }

    override fun reloadGuns() {
        println("Reload guns.")
    }
}

fun main() {
    val upsilonShuttle = Upsilon(50)
    upsilonShuttle.runDiagnostic()
    upsilonShuttle.startEngine()
    upsilonShuttle.prepareForTakeOff()
    upsilonShuttle.prepareForLanding()
    upsilonShuttle.startShooting()
    upsilonShuttle.reloadGuns()
}