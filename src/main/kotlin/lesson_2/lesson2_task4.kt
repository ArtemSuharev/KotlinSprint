package org.example.lesson_2

import kotlin.math.roundToInt

fun main() {

    val buffPercentage = 20

    val countCrystalOre = 7
    val countIronOre = 11

    val buff : Double = buffPercentage.toDouble() / 100

    val buffCrystalOre : Int = (countCrystalOre * buff).roundToInt()
    val buffIronOre : Int = (countIronOre * buff).roundToInt()

    println("Количество бонусных кристаллических руд - $buffCrystalOre шт.")
    println("Количество бонусных железный руд - $buffIronOre шт.")

}