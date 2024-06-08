package org.example.lesson_4

const val COUNT_OF_TABLE = 13

fun main() {

    val emptyTableToday = 0
    val emptyTableTomorrow = 4

    val orderedTableToday = COUNT_OF_TABLE - emptyTableToday
    val orderedTableTomorrow = COUNT_OF_TABLE - emptyTableTomorrow

    println(
        "[Доступность столиков на сегодня: ${orderedTableToday != COUNT_OF_TABLE}]" + "\n" +
        "[Доступность столиков на завтра: ${orderedTableTomorrow != COUNT_OF_TABLE}]"
    )

}