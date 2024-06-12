package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val number1 = Random.nextInt(1, 9)
    val number2 = Random.nextInt(1, 9)

    val controlSum: Int = number1 + number2

    println("Для авторизации решите пример: $number1 + $number2")
    val userSum: Int = readln().toInt()

    if (userSum == controlSum) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}