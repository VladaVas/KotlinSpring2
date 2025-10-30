package org.example.lesson_5

import kotlin.random.Random

fun main () {

    val win1 = Random.nextInt(0, 43)
    val win2 = Random.nextInt(0, 43)
    val win3 = Random.nextInt(0, 43)

    println("Введите первое число")
    val userNumber1 = readln().toInt()

    println("Введите второе число")
    val userNumber2 = readln().toInt()

    println("Введите третье число")
    val userNumber3 = readln().toInt()

    var matches = 0

    if (userNumber1 == win1 || userNumber1 == win2 || userNumber1 == win3) matches++
    if (userNumber3 == win1 || userNumber2 == win2 || userNumber2 == win3) matches++
    if (userNumber3 == win1 || userNumber3 == win2 || userNumber3 == win3) matches++

    when (matches) {
        3 -> println("Невероятно! 🎉 Вы угадали все числа и выиграли ДЖЕКПОТ!")
        2 -> println("Отличный результат! 🎁 Вы угадали два числа и получаете крупный приз!")
        1 -> println("Неплохо 😊 Вы угадали одно число и получаете утешительный приз.")
        0 -> println("Увы 😔 Вы не угадали ни одного числа. Попробуйте снова!")
    }

    println("Выигрышные числа: $win1, $win2, $win3")
}