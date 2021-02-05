package app

import exception.ValidationException

fun validateAndSayHello(name: String){
    if (name.isBlank()){
        throw ValidationException("Name is Blank")
    }else{
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Luthfi")
        validateAndSayHello("")
    }catch (error: ValidationException){
        println("Terjadi Error ${error.message}")
    }catch (error: Throwable){
        println("Terjadi Error ${error.message}")
    }finally {
        print("Program Selesai")
    }
}