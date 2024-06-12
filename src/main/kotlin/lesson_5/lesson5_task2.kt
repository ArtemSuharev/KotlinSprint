package org.example.lesson_5

import java.util.*

const val AGE_OF_MAJORITY = 18

fun main() {

    println("Введите свой год рождения (например: 1988)")
    val yearOfBirth = readln().toInt()

    val calendar: Calendar = Calendar.getInstance()
    val currentYear = calendar.get(Calendar.YEAR)

    if (currentYear - yearOfBirth >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }

}