package org.example.lesson_18

open class Screen(
    val name: String,
) {
    fun draw(x: Int, y: Int) = printResult(x, y)
    fun draw(x: Float, y: Float) = printResult(x, y)

    private fun printResult(x: Any, y: Any) {
        println("Нарисована фигура: $name\nКоординаты: x = $x, y = $y")
    }
}

class Circle(name: String) : Screen(name)
class Square(name: String) : Screen(name)
class Dot(name: String) : Screen(name)

fun main() {

    val circle1 = Circle("Круг 1")
    val circle2 = Circle("Круг 2")
    val square1 = Square("Квадрат 1")
    val square2 = Square("Квадрат 2")
    val dot1 = Dot("Точка 1")
    val dot2 = Dot("Точка 2")

    circle1.draw(3, 6)
    println()
    circle2.draw(1.5f, 2.9f)
    println()
    square1.draw(4, 8)
    println()
    square2.draw(3.6f, 1.8f)
    println()
    dot1.draw(4, 8)
    println()
    dot2.draw(5f, 8f)
}