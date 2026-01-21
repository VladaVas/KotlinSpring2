package org.example.lesson_17

class Folder(
    private val name: String,
    private val amount: Int,
    private var isSecret: Boolean = true,
) {
    val folderName: String
        get() = if (isSecret) "This folder is hidden" else name

    val fileAmount: Int
        get() = if (isSecret) 0 else amount
}

fun main() {

    val folder1 = Folder("Papka", 13, true)

    println(folder1.folderName)
    println(folder1.fileAmount)
    println()

    val folder2 = Folder("Pepe Frog", 18, false)

    println(folder2.folderName)
    println(folder2.fileAmount)

}