package org.example.lesson_13

class Contact(val name: String, val phoneNumber: Long, val company: String? = null) {

    fun printData() {
        println("Имя: $name, номер: $phoneNumber, компания: ${company ?: "<не указано>"} ")
    }
}

fun main() {

    val contactList = mutableListOf(
        Contact("Амелия", 89991123344, "Красивые шторы"),
        Contact("Святогор", 89123456789,null ),
        Contact("Алефтина", 89876654432, null ),
        Contact("Сергей", 89887126635, "null"),
        Contact("Александра", 89456385512, "Некрасивые шторы")
    )

    println("Компании из списка: ")

    for (contact in contactList) {
       if (contact.company != null) {
           println(contact.company)
       }
   }

}