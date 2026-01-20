package org.example.lesson_17

class Quiz(
    question: String,
    answer: String
) {
    val question = question
    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}