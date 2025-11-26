package org.example.lesson_10

fun main() {
    print("Задайте длину пароля: ")
    val passwordLength = readln().toInt()

    println("Ваш пароль: ${generatePassword(passwordLength)}")
}

fun generatePassword(passwordLength: Int): String {

    val digits = "0123456789"
    val chars = "!\"#\$%&'()*+,-./"
    val allChars = digits + chars

    val securePassword = mutableListOf<Char>()
    securePassword += digits.random()
    securePassword += chars.random()

    for (i in 1 until passwordLength) {
        securePassword += allChars.random()
    }
    securePassword.shuffle()
    return securePassword.joinToString("")
}