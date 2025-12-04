package org.example.app.lesson4

const val TOTAL_TABLE = 13

fun main() {
    val bookedTableToday = 13
    val bookedTableTomorrow = 9

    val isAllowedToday = TOTAL_TABLE > bookedTableToday
    val isAllowedTomorrow = TOTAL_TABLE > bookedTableTomorrow

    println("Доступность столиков на сегодня: $isAllowedToday \n" +
            "Доступность столиков на завтра: $isAllowedTomorrow")
}