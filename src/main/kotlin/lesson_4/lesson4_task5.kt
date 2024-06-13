package org.example.lesson_4

const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val MIN_BOX_COUNT = 50

const val YES = "да"

fun main() {

    println("Наличие повреждений корпуса (да/нет):")
    val isDamage: Boolean = (readln().lowercase() == YES)

    println("Текущий состав экипажа (количество человек):")
    val crewCount: Int = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    val boxCount: Int = readln().toInt()

    println("Благоприятность метеоусловий (да/нет):")
    val isGoodWeather: Boolean = (readln().lowercase() == YES)

    val isShipSail =
        (!isDamage && (crewCount in MIN_CREW_COUNT..MAX_CREW_COUNT) && boxCount > MIN_BOX_COUNT) ||
                (isGoodWeather && crewCount == MAX_CREW_COUNT && boxCount >= MIN_BOX_COUNT)

    if (isShipSail) {
        println("Корабль может отправиться в плавание")
    } else {
        println("Корабль не может отправиться в плавание")
    }

}