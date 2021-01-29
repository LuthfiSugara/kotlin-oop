package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Ubah"
    println(Utilities.toUpper("Luthfi"))
    a()
    b()

    println(Application.Companion.toUpper("Sugara"))
    println(Application.toUpper("Sugara"))
}

fun a(){
    println(Utilities.name)
}

fun b(){
    println(Utilities.name)
}