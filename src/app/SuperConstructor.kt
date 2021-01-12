package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Luthfi")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Sugara", 1000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}