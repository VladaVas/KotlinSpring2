package org.example.lesson_7

fun main() {

    val letters = ('a'..'z').toList()
    val digits = ('1'..'9').toList()
    var randomPassword = ""

    for (i in 0 until 6) {

        if (i % 2 == 0) {
            randomPassword += letters.random()
        } else {
            randomPassword += digits.random()
        }
    }
    println("Сгенерированный пароль: $randomPassword")
}