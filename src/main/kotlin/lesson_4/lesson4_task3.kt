package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val GOOD_TERMS_HUMIDITY = 20
const val GOOD_TERMS_SEASON = "зима"

fun main() {

    val isSunnyDay = true
    val isOpenedTent = true
    val humidity = 20
    val season = "зима"

    val condition = (isSunnyDay == IS_SUNNY) && (isOpenedTent == IS_AWNING_OPEN) && (humidity == GOOD_TERMS_HUMIDITY) && (season != GOOD_TERMS_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $condition")

}