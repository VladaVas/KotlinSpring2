package org.example.lesson_7

const val PASSWORD_LENGTH = 6

fun main() {

    val letters = 'a'..'z'
    val digits = '1'..'9'
    var randomPassword = ""

    for (i in 0 until PASSWORD_LENGTH) {

        if (i % 2 == 0) {
            randomPassword += letters.random()
        } else {
            randomPassword += digits.random()
        }
    }
    println("Сгенерированный пароль: $randomPassword")
}