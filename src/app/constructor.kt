package app

import data.Car

fun main() {
    val avanza = Car("Toyota")
    val almaz = Car("Wuling", "Almaz")

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}