package org.example.app.lesson1

const val SECONDS_PER_MINUTE = 60
const val MINUTES_PER_HOUR = 60

fun main() {
    val totalSeconds = 6480

    var minutes = totalSeconds/SECONDS_PER_MINUTE
    val seconds = totalSeconds % SECONDS_PER_MINUTE
    val hours = minutes/MINUTES_PER_HOUR
    minutes %= MINUTES_PER_HOUR

    println("%02d:%02d:%02d".format(hours,minutes,seconds))
}