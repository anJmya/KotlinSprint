package org.example.app.lesson5

import kotlin.random.Random

const val LOWER_BOUND = 0
const val UPPER_BOUND = 42
const val REQUIRED_NUMBERS = 3

fun main() {
    val randomNumber: List<Int> =
        List(REQUIRED_NUMBERS) {
            Random.nextInt(LOWER_BOUND, UPPER_BOUND)
        }
    // println(randomNumber)

    print("Введите вашу первую догадку: ")
    val userNumber1 = readln().toInt()
    print("Введите вашу вторую догадку: ")
    val userNumber2 = readln().toInt()
    print("Введите вашу третью догадку: ")
    val userNumber3 = readln().toInt()

    val userInput = listOf<Int>(userNumber1, userNumber2, userNumber3)

    val guessed = randomNumber.intersect(userInput).size

    val result =
        when (guessed) {
            3 -> "Вы угадали все числа и получаете джекпот!!!"
            2 -> "Вы угадали два числа и получаете большой приз!"
            1 -> "Вы угадали одно число и получате утешительный приз"
            0 -> "Вы не угадали :("
            else -> "Ошибка!"
        }
    println(result)
}
