package org.example.lesson_2

const val COUNT_OF_STUDENTS = 4

fun main() {

    val scoreOfStudent1 = 3
    val scoreOfStudent2 = 4
    val scoreOfStudent3 = 3
    val scoreOfStudent4 = 5

    val averageScore : Float = ((scoreOfStudent1 + scoreOfStudent2 + scoreOfStudent3 + scoreOfStudent4).toFloat() / COUNT_OF_STUDENTS)
    println("Средний бал: ${"%.2f".format(averageScore)}")

}