package org.example.lesson_16

class Gamer(
    val name: String,
    private var health: Int,
    private var impact: Int,
    private var isAlive: Boolean = true,
) {
    fun damage(amount: Int) {
        if (!isAlive) return
        health -= amount
        if (health <= 0) death()
    }

    fun healing(amount: Int) {
        if (!isAlive) return
        health += amount
    }

    private fun death() {
        impact = 0
        health = 0
        isAlive = false
        println("Игрок умер.")
    }
}

fun main() {

    val gamer = Gamer("Миша", 10, 10)

    gamer.damage(1)
    gamer.damage(1)
    gamer.healing(2)
    gamer.damage(4)
    gamer.healing(1)
    gamer.damage(8)
}