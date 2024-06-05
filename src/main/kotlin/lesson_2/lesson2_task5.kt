package org.example.lesson_2

import kotlin.math.pow

const val PERCENT_PER_YEAR = 0.167

fun main() {

    val countOfMoney = 70_000
    val countOfYears = 20

    val countOfDeposit = countOfMoney * (1 + PERCENT_PER_YEAR).pow(countOfYears)
    println("Размер вклада через $countOfYears лет = ${ "%.3f".format(countOfDeposit) } руб.")

}