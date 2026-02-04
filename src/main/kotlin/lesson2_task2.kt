package org.example

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

val healingPotion: (Player) -> Unit = { player ->
    player.currentHealth = player.maxHealth
}

fun main() {

    val player = Player(
        name = "Bob",
        currentHealth = 40,
        maxHealth = 100,
    )
    println("${player.name} health is ${player.currentHealth}")
    healingPotion(player)

    println("${player.name} health is ${player.currentHealth}")
}