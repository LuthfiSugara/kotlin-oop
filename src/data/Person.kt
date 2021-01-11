package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastname:String = ""

    fun sayHello(name: String){
        println("Hello $name, My Name is $firstName")
    }

    fun sayHello(firstNameParam: String, lastNameParam: String){
        println("Hello $firstNameParam $lastNameParam, My Name is $firstName")
    }

    fun run(){
        println("He is running away")
    }

    fun getFullName(): String{
        return "$firstName $middleName $lastname"
    }
}