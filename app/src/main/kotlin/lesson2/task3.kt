package org.example.app.lesson2

const val MINUTES_PER_HOUR = 60
const val HOURS_PER_DAY = 24

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    // убутыие в минутах от начала суток
    val departureInMinutes = departureHour * MINUTES_PER_HOUR + departureMinute

    // прибытие в минутах от начала суток
    val arriveInMinutesTotal = departureInMinutes + travelTimeMinutes

    val arriveInHours = (arriveInMinutesTotal / MINUTES_PER_HOUR ) % HOURS_PER_DAY
    val arriveInMinutes = arriveInMinutesTotal % MINUTES_PER_HOUR

    println ("%02d:%02d".format(arriveInHours,arriveInMinutes))
}