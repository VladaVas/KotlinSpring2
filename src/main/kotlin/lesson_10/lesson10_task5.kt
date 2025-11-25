package org.example.lesson_10

const val LOGIN = "user@login.com"
const val PASSWORD = "A!1S@2D#3"

fun generateToken(length: Int = 32): String {

    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    return (1..length)
        .map { chars.random() }
        .joinToString("")
}

fun authorize(loginInput: String, passwordInput: String): String? {

    return if (loginInput == LOGIN && passwordInput == PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun getCart(token: String?) : List<String>? {
    if (token == null || token.length != 32) return null
    return listOf("Ноутбук", "Мышь", "Клавиатура", "Монитор")
}

fun main() {

    println("Введите логин: ")
    val loginInput = readln()

    println("Введите пароль: ")
    val passwordInput = readln()

    val token = authorize(loginInput, passwordInput)
    val cart = getCart(token)

    if (cart != null) {
        println("Содержимое корзины:")

        for (item in cart) {
            println("$item")
        }

    } else {
        println("Упс! Неверный логин или пароль.")
    }
}