package org.example.lesson_6

fun main() {
    println("Добро пожаловать! У вас ещё нет аккаунта. Давайте создадим его.")

    println("Создать логин:")
    val newLogin = readln()

    println("Создайте пароль: ")
    val newPassword = readln()

    println("Аккаунт успешно создан! Теперь войдите в систему.")

    while (true) {
        println("Введите логин: ")
        val userLogin = readln()

        println("Введите пароль: ")
        val userPassword = readln()

        if (userLogin == newLogin && userPassword == newPassword) {
            println("Авторизация прошла успешно.\nДобро пожаловать!")
            break
        } else {
            println("Неверный логин или пароль. Попробуйте еще раз")
        }
    }

}