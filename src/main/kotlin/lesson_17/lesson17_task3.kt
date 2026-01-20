package org.example.lesson_17

class Folder(
    private val name: String,
    private val amount: String,
    private var secret: Boolean = true,
) {
    val folderName: String
        get() = if (secret) "This folder is hidden" else "Folder name: $name"

    val fileAmount: String
        get() = if (secret) "Files amount: 0" else "Files amount: $amount"


}

fun main() {

    val folder1 = Folder("Papka", "13", true)

    println(folder1.folderName)
    println(folder1.fileAmount)
    println()

    val folder2 = Folder("Pepe Frog", "18", false)

    println(folder2.folderName)
    println(folder2.fileAmount)

}