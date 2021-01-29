package app

import com.sun.tools.javah.Gen
import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allGenders)

    man.showDescription()
    woman.showDescription()
}