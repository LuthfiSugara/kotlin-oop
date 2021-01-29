package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Luthfi", 20)
    student.sayHello("")
    println(student?.upperName)
}