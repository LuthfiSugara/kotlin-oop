package app

import data.Rectangle

fun main() {
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}   ")
    println("Parent Corner ${rectangle.ParentCorner}")

    rectangle.printName()
}