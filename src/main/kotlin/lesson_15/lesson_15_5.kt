package org.example.lesson_15

interface Movable2 {
    fun startMovable()
    fun endMovable()
}

interface Cargo {
    fun loadCargo(cargo: Int)
    fun unloadCargo()
}

interface Passenger {
    fun boardingPassenger(passengerCount: Int)
    fun landPassenger()
}

abstract class Car(
    protected val num: Int,
    protected val maxPassengerCount: Int,
    protected val maxCargoSize: Int,
) : Movable2 {
    protected var curPassengers = 0

    override fun startMovable() {
        println("The car with the number $num started moving.")
    }

    override fun endMovable() {
        println("The car with the number $num stopped.")
    }
}

class Truck(num: Int) : Car(num = num, maxPassengerCount = 1, maxCargoSize = 2), Passenger, Cargo {
    private var curCargo = 0

    override fun boardingPassenger(passengerCount: Int) {
        if (curPassengers + passengerCount <= maxPassengerCount) {
            curPassengers += passengerCount
            println("A passenger got into truck $num.")
        }
    }

    override fun landPassenger() {
        if (curPassengers == 0) println("There are no passengers in truck $num.")
        else {
            curPassengers -= 1
            println("A passenger got out of truck $num.")
        }
    }

    override fun loadCargo(cargo: Int) {
        if (curCargo + cargo <= maxCargoSize) {
            curCargo += cargo
            println("$cargo tons of cargo were loaded.")
        } else println("There is not enough space in car $num.")
    }

    override fun unloadCargo() {
        curCargo = 0
        println("The cargo from car $num has been unloaded.")
    }

}

class PassengerCar(num: Int) : Car(num = num, maxPassengerCount = 3, maxCargoSize = 0), Passenger {
    override fun boardingPassenger(passengerCount: Int) {
        if (curPassengers + passengerCount <= maxPassengerCount) {
            curPassengers += passengerCount
            println("A $passengerCount passengers got into car $num.")
        }
    }

    override fun landPassenger() {
        if (curPassengers == 0) println("There are no passengers in car $num.")
        else {
            curPassengers = 0
            println("All passengers left the car $num.")
        }
    }

}

fun main() {
    val truck1 = Truck(1)
    val passengerCar1 = PassengerCar(1)
    val passengerCar2 = PassengerCar(2)

    truck1.boardingPassenger(1)
    truck1.loadCargo(2)
    truck1.startMovable()
    truck1.endMovable()
    truck1.landPassenger()
    truck1.unloadCargo()

    passengerCar1.boardingPassenger(3)
    passengerCar2.boardingPassenger(2)
    passengerCar1.startMovable()
    passengerCar2.startMovable()
    passengerCar1.endMovable()
    passengerCar2.endMovable()
    passengerCar1.landPassenger()
    passengerCar2.landPassenger()
}