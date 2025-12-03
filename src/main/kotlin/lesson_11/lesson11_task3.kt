package org.example.lesson_11

class Participants(
    val nickname: String,
    val avatar: String,
    var status: String,
)

class VoiceRoom(
    val cover: String,
    val title: String,
) {
    private val participants = mutableListOf<Participants>()

    fun addParticipants(participant: Participants) {

        if (participants.add(participant)) {
            println("Участник ${participant.nickname} добавлен в комнату.")
        } else {
            println("Участник ${participant.nickname} уже существует.")
        }
    }


    fun updateStatus(nickname: String, newStatus: String) {
        val person = participants.find { participants -> participants.nickname == nickname }

        if (person == null) {
            println("Пользователь с таким $nickname не найден.")
            return
        }

        person.status = newStatus
        println("Статус пользователя $nickname обновлен: $newStatus")
    }

    fun printRoomInfo() {
        println("Комната: $title")
        println("Обложка: $cover")
        println("Участники:")

        for (i in participants) {
            println("- ${i.nickname}, статус: ${i.status}, аватар: ${i.avatar}")
        }
    }
}

fun main() {

    val room = VoiceRoom (
        cover = "covers/music.jpg",
        title = "Музыкальная комната",
    )

    val user1 = Participants("Luna", "avatars/luna.png", "разговаривает")
    val user2 = Participants("Mars", "avatars/mars.png", "микрофон выключен")
    val user3 = Participants("Orion", "avatars/orion.png", "пользователь заглушен")

    room.addParticipants(user1)
    room.addParticipants(user2)
    room.addParticipants(user3)

    room.printRoomInfo()

    room.updateStatus("Mars", "разговаривает")

    room.printRoomInfo()
}