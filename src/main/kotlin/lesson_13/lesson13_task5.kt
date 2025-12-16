package org.example.lesson_13

class ContactData(val name: String, val phoneNumber: Long?, val company: String? = null) {

    fun printData() {
        println("Имя: $name, номер: $phoneNumber, компания: ${company ?: "<не указано>"}")
    }
}

fun main() {

    val userInput = mutableListOf<ContactData>()

    println("Введите имя: ")
    val name = readLine() ?: ""

    println("Введите номер телефона: ")
    val phoneInput = readLine() ?: ""
    val phone = try {
        phoneInput.toLong()
    } catch (e: NumberFormatException) {
        println(e::class.simpleName)
        null
    }

    println("Введите название компании: ")
    val companyInput = readLine()
    val company = if (companyInput == "") null else companyInput

    userInput.add(ContactData(name, phone, company))
    userInput.forEach { it.printData() }

}
