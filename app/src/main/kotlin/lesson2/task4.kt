package org.example.app.lesson2

fun main() {
    val buff = 0.2F
    val crystalCount = 7
    val rudaCount = 11

    println(buffCalculator(buff, crystalCount))
    println(buffCalculator(buff,rudaCount))
}

fun buffCalculator(buff: Float, material: Int): Int {
    return (buff * material).toInt()
}