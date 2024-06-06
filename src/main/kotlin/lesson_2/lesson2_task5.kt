package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val percentagePerYear : Double = 16.7

    val countOfMoney = 70_000
    val countOfYears = 20
    val percentageValue : Double = percentagePerYear / 100

    val countOfDeposit = countOfMoney * (1 + percentageValue).pow(countOfYears)
    println("Размер вклада через $countOfYears лет = ${ "%.3f".format(countOfDeposit) } руб.")

}