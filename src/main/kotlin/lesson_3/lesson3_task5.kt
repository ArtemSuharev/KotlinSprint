package org.example.lesson_3

fun main() {

    val postData = "D2-D4;0"

    val currencyStep = "${postData[0]}${postData[1]}"
    val nextStep = "${postData[3]}${postData[4]}"
    val numberStep : Int = postData.split(";")[1].toInt()

    println("Откуда: $currencyStep")
    println("Куда: $nextStep")
    println("Номер хода: $numberStep")

}