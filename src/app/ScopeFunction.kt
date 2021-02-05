package app

import data.Student

fun main() {
    val student = Student("Luthfi", 18)

    val result = student.let {
        println(it.name)
        println(it.age)
        "Name ${it.name}, Age ${it.age}"
    }

    println(result)

    val result2:String = student.run {
        println(this.name)
        println(this.age)
        "Name ${this.name}, Age ${this.age}"
    }

    println(result2)

    val result3:Student = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }

    println(result3)

    val result4: Student = student.also {
        println(it.name)
        println(it.age)
        "Name ${it.name}, Age ${it.age}"
    }

    println(result4)

    val result5 = with(student) {
        println(this.name)
        println(this.age)
        "Name ${this.name}, Age ${this.age}"
    }

    println(result5)
}