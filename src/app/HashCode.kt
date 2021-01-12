package app

import data.Company

fun main() {
    val company1 = Company("Luthfi ")
    val company2 = Company("Luthfi ")

    println(company1.hashCode() == company2.hashCode())

}