package org.example.app.lesson5

const val AUTH_CHECK = "7+5"
const val ANSWER = 12

fun main() {
    println(
        """
            Авторизация
        Докажите что вы не бот!
        Сложите $AUTH_CHECK
        """.trimIndent(),
    )

    print("Ваш ответ: ")
    val userAnswer = readln().toInt()
    if (userAnswer == ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
