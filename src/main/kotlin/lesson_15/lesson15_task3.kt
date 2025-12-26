package org.example.lesson_15

abstract class Role(
    val username: String,
) {
    abstract fun showActions()
    fun readMessage() {
        println("$username is reading message")
    }

    fun writeMessage(message: String) {
        println("$username is writing message")
        println("$username: $message")
    }
}

class User(
    username: String,
) : Role(
    username = username,
) {
    override fun showActions() {
        println("$username can:")
        println("- read message")
        println("- write message")
    }
}

class Admin(
    username: String,
) : Role(
    username = username,
) {
    override fun showActions() {
        println("$username can:")
        println("- read message")
        println("- write message")
        println("- delete message")
        println("- delete user")
    }

    fun deleteMessage(user: User) {
        println("$username deletes the message from ${user.username}")
    }

    fun deleteUser(user: User) {
        println("$username deletes the ${user.username}")
    }
}

fun main() {
    val user1 = User("Ivan")
    val user2 = User("Kira")
    val admin = Admin("Olga")

    user1.writeMessage("Hello, everyone!")
    println()
    user2.readMessage()
    user2.writeMessage("Ivan look like potato")
    println()
    admin.readMessage()
    admin.deleteMessage(user2)
    admin.deleteUser(user2)
}