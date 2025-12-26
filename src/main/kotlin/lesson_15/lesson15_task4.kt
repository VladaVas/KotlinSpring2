package org.example.lesson_15

interface Searching {
    fun searching()
}

abstract class Prodact(
    val name: String,
    val amount: Int,
)

class Instrumet(
    name: String,
    amount: Int,
    private val accessories: List<Accessorie>,
) : Prodact(
    name = name,
    amount = amount,
), Searching {
    override fun searching() {
        println("Список комплектующих:")
        accessories.forEach { println("- ${it.name} (в наличии ${it.amount})") }
    }
}

class Accessorie(
    name: String,
    amount: Int,
) : Prodact(
    name = name,
    amount = amount,
)

fun main() {

    val gitarAccessories = listOf(
        Accessorie("Комплекст струн для акустических гитар", 18),
        Accessorie("Медиатор", 116)
    )

    val synthesizerAccessorues = listOf(
        Accessorie("Стойка для клавищных инструментов", 10),
        Accessorie("Пюптр", 8)
    )

    val violinAccessories = listOf(
        Accessorie("Смычок", 16),
        Accessorie("Канефоль", 3),
        Accessorie("Комплект струн для смычковых интрументов", 32)
    )

    val gitar = Instrumet("Гитара", 25, gitarAccessories)
    val synthesizer = Instrumet("Синтезатор", 11, synthesizerAccessorues)
    val violin = Instrumet("Скрипка", 16, violinAccessories)

    val instrumets = listOf(gitar, synthesizer, violin)

    println("Введите, какой инструмент хотите найти:")
    val search = readln()
    val instrumet = instrumets.find { it.name.lowercase() == search.lowercase() }

    if (instrumet != null) {
        instrumet.searching()
    } else {
        println("Инструмент $search не найден")
    }
}