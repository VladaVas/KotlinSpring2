package org.example.lesson_14

abstract class Figure(
    open val color: String,
) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    override val color: String,
    val radius: Int,
) : Figure(
    color = color
) {
    override fun area(): Double {
        val circleArea = 3.14 * radius * radius
        return circleArea
    }

    override fun perimeter(): Double {
        val circlePerimeter = 2 * 3.14 * radius
        return circlePerimeter
    }

}

class Rectangle(
    override val color: String,
    val width: Int,
    val height: Int,
) : Figure(
    color = color
) {
    override fun area(): Double {
        val rectangleArea = width * height
        return rectangleArea.toDouble()
    }

    override fun perimeter(): Double {
        val rectanglePerimeter = 2 * (width + height)
        return rectanglePerimeter.toDouble()
    }
}

fun main() {

    val whiteCircle = Circle("белый", 30)
    val blackRectangle = Rectangle("черный", 5, 10)
    val blackCircle = Circle("черный", 18)
    val whiteRectangle = Rectangle("белый", 6, 14)

    val figures: List<Figure> = listOf(
        whiteCircle,
        whiteRectangle,
        blackCircle,
        blackRectangle,
    )

    val blackPerimeterSum = figures
        .filter { it.color == "черный" }
        .sumOf { it.perimeter() }

    val whiteAreaSum = figures
        .filter { it.color == "белый" }
        .sumOf { it.area() }

    println("Сумма периметров всех черных фигур: ${blackPerimeterSum.toInt()}")
    println("Cумма площадей всех белых фигур: ${whiteAreaSum.toInt()}")
}