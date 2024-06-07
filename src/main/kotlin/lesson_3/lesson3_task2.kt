package org.example.lesson_3

fun main() {

    var wifeSurname = "Андреева"
    val wifeName = "Татьяна"
    val wifePatronymic = "Сергеевна"

    val ageBeforeMarriage = 20
    val ageAfterMarriage = 22

    println("[$wifeSurname $wifeName $wifePatronymic, $ageBeforeMarriage]")

    wifeSurname = "Сидорова"

    println("[$wifeSurname $wifeName $wifePatronymic, $ageAfterMarriage]")

}