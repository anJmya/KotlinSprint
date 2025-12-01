package org.example.app.lesson2

fun main() {
    val employeeCount = 50
    val salary = 30_000

    val internCount = 30
    val internSalary = 20_000

    // общая зп постоянных сотрудников
    val employeeSalarySum = salary * employeeCount
    println(employeeSalarySum.toInt())

    // затраты на зарплаты всем
    val totalSalaryExpense = internSalary * internCount + employeeSalarySum
    println(totalSalaryExpense.toInt())

    // средняя зп в компании
    val averageSalaryPerPerson = totalSalaryExpense / (internCount + employeeCount)
    println(averageSalaryPerPerson.toInt())
}