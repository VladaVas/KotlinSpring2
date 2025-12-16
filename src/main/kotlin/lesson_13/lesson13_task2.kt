package org.example.lesson_13

class  Numberbook( val name: String, val phoneNumber: Long, val company: String? = null) {

    fun printData() {
        println("Имя: $name, номер: $phoneNumber, компания: ${company ?: "<не указано>"} ")
    }
}

fun main() {

    val user1 = Numberbook("Вячеслав", 89123456789)
    val user2 = Numberbook("Ирина", 89876543210, "Reddit")
    user1.printData()
    user2.printData()

}