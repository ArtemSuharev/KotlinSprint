package org.example.lesson_5

import kotlin.random.Random

const val MIN_RANDOM_NUMBER = 0
const val MAX_RANDOM_NUMBER = 42

fun main() {

    val randomNumbers: List<Int> = listOf(
        Random.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER),
        Random.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER),
        Random.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER),
    )

    println("Удивительная лотерея!!! Испытай удачу!!!")
    println("Введи первое число от $MIN_RANDOM_NUMBER до $MAX_RANDOM_NUMBER:")
    val userFirstNumber = readln().toInt()
    println("Введи второе число от $MIN_RANDOM_NUMBER до $MAX_RANDOM_NUMBER:")
    val userSecondNumber = readln().toInt()
    println("Введи третье число от $MIN_RANDOM_NUMBER до $MAX_RANDOM_NUMBER:")
    val userThirdNumber = readln().toInt()

    val userNumbers: List<Int> = listOf(
        userFirstNumber,
        userSecondNumber,
        userThirdNumber
    )

    val countIntersect = randomNumbers.intersect(userNumbers.toSet()).count()

    when(countIntersect) {
        3 -> println("Ты угадал все числа и выиграл джекпот")
        2 -> println("Ты угадал два числа и получает крупный приз")
        1 -> println("Ты угадал одно число и получаешь утешительный приз")
        0 -> println("Ты не угадал ни одного числа")
    }

    val sortedArray = randomNumbers.sorted()
    println("Выигрышные числа: ${sortedArray[0]}, ${sortedArray[1]}, ${sortedArray[2]}")

}