package org.example.lesson_14

open class Message(
    open val id: Int,
    open val parentMessageID: Int? = null,
    open val messageAutor: String,
    open val messageText: String,
)

class ChildMessage(
    override val id: Int,
    override val parentMessageID: Int,
    override val messageAutor: String,
    override val messageText: String,
) : Message(
    id = id,
    parentMessageID = parentMessageID,
    messageAutor = messageAutor,
    messageText = messageText,
) {}

class Chat(
    val id: Int,
    var messageList: List<Message> = listOf()
    ) {

    var newtId = 1

    fun addMessage(messageAutor: String, textMessage: String) {

        val newMessage = Message(newtId, null, messageAutor, textMessage)
        messageList = messageList + newMessage
        newtId++
    }
    fun addThreadMessage(parentMessageID: Int, messageAutor: String, textMessage: String,) {

        val newMessage = ChildMessage(newtId, parentMessageID, messageAutor, textMessage)
        messageList = messageList + newMessage
        newtId++
    }
    fun printChat() {

        val chatGroup = messageList.groupBy { it.parentMessageID }
        chatGroup[null]?.forEach { message ->
            println("${message.messageAutor}: ${message.messageText}")

            chatGroup[message.id]?.forEach { child ->
                println("    ${child.messageAutor}: ${child.messageText}")

            }
            println()
        }

    }
}

fun main() {

   val chat = Chat(1)

    chat.addMessage("Saya", "Hi, everyone! My name is Saya!")
    chat.addMessage("Bob", "If everything goes according to plan?")
    chat.addMessage("Veniamin", "Hey! What do you think about Ilon Mask?")

    chat.addThreadMessage(1, "Mila", "Hi, Saya!")
    chat.addThreadMessage(1, "Lilya", "Hello, Saya! Nice to meet you!")
    chat.addThreadMessage(2, "Milton", "I can't go with you, guys :(")
    chat.addThreadMessage(2, "Makar", "Everything is still on! We meet tomorrow at 8 a.m.")
    chat.addThreadMessage(3, "Josh", "I don't like him")
    chat.addThreadMessage(3, "Alice", "I think he is a cool guy!")

    chat.printChat()
}