package org.example.lesson_18

open class Dice(private val layers: Int) {

    open fun roll() {
        val number = (1..layers).random()
        println("Value: $number")
    }
}

class Dice4(layers: Int = 4) : Dice(layers) {
    override fun roll() {
        println("The square dice are thrown!")
        super.roll()
    }
}

class Dice6(layers: Int = 6) : Dice(layers) {
    override fun roll() {
        println("The hexagon dice are thrown!")
        super.roll()
    }
}

class Dice8(layers: Int = 8) : Dice(layers) {
    override fun roll() {
        println("The octagonal dice are thrown!")
        super.roll()
    }
}

fun main() {

    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()

    val diceList : List<Dice> = listOf(dice4, dice6, dice8)

    for (dice in diceList) {
        dice.roll()
    }
}