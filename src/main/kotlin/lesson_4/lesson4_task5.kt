package org.example.lesson_4

const val IS_DAMAGED = false
val CREW_COUNT = 60
val PROVISIONS = 55
val IS_WEATHER_FAVORABLE = true

fun main() {

    val canDepart = (!IS_DAMAGED &&
            CREW_COUNT in 55..70 &&
            PROVISIONS > 50) ||
            (IS_DAMAGED &&
                    CREW_COUNT == 70 &&
                    IS_WEATHER_FAVORABLE &&
                    PROVISIONS >= 50)

    println("Корабль может отправиться в плавание: $canDepart")
}