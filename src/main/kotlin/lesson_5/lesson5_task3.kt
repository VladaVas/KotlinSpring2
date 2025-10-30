package org.example.lesson_5

const val RIGHT_NUMBER_ONE = 38
const val RIGHT_NUMMBER_TWO  = 17

fun main() {

    println("Введите первое число:")
    val firstNumber = readln().toInt()

    println("Введите второе число:")
    val secondNumber = readln().toInt()

    val consoleNumber = if ((firstNumber == RIGHT_NUMBER_ONE && secondNumber == RIGHT_NUMMBER_TWO) ||
        (secondNumber == RIGHT_NUMBER_ONE && firstNumber == RIGHT_NUMMBER_TWO))  {
        "Поздравляем! Вы выиграли главный приз!"
    } else if ((firstNumber == RIGHT_NUMBER_ONE || secondNumber == RIGHT_NUMMBER_TWO) ||
        (secondNumber == RIGHT_NUMBER_ONE || firstNumber == RIGHT_NUMMBER_TWO)) {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }
    println(consoleNumber)
    println("Для победы нужно было угадать числа: $RIGHT_NUMBER_ONE и $RIGHT_NUMMBER_TWO")

}