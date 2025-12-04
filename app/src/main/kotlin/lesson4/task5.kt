package org.example.app.lesson4

const val DAMAGE = false
const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_BOX = 50
const val WEATHER_GOOD = true

fun main() {
    print("Введите колличесвто экипажа: ")
    val crew: Int = readln().toInt()
    print("Еслть ли повреждения? true/false: ")
    val isDamaged: Boolean = readln().toBoolean()
    print("Количество ящиков с провизией: ")
    val provision: Int = readln().toInt()
    print("Погода хорошая? true/false: ")
    val goodWeather: Boolean = readln().toBoolean()

    val isAllowed: Boolean =
        (
            isDamaged == DAMAGE &&
                crew >= CREW_MIN &&
                crew <= CREW_MAX &&
                provision > PROVISION_BOX
        ) ||
            (
                isDamaged != DAMAGE &&
                    crew == CREW_MAX &&
                    goodWeather == WEATHER_GOOD &&
                    provision >= PROVISION_BOX
            )
    println("Может ли корабль плыть: $isAllowed")
}
