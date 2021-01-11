package app

import data.Person

fun main() {
    val person1 = Person()
    person1.firstName = "Person 1"

    val person2 = Person()
    person2.firstName = "Person 2"

    val person3 = Person()
    person3.firstName = "Person 3"

    println(person1.firstName)
    println(person2.firstName)
    println(person3.firstName)
}