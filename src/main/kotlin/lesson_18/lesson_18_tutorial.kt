package org.example.lesson_18

import java.util.Date

fun main() {
    // ad hoc (по случаю) одна функция для разных типов данных
    // subtyping (полиморфизм включения) функции которые используют базовый тип, должны иметь возможность использовать подтипы базового типа не зная об этом
    // объект более узкого типа всегда может использоваться там, где может использоваться объект более широкого типа
    // parametric (параметрический) обобщенные типы

    val creationDate = Date()
    //val note = NotesAppItem()

//    note.addItemToCell(
//        "call sister",
//        creationDate,
//        "message",
//        "call sister to congratulate",
//    )
//
//    println()
//
//    note.addItemToCell(
//        "sister's phone",
//        creationDate,
//        "phone",
//        79999999999,
//    )
//
//    println()
//
//    note.addItemToCell(
//        "to do list",
//        creationDate,
//        "list",
//        listOf("wash dog", "do the cleaning", "buy new shoes"),
//    )

    val messageItem: NotesAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate",
    )

    val phoneItem: NotesAppItem = PhoneItem(
        "sister's phone",
        creationDate,
        "phone",
        79999999999,
    )

    val listItem: NotesAppItem = ListItem(
        "to do list",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "buy new shoes"),
    )

//    println(messageItem.getItemToCell())
//    println()
//    println(phoneItem.getItemToCell())
//    println()
//    println(listItem.getItemToCell())

    val arrayOfNotes = arrayOf<NotesAppItem>(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)
}

fun showAllNotes(notes: Array<NotesAppItem>) {
    notes.forEach {
        println(it.getItemToCell())
    }
}