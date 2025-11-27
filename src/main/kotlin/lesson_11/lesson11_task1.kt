package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val email: String,
    val password: String,
)

fun main() {

    val user1 = User(
        id = 135,
        login = "testUser1",
        email = "user1@email.com",
        password = "!1357Qet"
    )

    val user2 = User(
        id = 753,
        login = "UserTest2",
        email = "test2user@email.com",
        password = ")975Piyr"
    )

    println("Пользователь №1: ")
    println("ID: ${user1.id}")
    println("Login: ${user1.login}")
    println("E-mail: ${user1.email}")
    println("Password: ${user1.password}")
    println()
    println("Пользователь №2: ")
    println("ID: ${user2.id}")
    println("Login: ${user2.login}")
    println("E-mail: ${user2.email}")
    println("Password: ${user2.password}")

}