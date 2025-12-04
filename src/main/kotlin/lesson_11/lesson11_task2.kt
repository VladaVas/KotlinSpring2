package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    val email: String,
    var password: String,
    var bio: String? = null,
) {

    fun printInfo() {

        println("==== Информация о пользователе ====")
        println("ID: $id")
        println("Login: $login")
        println("Email: $email")
        println("Bio: ${bio ?: "не указано"}")
        println("=====================================")

    }

    fun newBio(newBioText: String) {
        bio = newBioText

    }

    fun changePassword() {

        do {
            println("Введите пароль: ")
            val oldPassword = readln()

            if (oldPassword != password) {
                println("Неверный пароль! Попробуйте снова.")
            }
        } while (oldPassword != password)

        println("Пароль введен верно! Введите новый пароль: ")
        val newPassword = readln()

        password = newPassword
        println("Пароль успешно изменен!")
    }
}

fun main() {

    val userInfo = User2(
        id = 1234567,
        login = "User Userovich",
        email = "userovich@mail.com",
        password = "QwErTyUiOp",
        bio = null
    )

    userInfo.printInfo()
    println()

    userInfo.newBio("Я люблю котиков и программирование!")
    println()

    userInfo.printInfo()
    println()

    userInfo.changePassword()
}