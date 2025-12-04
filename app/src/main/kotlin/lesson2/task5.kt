package org.example.app.lesson2
import kotlin.math.pow

const val FREQUENCY = 1.0

fun main() {
    val initialAmount = 70_000
    val rate = 16.7
    val years = 20

    val rateDecimal = rate / 100
    val finalAmount = initialAmount * (1 + rateDecimal / FREQUENCY).pow(FREQUENCY * years)
    val result = finalAmount.toDouble()

    println("%.3f".format(result))
}