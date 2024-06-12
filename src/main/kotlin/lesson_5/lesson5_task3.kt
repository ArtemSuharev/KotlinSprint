package org.example.lesson_5

const val WINNING_NUMBER_ONE = 10
const val WINNING_NUMBER_TWO = 37

fun main() {

    println("Удивительная лотерея!!! Испытай удачу!!!")
    println("Введи первое число от 0 до 42:")
    val userNumberOne = readln().toInt()
    println("Введи второе число от 0 до 42:")
    val userNumberTwo = readln().toInt()

    if ((userNumberOne == WINNING_NUMBER_ONE && userNumberTwo == WINNING_NUMBER_TWO) || (userNumberOne == WINNING_NUMBER_TWO && userNumberTwo == WINNING_NUMBER_ONE)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((userNumberOne != WINNING_NUMBER_ONE && userNumberTwo != WINNING_NUMBER_TWO) || (userNumberOne != WINNING_NUMBER_TWO && userNumberTwo != WINNING_NUMBER_ONE)) {
        println("Неудача!")
    } else {
        println("Вы выиграли утешительный приз!")
    }

    println("Выигрышная комбинация: $WINNING_NUMBER_ONE и $WINNING_NUMBER_TWO")

}