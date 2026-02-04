package org.example

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun main() {

    val player = Player("Bob", 40, 100)

    val healingPotion: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
    }

    println("${player.name} health is ${player.currentHealth}")
    healingPotion(player)
    println("${player.name} health is ${player.currentHealth}")
}