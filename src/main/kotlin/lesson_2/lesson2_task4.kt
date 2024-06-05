package org.example.lesson_2

import kotlin.math.roundToInt

const val BUFF = 0.2

fun main() {

    val countCrystalOre = 7
    val countIronOre = 11

    val buffCrystalOre : Int = (countCrystalOre * BUFF).roundToInt()
    val buffIronOre : Int = (countIronOre * BUFF).roundToInt()

    println("Количество бонусных кристаллических руд - $buffCrystalOre шт.")
    println("Количество бонусных железный руд - $buffIronOre шт.")

}