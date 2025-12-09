package org.example.lesson_19

// Unit - ничего не возвращает прим. main
// Nothing - используется в TODO, функция гарантированно не выполнится успешно, создает исключение

enum class Status(val id: Int) {
    NEW(101) {
        override fun getStatusDescription(): String {
            return "Order created and awaiting payment"
        }
    },
    COOKING(102) {
        override fun getStatusDescription(): String {
            return "Order paid and start cooking"
        }
    },
    COMPLETED(103) {
        override fun getStatusDescription(): String {
            return "Order completed"
        }
    },
    ERROR(0) {
        override fun getStatusDescription(): String {
            return "smth errors"
        }
    };

    abstract fun getStatusDescription(): String
}

fun setStatus(status: Status) {
    when (status) {
        Status.NEW -> println("order accepted")
        Status.COOKING -> println("order cooking")
        Status.COMPLETED -> println("order delivered")
        Status.ERROR -> println("Error")
    }
}

fun main() {
    val statusesFromServer = listOf(101, 102, 103)

    for (i in statusesFromServer) {
        when (i) {
            Status.NEW.id -> setStatus(Status.NEW)
            Status.COOKING.id -> setStatus(Status.COOKING)
            Status.COMPLETED.id -> setStatus(Status.COMPLETED)
            else -> setStatus(Status.ERROR)
        }

        Thread.sleep(1000)
    }

    println()
//    println(Status.NEW.name) // имя константы
//    println(Status.NEW.ordinal) // порядковый номер
//    for (i in Status.values()) println(i) // массив enumов

    println(Status.NEW.getStatusDescription())
    println(Status.ERROR.getStatusDescription())
}