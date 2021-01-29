package app

import data.City
import data.Country
import data.Location

fun main() {
//    Error
//    val location = Location("Medan")

    val city = City("Jakarta")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}