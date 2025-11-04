package org.example.lesson_5

fun main() {

    println("Введите расстояние поездки (в километрах): ")
    val distance = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах): ")
    val fuelConsumption = readln().toDouble()

    println("Введите текущую цену за литр топлива: ")
    val fuelPrice = readln().toDouble()

    val totalFuel = (distance * fuelConsumption) / 100
    val totalPrice = totalFuel * fuelPrice

    println("Общее количество необходимого топлива: %.2f литров".format(totalFuel))
    println("Итоговая стоимость: %.2f руб.".format(totalPrice))

}