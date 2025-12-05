package org.example.app.lesson4

fun main() {
    val days = 5

    val isArmAbsDay = days % 2 != 0
    val isLegBackDay = !isArmAbsDay

    println("""
        Упражнения для рук:      $isArmAbsDay
        Упражнения для ног:      $isLegBackDay
        Упражнения для спины:    $isLegBackDay
        Упражениения для пресса: $isArmAbsDay
    """.trimIndent())
}