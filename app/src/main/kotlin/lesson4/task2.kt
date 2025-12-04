package org.example.app.lesson4

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME = 100

fun main() {
    val weight1 = 20
    val volume1 = 80
    println(
        "Груз с весом $weight1 кг и объемомм $volume1 л соотвествует категории 'Average':" +
            " ${weight1 > WEIGHT_MIN && weight1 <= WEIGHT_MAX && volume1 > VOLUME}",
    )

    val weight2 = 50
    val volume2 = 100
    println(
        "Груз с весом $weight2 кг и объемомм $volume2 л соотвествует категории 'Average':" +
            " ${weight1 > WEIGHT_MIN && weight1 <= WEIGHT_MAX && volume1 > VOLUME}",
    )
}
