package org.example.lesson_18

abstract class Box(
    val length: Int,
    val width: Int,
    val height: Int
) {
    abstract fun surfaceArea(): Int
}

class RectangularBox(length: Int, width: Int, height: Int) : Box(length, width, height) {
    override fun surfaceArea(): Int {
        return 2 * (length * width + width * height + length * height)
    }
}
class CubeBox(edge: Int) : Box(edge, edge, edge) {
    override fun surfaceArea(): Int {
        return 6 * height * height
    }
}

fun main() {

    val rectangularBox = RectangularBox(20, 10, 5)
    val cubeBox = CubeBox(4)

    val boxList : List<Box> = listOf(rectangularBox,cubeBox)
    for (box in boxList) {
        println("The surface area for this box is ${box.surfaceArea()}")
    }
}