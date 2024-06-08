package org.example.lesson_4

fun main() {

    val numberDay = 5

    println("""
        Упражнения для рук: ${numberDay % 2 == 1}
        Упражнения для ног: ${numberDay % 2 == 0}
        Упражнения для спины: ${numberDay % 2 == 0}
        Упражнения для пресса: ${numberDay % 2 == 1}
    """.trimIndent())

}