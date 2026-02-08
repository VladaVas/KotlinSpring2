package org.example.lesson_20

class Robot(
    private val phrases: List<String> = listOf(
        "Привет человек",
        "Я люблю программирование",
        "Kotlin это весело",
        "Роботы захватят мир",
        "Хорошего дня"
    )
) {

    private var modifier: ((String) -> String)? = { it }

    fun say() {
        val phrase = phrases.random()
        val result = modifier?.invoke(phrase) ?: phrase
        println(result)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
        }
    }


fun main() {

    val robot = Robot()
    robot.say()

    robot.setModifier { text ->
        text.split(" ")
            .reversed()
            .joinToString(" ")
    }

    robot.say()
}