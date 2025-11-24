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
    var addNumbers = true
    val positiveAnswer = "yes"
    val negativeAnswer = "no"

    val phoneBook = mutableListOf<Contact4>()

    while (addNumbers) {
        println("Do you want to add a new contact? ($positiveAnswer/$negativeAnswer)")
        val answer = readln().lowercase()

        if (negativeAnswer == answer) {
            addNumbers = false
            break
        }

        println("Enter name:")
        val name = readLine().toString()

        println("Enter company:")
        val company = readLine()

        println("Enter phone number:")
        val number = readLine()?.toLongOrNull()

        if (number == null) {
            println("The phone number was entered incorrectly.")
            continue
        }

        phoneBook.add(Contact4(number, name, company))
    }

    phoneBook.forEach { it.printContactData() }
}