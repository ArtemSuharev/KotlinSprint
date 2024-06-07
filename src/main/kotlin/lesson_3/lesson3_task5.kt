package org.example.lesson_3

fun main() {

    val postData = "D2-D4;0"

    val splitArray = postData.split("-",";")

    val currencyStep = splitArray[0]
    val nextStep = splitArray[1]
    val numberStep = splitArray[2]

    println("Откуда: $currencyStep")
    println("Куда: $nextStep")
    println("Номер хода: $numberStep")

}