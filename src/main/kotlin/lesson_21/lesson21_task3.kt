package org.example.lesson_21

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean {
    return currentHealth == maxHealth
}

fun main() {

    val player1 = Player("Bob", 40, 100)
    val player2 = Player("Bob", 100, 100)
    println(player1.isHealthy())
    println(player2.isHealthy())
}