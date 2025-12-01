package org.example.app.lesson2
import kotlin.math.pow

const val FREQUENCY = 1.0

fun main() {
    val initialAmount = 70_000
    val rate = 16.7
    val years = 20

    val result = compounding(initialAmount.toDouble(),rate,years)
    println("%.3f".format(result))
}

fun compounding(base: Double, rate: Double, years: Int,): Double {
    // S = P ⋅ (1 + r/n) ^ n ⋅ t
    val rateDecimal = rate / 100
    val finalAmount = base * (1 + rateDecimal / FREQUENCY).pow(FREQUENCY * years)

    return finalAmount
}