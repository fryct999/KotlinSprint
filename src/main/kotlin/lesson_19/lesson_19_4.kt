package org.example.lesson_19

enum class Ammo {
    BLUE,
    GREEN,
    RED;

    fun getDamage(): Int {
        return when (this) {
            BLUE -> 5
            GREEN -> 10
            RED -> 20
        }
    }
}

class Panzer() {
    private var loadAmmo: Ammo? = null

    fun loadAmmo(ammoType: Ammo) {
        loadAmmo = ammoType
    }

    fun shoot() {
        if (loadAmmo == null) println("There was no shot, the tank is not loaded.")
        else println("The shot inflicted ${loadAmmo!!.getDamage()} points of damage.")
    }
}

fun main() {
    val panzer = Panzer()

    panzer.shoot()
    panzer.loadAmmo(Ammo.BLUE)
    panzer.shoot()
    panzer.loadAmmo(Ammo.RED)
    panzer.shoot()
}