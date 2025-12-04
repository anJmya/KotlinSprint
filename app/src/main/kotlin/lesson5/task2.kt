package org.example.app.lesson5

const val CURRENT_YEAR = 2025
const val MAJORITY_AGE = 18

fun main() {
    print("Введите ваш год рождения: ")
    val userBirthYear = readln().toInt()
    val userAge = CURRENT_YEAR - userBirthYear

    if (userAge >= MAJORITY_AGE) {
        println("Показать экран со скрытым контентом")
    }
}
