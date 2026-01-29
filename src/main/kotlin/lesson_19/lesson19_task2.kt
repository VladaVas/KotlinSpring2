package org.example.lesson_19

enum class Category {
    CLOTHING,
    STATIONARY,
    MISCELLANEOUS;

    fun printCategory(): String {
        return when (this) {
            CLOTHING -> "Clothing"
            STATIONARY -> "Stationery"
            MISCELLANEOUS -> "Miscellaneous"
        }
    }
}

class Product(
    val name: String,
    private val id: Int,
    private val category: Category,
) {

    fun productInfo() {
        println("Product: $name,\nid: $id,\nCategory: ${category.printCategory()}")
    }
}

fun main() {

    val tshirt = Product("Tshirt", 2245, Category.CLOTHING)
    val notebook = Product("Notebook", 5920, Category.STATIONARY)
    val box = Product("Box", 87039, Category.MISCELLANEOUS)

    tshirt.productInfo()
    println()
    notebook.productInfo()
    println()
    box.productInfo()
}