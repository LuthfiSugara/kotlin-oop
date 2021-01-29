package app

import data.Game
import data.Login
import data.MinMax
import javax.security.auth.callback.Callback

fun minmax(value1: Int, value2: Int): MinMax{
    return when {
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean{
    return callback(login)
}

fun main() {
    val game = Game("Game Kotlin", 200_000)
//    val name = game.name
//    val price = game.price
    val (name, price) = game

    println(name)
    println(price)

//    val result = MinMax(10, 100)
//    val min = result.min
//    val max = result.max

    val (min, max) = minmax(10, 100)
    println(min)
    println(max)

    val login = Login("Luthfi", "rahasia")
//    login(login){login ->
//        login.username == "Luthfi" && login.password == "rahasia"
//    }

    login(login){(username, password) ->
        username == "Luthfi" && password == "rahasia"
    }
}
