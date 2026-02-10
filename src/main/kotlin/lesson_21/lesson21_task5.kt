package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String? {
    val maxValue = this.values.maxByOrNull{ it } ?: return null
    return this.entries.firstOrNull { it.value == maxValue }?.key
}

fun main() {

    val skills = mapOf(
        "Strength" to 80,
        "Intelligence" to 70,
        "Charisma" to 40,
        "Agility" to 80,
    )

    println(skills.maxCategory())
}



