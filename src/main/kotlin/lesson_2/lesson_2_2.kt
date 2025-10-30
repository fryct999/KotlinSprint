package org.example.lesson_2

fun main() {
    val countWorkers = 50
    val countStudents = 30

    val payrollWorker = 30000
    val payrollStudent = 20000

    val payrollAllWorkers = countWorkers * payrollWorker
    val payrollAllStudents = countStudents * payrollStudent
    val allPayroll = payrollAllWorkers + payrollAllStudents

    val averagePayroll = (allPayroll / (countWorkers + countStudents)).toInt()

    println(payrollAllWorkers)
    println(allPayroll)
    println(averagePayroll)
}