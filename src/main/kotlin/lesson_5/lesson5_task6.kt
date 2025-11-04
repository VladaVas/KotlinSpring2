package org.example.lesson_5

fun main () {

    println("Введите ваш вес в килограммах: ")
    val weight = readln().toDouble()

    println("Введите ваш рос в сантиметрах: ")
    val heightCm = readln().toDouble()

    val heightM = heightCm / 100

    val bmi = weight / (heightM * heightM)

   val category = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi < 25 -> "Нормальная масса тела"
        bmi < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println ("Ваш индекс массы тела (ИМТ): %.2f".format(bmi))
    println("Категория веса: $category")
}