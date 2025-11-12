package org.example.lesson_7

fun main() {

    val letters = 'a'..'z'
    val digits = '1'..'9'
    val capitalLetters = 'A'..'Z'
    val allChars = letters + digits + capitalLetters

    var passwordLength: Int

    do {
        println("Введите длинну пароля (минимум 6 символов):")
        passwordLength = readln().toInt()

        if (passwordLength < 6) {
            println("Пароль должен содержать минимум 6 символов. Попробуйте снова.")
        }
    } while (passwordLength < 6)

    var securePassword = ""

    for (i in 1..passwordLength) {
        securePassword += allChars.random()
    }
    println("Ваш пароль: $securePassword")

}