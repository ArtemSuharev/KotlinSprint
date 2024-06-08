package org.example.lesson_4

const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val MIN_BOX_COUNT = 50

fun main() {

    println("Наличие повреждений корпуса (да/нет):")
    val isDamage : Boolean = (readlnOrNull() == "да")

    println("Текущий состав экипажа (количество человек):")
    val crewCount : Int = readlnOrNull().toString().toInt()

    println("Количество ящиков с провизией на борту:")
    val boxCount : Int = readlnOrNull().toString().toInt()

    println("Благоприятность метеоусловий (да/нет):")
    val isWeather : Boolean = (readlnOrNull() == "да")

    val isShipFlight =
        (!isDamage && (crewCount in MIN_CREW_COUNT..MAX_CREW_COUNT) && boxCount > MIN_BOX_COUNT) ||
        (isDamage && isWeather && crewCount == MAX_CREW_COUNT && boxCount >= MIN_BOX_COUNT)

    if (isShipFlight) {
        println("Корабль может отправиться в плавание")
    } else {
        println("Корабль не может отправиться в плавание")
    }

}