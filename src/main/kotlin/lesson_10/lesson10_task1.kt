package org.example.lesson_10

fun main() {

    println("Игрок бросает кости.")
    val playerRoll = rollDice()
    println("Игрок выбросил: $playerRoll")

    println("Компьютер бросает кости.")
    val compucterRoll = rollDice()
    println("Компьютер выбросил: $compucterRoll")

    if (playerRoll > compucterRoll) {
        println("Победило человечество")
    } else if (compucterRoll > playerRoll) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }

}

fun rollDice() : Int {
    return (1..6).random()
}
