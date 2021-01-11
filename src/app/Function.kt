package app

import data.Person

fun main() {
    val person = Person()
    person.firstName = "Luthfi"
    person.middleName = "Sugara"
    person.lastname = "Bla bla bla"

    person.sayHello("Luthfi 123")
}