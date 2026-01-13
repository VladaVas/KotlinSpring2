package org.example.lesson_16

class Dice {

    private val diceValue: Int = (1..6).random()

    fun printValue() {

        println("На кубике выпало число: $diceValue")
    }
}

fun main() {

    val dice = Dice()
    dice.printValue()
}