package org.example.app.lesson1

fun main() {
    val totalSeconds = 6480

    var minutes = totalSeconds/60
    val seconds = totalSeconds % 60
    val hours = minutes/60
    minutes %= 60

    println ("%02d:%02d:%02d".format(hours,minutes,seconds))
}