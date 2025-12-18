package org.example.lesson_14

const val WHITE_COLOR = "белый"
const val BLACK_COLOR = "черный"

abstract class Figure(
    val color: String,
) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(
    color = color
) {
    override fun area(): Double {
        val circleArea = Math.PI * radius * radius
        return circleArea
    }

    override fun perimeter(): Double {
        val circlePerimeter = 2 * Math.PI * radius
        return circlePerimeter
    }

}

class Rectangle(
    color: String,
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

    val whiteCircle = Circle(WHITE_COLOR, 30)
    val blackRectangle = Rectangle(BLACK_COLOR, 5, 10)
    val blackCircle = Circle(BLACK_COLOR, 18)
    val whiteRectangle = Rectangle(WHITE_COLOR, 6, 14)

    val figures: List<Figure> = listOf(
        whiteCircle,
        whiteRectangle,
        blackCircle,
        blackRectangle,
    )

    val blackPerimeterSum = figures
        .filter { it.color == BLACK_COLOR }
        .sumOf { it.perimeter() }

    val whiteAreaSum = figures
        .filter { it.color == WHITE_COLOR }
        .sumOf { it.area() }

    println("Сумма периметров всех черных фигур: ${blackPerimeterSum.toInt()}")
    println("Cумма площадей всех белых фигур: ${whiteAreaSum.toInt()}")
}