package org.example.lesson_8

fun main() {

    val weeklyViews = arrayOf(325, 514, 216, 370, 181, 31, 278)
    var totalViews = 0

    for(views in weeklyViews) {
        totalViews += views
    }
    println("За неделю было $totalViews просмотров")
}