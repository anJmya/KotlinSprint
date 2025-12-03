package org.example.app.lesson4

fun main() {
    val totalTable = 13
    val bookedTableToday = 13
    val bookedTableTomorrow = 9

    val isAllowedToday = totalTable != bookedTableToday
    val isAllowedTomorrow = totalTable != bookedTableTomorrow

    println("Доступность столиков на сегодня: $isAllowedToday \n" +
            "Доступность столиков на завтра: $isAllowedTomorrow")
}