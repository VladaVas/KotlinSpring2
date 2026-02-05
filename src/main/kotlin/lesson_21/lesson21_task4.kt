package org.example.lesson_21

import java.io.File

fun main() {

    val file = File("words.txt")

    file.prependWord("Hello")
    file.prependWord("Word")

    println(file.readText())
}

fun File.prependWord(word: String) {
    val existingContent = if  (this.exists()) this.readText() else ""
    val newContent = word.lowercase() + "\n" + existingContent
    this.writeText(newContent)
}