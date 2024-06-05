package org.example.lesson_1

fun main() {

    val time = 6480

    val hours = time / 3600
    val minutes = (time - hours * 3600) / 60
    val seconds = time - hours * 3600 - minutes * 60

    val hoursText = convertToText(hours)
    val minutesText = convertToText(minutes)
    val secondsText = convertToText(seconds)

    println("$hoursText:$minutesText:$secondsText")

}

fun convertToText(value: Int) : String {

    return if (value < 10) {
        "0$value"
    } else {
        "$value"
    }

}