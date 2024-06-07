package org.example.lesson_2

fun main() {

    val salaryOfEmployees = 30000
    val salaryOfInterns = 20000

    val countOfEmployees = 50
    val countOfInterns = 30

    val totalSalaryEmployees = countOfEmployees * salaryOfEmployees
    val totalSalaryEmployeesAndInterns = totalSalaryEmployees + countOfInterns * salaryOfInterns
    val averageSalary = totalSalaryEmployeesAndInterns / (countOfInterns + countOfEmployees)

    println("Расходы на выплату зарплаты постоянных сотрудников: $totalSalaryEmployees руб.")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryEmployeesAndInterns руб.")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary руб.")

}