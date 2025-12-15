package org.example.lesson_13

class ContactEntry(val name: String, val phoneNumber: Long, val company: String? = null) {

    fun printData() {
        println("Имя: $name, номер: $phoneNumber, компания: ${company ?: "<не указано>"}")
    }
}

fun main() {

    val userInput = mutableListOf<ContactEntry>()
    println("Введите имя: ")
    val name = readLine() ?: ""
    println("Введите номер телефона: ")
    val phone = readLine()!!.toLongOrNull()
    println("Введите название компании: ")
    val companyInput = readLine()
    val company = if (companyInput =="") null else companyInput

    if (phone != null) {
        userInput.add(ContactEntry(name, phone, company))
    } else {
        println("Номер телефона введён некорректно. Контакт не добавлен.")
    }
    userInput.forEach { it.printData() }

}