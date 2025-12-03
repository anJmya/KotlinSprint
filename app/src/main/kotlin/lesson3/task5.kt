package org.example.app.lesson3

fun main() {
    val moveData = "D2-D4;0"

    val splitData = moveData.split(";")
    val position = splitData[0]
    val step = splitData[1]

    val splitPosition = position.split("-")
    val staringPoint = splitPosition[0]
    val endPoint = splitPosition[1]

    println(staringPoint)
    println(endPoint)
    println(step)
}