package org.example.lesson_15

interface Searching {
    fun searching()
}


abstract class Prodacts(
    val name: String,
    val amount: Int,
)

class Instrumets(
    name: String,
    amount: Int,
    private val accessories: List<Accessories>,
) : Prodacts(
    name = name,
    amount = amount,
), Searching {
    override fun searching() {
        println("Список комплектующих:")
        accessories.forEach { println("- ${it.name} (в наличии ${it.amount})") }
    }
}


class Accessories(
    name: String,
    amount: Int,
) : Prodacts(
    name = name,
    amount = amount,
)

fun main() {

    val gitarAccessories = listOf(
        Accessories("Комплекст струн для акустических гитар", 18),
        Accessories("Медиатор", 116)
    )

    val synthesizerAccessorues = listOf(
        Accessories("Стойка для клавищных инструментов", 10),
        Accessories("Пюптр", 8)
    )

    val violinAccessories = listOf(
        Accessories("Смычок", 16),
        Accessories("Канефоль", 3),
        Accessories("Комплект струн для смычковых интрументов", 32)
    )

    val gitar = Instrumets("Гитара", 25, gitarAccessories)
    val synthesizer = Instrumets("Синтезатор", 11, synthesizerAccessorues)
    val violin = Instrumets("Скрипка", 16, violinAccessories)

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