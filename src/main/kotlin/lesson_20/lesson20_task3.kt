package org.example.lesson_20

class Player1(
    var key: Boolean,
)

fun main() {

    val player1 = Player1( false)

    val findKey: (Player1) -> String = { player ->
        if (player.key) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }

    val result = findKey(player1)
    println(result)

}