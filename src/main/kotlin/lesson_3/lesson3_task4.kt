package org.example.lesson_3

fun main() {

    var numberOfStep = 1
    var currencyPlace = "E2"
    var nextPlace = "E4"

    var postData = "[$currencyPlace-$nextPlace;$numberOfStep]"
    println(postData)

    numberOfStep += 1
    currencyPlace = "D2"
    nextPlace = "D3"

    postData = "[$currencyPlace-$nextPlace;$numberOfStep]"
    println(postData)

}