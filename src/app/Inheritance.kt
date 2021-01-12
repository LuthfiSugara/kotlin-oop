package app

import data.Manager
import data.SuperManager
import data.VicePresident

fun main() {
    val manager = Manager("Luthfi")
    manager.sayHello("Sugara")

    val vicePresident = VicePresident("Admin")
    vicePresident.sayHello("Super Admin")

    val superManager = SuperManager("Manager")
    superManager.sayHello("Super Manager")
}