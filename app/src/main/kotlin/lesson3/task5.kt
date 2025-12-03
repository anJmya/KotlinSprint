package org.example.app.lesson3

fun main() {
    val moveData = "D2-D4;0"

    val splitData = moveData.split("-" , ";")
    val staringPoint = splitData[0]
    val endPoint = splitData[1]
    val step = splitData[2]

    println(staringPoint)
    println(endPoint)
    println(step)
}