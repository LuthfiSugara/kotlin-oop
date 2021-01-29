package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Luthfi")
    println(teacher.name)
    teacher.test()
}