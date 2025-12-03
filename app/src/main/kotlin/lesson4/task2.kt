package org.example.app.lesson4

fun main() {
    val averageWeightMin = 35
    val averageWeightMax = 100
    val averageVolume = 100

    val weight1 = 20
    val volume1 = 80
    println("Груз с весом $weight1 кг и объемомм $volume1 л соотвествует категории 'Average': ${weight1 > averageWeightMin && weight1 <= averageWeightMax && volume1 > averageVolume}")

    val weight2 = 50
    val volume2 = 100
    println("Груз с весом $weight2 кг и объемомм $volume2 л соотвествует категории 'Average': ${weight2 > averageWeightMin && weight2 <= averageWeightMax && volume2 > averageVolume}")

}