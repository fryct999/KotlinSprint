package org.example.lesson_10

fun main() {
    printNameAndAge(userName = getName(), userAge = getAge())
}

fun getName() : String? = readln()

fun getAge() : Int? {
    println("Enter age:")
    return readln().toInt()
}

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("User data: $userName, $userAge years old.")
}