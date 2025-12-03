package org.example.app.lesson2

fun main() {
    val studentsCount = 4

    val grade1 = 3
    val grade2 = 4
    val grade3 = 3
    val grade4 = 5

    val gradeSum = grade1 + grade2 + grade3 + grade4
    val average: Float = gradeSum.toFloat() / studentsCount
    println(average)
}