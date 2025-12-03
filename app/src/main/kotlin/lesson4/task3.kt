package org.example.app.lesson4

fun main() {
    // Условия сейчас
    val isSunny: Boolean = true
    val tentOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "Зима"

    // Благоприятные условия
    val isGoodCondition = isSunny && tentOpen && humidity == 20 && season != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodCondition")

}