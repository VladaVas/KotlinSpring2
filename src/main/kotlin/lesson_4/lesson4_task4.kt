package org.example.lesson_4

fun main() {
    val trainingDay = 6

    val isArmAbsDay = trainingDay % 2 == 1

    println(
        """
        Упражнения для рук:       $isArmAbsDay
        Упражнения для ног:       ${!isArmAbsDay}
        Упражнения для спины:  ${!isArmAbsDay}
        Упражнения для пресса: $isArmAbsDay
        """.trimIndent()
    )

}