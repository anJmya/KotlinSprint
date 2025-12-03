package org.example.app.lesson3

fun main() {
    var age = 20
    val firstName = "Татьяна"
    var secondName = "Андреева"
    val middleName = "Сергеевна"

    println("$secondName $firstName $middleName, $age")

    age = 22
    secondName = "Сидорова"
    println("$secondName $firstName $middleName, $age")
}