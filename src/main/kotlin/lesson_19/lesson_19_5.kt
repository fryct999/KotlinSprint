package org.example.lesson_19

enum class Gender() {
    MALE,
    FEMALE;

    fun getPrintString(): String {
        return when(this) {
            MALE -> "Male"
            FEMALE -> "Female"
        }
    }
}

class Archive() {
    private val archive = mutableListOf<Card>()

    fun addToArchive(persona: Card) {
        archive.add(persona)
    }

    fun printArchiveData() {
        archive.forEach {
            println("Name: ${it.name}. Gender: ${it.gender.getPrintString()}.")
        }
    }
}

class Card(
    val name: String,
    val gender: Gender,
)

fun main() {
    val archive = Archive()
    val targetPersonCount = 5
    var personCount = 1

    println(
        "To add a person to the archive, you need to specify their name and gender. The name is entered in string format. \n" +
                "To select a gender, enter ${Gender.MALE.ordinal} - if the gender is male or ${Gender.FEMALE.ordinal} - if the gender is female. \n"
    )

    while (personCount <= targetPersonCount) {
        println("Enter the name of $personCount user:")
        val name = readln()

        println("Enter the gender of $personCount user (${Gender.MALE.ordinal} is male / ${Gender.FEMALE.ordinal} is female):")
        val id = readln().toInt()

        if (id != Gender.MALE.ordinal && id != Gender.FEMALE.ordinal) {
            println("Incorrect gender entered.")
            continue
        }

        archive.addToArchive(Card(name, enumValues<Gender>()[id]))
        personCount += 1
    }

    println("You have entered the following cards:")
    archive.printArchiveData()
}