package org.example.lesson_7

fun main() {

    val letters = 'a'..'z'
    val digits = '0'..'9'
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

    val securePassword = mutableListOf<Char>()

    securePassword.add(letters.random())
    securePassword.add(capitalLetters.random())
    securePassword.add(digits.random())

    for (i in 4..passwordLength) {
        securePassword += allChars.random()
    }
    securePassword.shuffle()
    println("Ваш пароль: ${securePassword.joinToString("")}")

}