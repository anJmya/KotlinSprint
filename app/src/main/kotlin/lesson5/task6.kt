package org.example.app.lesson5

import kotlin.math.pow

const val CM_IN_M = 100

fun main() {
    print("Введите ваш вес: ")
    val userWeight: Float = readln().toFloat()
    print("Введите ваш рост: ")
    val userHeight: Float = readln().toFloat()

    val heightInMeters = userHeight / CM_IN_M

    val indexBodyMass: Float = userWeight / heightInMeters.pow(2)

    val userBodyMassIndex =
        when {
            indexBodyMass < 18.5 -> "Недостаточная масса тела"
            indexBodyMass in 18.5..<25.0 -> "Нормальная масса тела"
            indexBodyMass in 25.0..<30.0 -> "Избыточная масса тела"
            indexBodyMass >= 30 -> "Ожирение"
            else -> "Ошибка"
        }

    println("Ваш ИМТ = ${"%.2f".format(indexBodyMass)}. $userBodyMassIndex")
}
