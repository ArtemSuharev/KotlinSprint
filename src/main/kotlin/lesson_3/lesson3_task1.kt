package org.example.lesson_3

fun main() {

    val textForAfternoon = "Добрый день"
    val textForEvening = "Добрый вечер"

    val userName = "Иван"

    var textGreeting = ""

    textGreeting = "$textForAfternoon, $userName"
    println(textGreeting)

    textGreeting = "$textForEvening, $userName"
    println(textGreeting)

}