package org.example.lesson_15

abstract class Roles(
    val username: String,
) {
    open fun readMessage() {
        println("${username} is reading message")
    }

    fun writeMessage(message: String?) {
        println("${username} is writing message")
        println("${username}: $message")
    }
}

class Users(
    username: String,
) : Roles(
    username = username,
)

class Admins(
    username: String,
) : Roles(
    username = username,
) {
    fun deleteMessage(user: Users) {
        println("${username} deletes the message from ${user.username}")
    }

    fun deleteUser(user: Users) {
        println("${username} deletes the ${user.username}")
    }
}

fun main() {
    val user1 = Users("Ivan")
    val user2 = Users("Kira")
    val admin = Admins("Olga")

    user1.writeMessage("Hello, everyone!")
    println()
    user2.readMessage()
    println()
    user2.writeMessage("Ivan look like potato")
    println()
    admin.readMessage()
    println()
    admin.deleteMessage(user2)
    println()
    admin.deleteUser(user2)


}