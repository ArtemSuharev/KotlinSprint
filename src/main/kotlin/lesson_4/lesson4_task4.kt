package org.example.lesson_4

fun main() {

    val numberDay = 2
    val isEvenDay = (numberDay % 2 == 0)

    println("""
        Упражнения для рук: ${!isEvenDay}
        Упражнения для ног: $isEvenDay
        Упражнения для спины: $isEvenDay
        Упражнения для пресса: ${!isEvenDay}
    """.trimIndent())

}