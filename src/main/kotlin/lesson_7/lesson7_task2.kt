package org.example.lesson_7

fun main() {

    var codeDigits: Int
    var userCode: Int

    do {
        codeDigits = (1000..9999).random()
        println("Ваш код авторизации: $codeDigits")
        println("Введите код из СМС: ")
        userCode = readln().toInt()

    } while (userCode != codeDigits)
    println("Добро пожаловать!")
}