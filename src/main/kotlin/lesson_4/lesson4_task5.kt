package org.example.lesson_4

fun main() {
    val isDamaged = false
    val crewCount = 60
    val provisions = 55
    val isWeatherFavorable = true

    val canDepart = (!isDamaged &&
            crewCount in 55..70 &&
            provisions > 50) ||
            (isDamaged &&
                    crewCount == 70 &&
                    isWeatherFavorable &&
                    provisions >= 50)

    println("Корабль может отправиться в плавание: $canDepart")
}