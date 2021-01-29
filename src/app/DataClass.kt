package app

import data.Product

fun main() {
    val product = Product("Indomie", 2500, "food")
    val product2 = product.copy(price = 1000)

    println(product)
    println(product2)
}