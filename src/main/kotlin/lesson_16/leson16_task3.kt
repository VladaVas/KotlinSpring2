package org.example.lesson_16

class User(
    val login: String,
    private val password: String,
) {

    fun passwordValidation(inputPasword: String): Boolean {
        return inputPasword == password
    }
}

fun main() {

    val user = User("login", "password")

    println("Введите пароль:")
    val input = readln()
    val correctPassword = user.passwordValidation(input)

    if (correctPassword) {
        println("Пароль верный.")
    } else {
        println("Пароль неверный.")
    }
}