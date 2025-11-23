package org.example.lesson_14.tutorial

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : Spaceship(name, speed, unmanned = true) {
    fun launchScanningDrones() {
        println("$name launch scanning drones.")
    }

    override fun runSystemDiagnostic() {
        super.runSystemDiagnostic()
        println("$name start diagnostic drones and miners.")
    }
}