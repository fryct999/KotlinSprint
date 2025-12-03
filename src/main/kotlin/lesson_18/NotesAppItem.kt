package org.example.lesson_18

import java.util.*

open class NotesAppItem {
    open fun getItemToCell() = ""

//    fun addItemToCell(
//        title: String,
//        creationDate: Date,
//        type: String,
//        data: String,
//    ) {
//        println("Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data.")
//    }

//    fun addItemToCell(
//        title: String,
//        creationDate: Date,
//        type: String,
//        data: Long,
//    ) {
//        println("Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data.")
//    }
//
//    fun addItemToCell(
//        title: String,
//        creationDate: Date,
//        type: String,
//        data: List<String>,
//    ) {
//        println("Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data.")
//    }
}

class MessageItem(
        private val title: String,
        private val creationDate: Date,
        private val type: String,
        private val data: String,
) : NotesAppItem() {
    override fun getItemToCell(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data."
    }
}

class PhoneItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: Long,
) : NotesAppItem() {
    override fun getItemToCell(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data."
    }
}

class ListItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: List<String>,
) : NotesAppItem() {
    override fun getItemToCell(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data."
    }
}