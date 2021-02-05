package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee: Employee = Employee("Luthfi")
    employee.sayHello("Sugara")

    employee = Manager("Luthfi")
    employee.sayHello("Sugara")

    employee = VicePresident("Luthfi")
    employee.sayHello("Sugara")
}