package org.example.lesson_11

class Forum {

    val users = mutableListOf<ForumParticipant>()
    val messages = mutableListOf<ForumMessage>()
    private var newId = 1

    fun createNewUser(userName: String, userId: Int): ForumParticipant {
        val user = ForumParticipant(newId, userName)
        users.add(user)
        newId++
        println("Создан новый пользователь: $userName c ID: $userId")
        return user
    }

    fun createNewMessage(userMessage: String, authorId: Int): ForumMessage? {
        val userExist = users.any { it.userId == authorId }

        if (!userExist) {
            println("Пользователь с $authorId не найден. Сообщение не создано.")
            return null
        }

        val message = ForumMessage(authorId, userMessage)
        messages.add(message)
        return message
    }

    fun printThread() {
        println("==== Сообщения форума ====")

        for (msg in messages) {
            var authorName = "?"
            for (user in users) {
                if (user.userId == msg.authorId) {
                    authorName = user.userName
                    break
                }
            }
            println("$authorName: ${msg.userMessage}")
        }
    }
}

class ForumParticipant(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val userMessage: String,
)

fun main() {

    val forum = Forum()

    val user1 = forum.createNewUser("Фёдор", 1)
    val user2 = forum.createNewUser("Елисей", 2)

    forum.createNewMessage("Привет, это первое сообщение!", user1.userId)
    forum.createNewMessage("Привет, это второе сообщение!", user1.userId)

    forum.createNewMessage("Здравствуйте, я Елисей!", user2.userId)
    forum.createNewMessage("Второе сообщение от Елисей", user2.userId)

    forum.printThread()
}