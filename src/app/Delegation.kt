package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Luthfi")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Sugara")
    baseDelegate.sayGoodBye("Programmer")
}