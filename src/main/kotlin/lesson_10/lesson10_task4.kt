package org.example.lesson_10

fun main() {

    var playerWins = 0

    do {
        val result = playRound()

        when (result) {
            1 -> {
                println("Победило человечество")
                playerWins++
            }

            2 -> {
                println("Победила машина")
            }

            3 -> {
                println("Победила дружба")
            }
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val playerAnswer = readln()

    } while (playerAgreed(playerAnswer))

    println("Человек выиграл $playerWins партию(й)")
}

fun rollDice1(): Int {
    return (1..6).random()
}

fun playRound(): Int {
    println("Игрок делает ход.")
    val playerRoll = rollDice1()
    println("Игрок выбросил $playerRoll")

    println("Компьютер делает ход.")
    val compucterRoll = rollDice1()
    println("Компьютер выбросил $compucterRoll")

    return when {
        playerRoll > compucterRoll -> 1
        playerRoll < compucterRoll -> 2
        else -> 3
    }
}

fun playerAgreed(yesAnswer: String): Boolean {
    return yesAnswer.equals("Да", ignoreCase = true)
}