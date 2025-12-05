package org.example.app.lesson4

const val SUNNY: Boolean = true
const val TENT: Boolean = true
const val REQUIRED_HUMIDITY: Int = 20
const val FORBIDDEN_SEASON: String = "Зима"

fun main() {
    // Условия сейчас
    val isSunny: Boolean = true
    val tentOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "Зима"

    // Благоприятные условия
    val isGoodCondition = isSunny == SUNNY &&
        tentOpen == TENT &&
        humidity == REQUIRED_HUMIDITY &&
        season != FORBIDDEN_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodCondition")
}
