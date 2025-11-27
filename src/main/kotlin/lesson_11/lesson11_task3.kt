package org.example.lesson_11

class Participants(
    val nickname : String,
    val avatar : String,
    val status : String,
) {

}

class SpeakingRoom(
    val cover: String,
    val name: String,
    val participants: List,
) {
}