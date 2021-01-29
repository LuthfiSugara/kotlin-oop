package app

import data.Boss

fun main() {
    val person = Boss("Person")

    val luthfi = person.Employee("Luthfi")
    luthfi.hi()

    val sugara = person.Employee("Sugara")
    sugara.hi()
}