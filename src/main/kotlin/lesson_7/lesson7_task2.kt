package org.example.lesson_7

fun main() {

    val codeDigits = (1000..9999).random()
    println("Ваш код авторизации: $codeDigits")

    println("Введите код из СМС: ")

    for (i in 1..99999999) {
        val userCode = readln().toInt()

        if (userCode == codeDigits) {
            println("Добро пожаловать!")
            return
        }
        println("Неверный код. Введите код из СМС:")
    }
}