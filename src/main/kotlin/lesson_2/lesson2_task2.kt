package org.example.lesson_2

const val SALARY_OF_EMPLOYEES = 30000
const val SALARY_OF_INTERNS = 20000

fun main() {

    val countOfEmployees = 50
    val countOfInterns = 30

    val totalSalaryEmployees = countOfEmployees * SALARY_OF_EMPLOYEES
    val totalSalaryEmployeesAndInterns = totalSalaryEmployees + countOfInterns * SALARY_OF_INTERNS
    val averageSalary = totalSalaryEmployeesAndInterns / (countOfInterns + countOfEmployees)

    println("Расходы на выплату зарплаты постоянных сотрудников: $totalSalaryEmployees руб.")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryEmployeesAndInterns руб.")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary руб.")

}