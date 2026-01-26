package org.example.lesson_18

class CRMOrder(val number: Number) {

    fun orderInformation(product: String) {
        println("Заказан товар: $product")
    }

    fun orderInformation(product: List<String>) {
        println("Заказаны следующие товары: ${product.joinToString(", ")}")
    }
}

fun main() {

    val order1 = CRMOrder(1)
    order1.orderInformation("iPhone 17")

    val order2 = CRMOrder(2)
    order2.orderInformation(listOf("iPhone 16", "Case for iPhone 16", "Apple Watch series 8"))
}