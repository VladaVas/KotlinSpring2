package org.example.lesson_16

class OrderStatus(
    private val orderNumber: Int,
    private var orderStatus: String,
) {

    fun applicationToManager(newStatus: String) {
        changeOrderStatus(newStatus)
    }

    private fun changeOrderStatus(newStatus: String) {
        orderStatus = newStatus
    }

    fun getOrderStatus(): String {
        return orderStatus
    }
}

fun main() {

    val status = OrderStatus(1, "Создан")
    status.applicationToManager("Собран")
    println("Новый статус заказа: ${status.getOrderStatus()}")
}