package org.example.lesson_10

fun main() {

    print("Придумайте логин: ")
    val userLogin = readln()

    print("Придумайте пароль: ")
    val userPassword = readln()

    if (!dataValid(userLogin) || !dataValid(userPassword)) {
        print("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }
}

fun dataValid (dataLength: String) : Boolean {
    return dataLength.length >= 4

}