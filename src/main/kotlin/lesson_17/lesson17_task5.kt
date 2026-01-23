package org.example.lesson_17

class User(
    login: String,
    password: String,
) {
    var password : String = password
        get() = "*".repeat(field.length)
        set(value) {
            println("You can't change the password")
        }

    var login = login
        set(value) {
            field = value
            println("Successful login change. \nYour new login: $login")
        }
}

fun main() {

    val userData = User("pesik.pesik@pesik.gaf", "153kfkdks3929")

    println("User data: \n login: ${userData.login} \n password: ${userData.password}")
    println()
    userData.password = "1234567654323456i7654ewdfgbnfdrefghgr"
    println()
    userData.login = "kotik.kotik@kotik.mur"
    println()
    println("User data: \n login: ${userData.login} \n password: ${userData.password}")

}


