package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {

    val timeDepartureFromAPI = "9:39"

    val timeDeparture = convertTimeFormatToMinute(timeDepartureFromAPI)
    val timeTravel = 457
    val timeArrived = convertMinuteToTimeFormat(timeDeparture + timeTravel)

    println("Время прибытия поезда: $timeArrived")

}

fun convertTimeFormatToMinute(value: String) : Int {

    val array = value.split(":")
    val hour : Int = array[0].toInt()
    val minute : Int = array[1].toInt()

    return hour * MINUTES_IN_HOUR + minute

}

fun convertMinuteToTimeFormat(value: Int) : String {

    val hours = value / MINUTES_IN_HOUR
    val minutes = value % MINUTES_IN_HOUR

    return "%02d:%02d".format(hours, minutes)

}