package data

interface Interaction{
    val name: String
    fun sayHello(name: String){
        println("Hello $name, My name is ${this.name}")
    }
}

interface Go: Interaction{
    fun go(){
        println("Go!")
    }
}

interface moveA{
    fun move() = println("Move A")
}

interface moveB{
    fun move() = println("Move B")
}

open class Contoh

//error
open class Contoh2

class Human(override val name: String): Contoh(), Go, moveA, moveB{
    override fun move() {
        super<moveA>.move()
        super<moveB>.move()
        print("Move Human")
    }
}