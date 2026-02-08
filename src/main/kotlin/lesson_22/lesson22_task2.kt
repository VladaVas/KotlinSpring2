package org.example.lesson_22

class NewBook(
    val name: String,
    val author: String,
)

data class DataNewBook(
    val name: String,
    val author: String,
)

fun main() {

    val newBook = NewBook("To Kill a Mockingbird", "Harper Lee")

    val dataNewBook = DataNewBook("To Kill a Mockingbird", "Harper Lee")

    println(newBook)
    // Не имеет автоматического метода toString() и выводит адрес в памяти
    println(dataNewBook)
    // Имеет автоматический метод toString(), выводит содержимое
}