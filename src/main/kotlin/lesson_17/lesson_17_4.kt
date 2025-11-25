package org.example.lesson_17

class Send(
    number: Int,
    location: String,
) {
    var countMoved = 0
        private set

    val sendNumber = number
    var location = location
        set(value) {
            field = value
            countMoved += 1
        }
}

fun main() {
    val send1 = Send(number = 101, location = "SPB")
    send1.location = "Moscow"
    send1.location = "Perm"

    println("${send1.countMoved} movements were made.")
}