package app

import data.User

fun main() {
    val user1 = User("Luthfi", "rahasia")
    val user2 = User("Sugara", "rahasia123")

    user1.username = "sugaraluthfi"
    user1.password = "sangatrahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}