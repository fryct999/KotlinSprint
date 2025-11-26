package org.example.lesson_16

class Order(
    private val number: Int,
    private var status: String,
) {
    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun callToManager(order: Order, status: String) {
        order.changeStatus(status)
    }
}