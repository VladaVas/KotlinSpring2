package org.example.lesson_16

class Circle(
    private val radius: Double
) {
    private val pi: Double = kotlin.math.PI

    fun calculateCircumference(): Double {
        return 2 * pi * radius
    }

    fun calculatedArea(): Double {
        return pi * radius
    }
}

fun main() {

    val circle = Circle(5.0)

    println("Длина окружности: ${circle.calculateCircumference().toInt()}")
    println("Площадь круга: ${circle.calculatedArea().toInt()}")
}