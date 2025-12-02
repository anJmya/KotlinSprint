package org.example.app.lesson2

fun main() {
    val buffPercent = 20
    val crystalCount = 7
    val rudaCount = 11

    val buff = buffPercent / 100.0F

    val bonusCrystal = (buff * crystalCount).toInt()
    val bonusRuda = (buff * rudaCount).toInt()

    println("Bonus crystal: $bonusCrystal")
    println("Bonus ruda: $bonusRuda")
}

