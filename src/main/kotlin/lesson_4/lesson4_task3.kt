package org.example.lesson_4

const val GOOD_TERMS_DAY = "солнечная"
const val GOOD_TERMS_TENT = "открыт"
const val GOOD_TERMS_HUMIDITY = 20
const val GOOD_TERMS_SEASON = "зима"

fun main() {

    val isSunnyDay = "солнечная"
    val isOpenedTent = "открыт"
    val humidity = 20
    val season = "зима"

    val condition = (isSunnyDay == GOOD_TERMS_DAY) && (isOpenedTent == GOOD_TERMS_TENT) && (humidity == GOOD_TERMS_HUMIDITY) && (season != GOOD_TERMS_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $condition")

}