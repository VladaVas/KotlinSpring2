package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS_MAIN = 50
const val MIN_PROVISIONS_ALT = 50
const val RECOMMENDED_CREW = 70

fun main() {
    val isDamaged = false
    val crewCount = 60
    val provisions = 55
    val isWeatherFavorable = true

    val canDepart =
        (!isDamaged &&
                crewCount in MIN_CREW..MAX_CREW &&
                provisions > MIN_PROVISIONS_MAIN) ||
                (isDamaged &&
                        crewCount == RECOMMENDED_CREW &&
                        isWeatherFavorable &&
                        provisions >= MIN_PROVISIONS_ALT)

    println("Корабль может отправиться в плавание: $canDepart")
}}