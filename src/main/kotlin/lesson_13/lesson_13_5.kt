package org.example.lesson_13

class Contact4(
    val phoneNumber: Long,
    val name: String,
    val company: String? = null,
) {
    fun printContactData() {
        println("Name: $name \n Phone number: $phoneNumber \n Company: ${company ?: "<Not data>"}")
    }
}

fun main() {
    var number: Long?

    println("Enter phone number:")
    try {
        number = readLine()?.toLong()
    } catch (e: Exception) {
        println(e::class.simpleName)
    }


}