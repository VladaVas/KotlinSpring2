package org.example.lesson_4

const val IS_DAMAGED = false
const val CREW_COUNT = 60
const val PROVISIONS = 55
const val IS_WEATHER_FAVORABLE = true

fun main() {

    val canDepart = (!IS_DAMAGED == true &&
            CREW_COUNT in 55..70 &&
            PROVISIONS > 50) ||
            (IS_DAMAGED &&
                    CREW_COUNT == 70 &&
                    IS_WEATHER_FAVORABLE == true &&
                    PROVISIONS >= 50)

    println("Корабль может отправиться в плавание: $canDepart")
}