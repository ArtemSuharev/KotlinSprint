package org.example.lesson_1

const val SECOND_IN_MINUTE = 60
const val SECOND_IN_HOUR = 3600

fun main() {

    val time = 6480

    val hours = time / SECOND_IN_HOUR
    val minutes = (time - hours * SECOND_IN_HOUR) / SECOND_IN_MINUTE
    val seconds = time - hours * SECOND_IN_HOUR - minutes * SECOND_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}