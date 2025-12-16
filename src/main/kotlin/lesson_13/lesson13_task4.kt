package org.example.lesson_13

class ContactEntry(val name: String, val phoneNumber: Long, val company: String? = null) {

    fun printData() {
        println("Имя: $name, номер: $phoneNumber, компания: ${company ?: "<не указано>"}")
    }
}

fun main() {

    val userInput = mutableListOf<ContactEntry>()
    var continueInput = true

    while (continueInput) {

        println("Введите имя: ")
        val name = readLine() ?: ""

        println("Введите номер телефона: ")
        val phone = readLine()!!.toLongOrNull()

        if (phone == null) {
            println("Номер телефона введён некорректно. Контакт не добавлен.")
        } else {
            println("Введите название компании: ")
            val companyInput = readLine()
            val company = if (companyInput!!.isEmpty()) null else companyInput
            userInput.add(ContactEntry(name, phone, company))
        }

        userInput.forEach { it.printData() }

    }
}