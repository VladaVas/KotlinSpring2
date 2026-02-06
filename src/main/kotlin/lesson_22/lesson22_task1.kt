package org.example.lesson_22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {

    val regularBook1 = RegularBook("Alice in the Wonderland", "Lewis Carroll")
    val regularBook2 = RegularBook("Alice in the Wonderland", "Lewis Carroll")

    val dataBook1 = DataBook("Alice in the Wonderland", "Lewis Carroll")
    val dataBook2 = DataBook("Alice in the Wonderland", "Lewis Carroll")

    println(regularBook1.equals(regularBook2))
    /*
    Обычный класс не переопределяет equals().
    Оператор сравнивает ссылки на объекты, а не свойства -> объекты разные -> результат false.
     */
    println(dataBook1.equals(dataBook2))
    /*
    Дата класс переопределяет equals().
    Сравнивает свойства объектов -> свойства одинаковые -> результат true.
     */
}