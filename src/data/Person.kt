package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastname:String = ""

    fun sayHello(name: String){
        println("Hello $name, My Name is firstName")
    }

    fun sayHello(firstName: String, lastName: String){
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }

    fun run(){
        println("He is running away")
    }

    fun getFullName(): String{
        return "$firstName $middleName $lastname"
    }
}