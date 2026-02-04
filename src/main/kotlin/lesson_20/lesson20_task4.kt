package org.example.lesson_20

fun main() {

    val elements = listOf("element 1", "element 2", "element 3", "element 4")

    val actions : List<() -> Unit> = elements.map { element ->
        { println("Нажат элемент $element") }
    }

    actions.forEachIndexed { index, action ->
        if (index % 2 == 1) {
            action()
        }
    }

}