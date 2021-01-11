package app

import data.Person

fun main() {
    val person = Person()
    person.firstName = "Luthfi"


    person.sayHello("Luthfi")
    person.sayHello("Luthfi", "Sugara")
}