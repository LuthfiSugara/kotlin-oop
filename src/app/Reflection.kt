package app

import annotations.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import javax.xml.bind.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.findParameterByName
import kotlin.reflect.full.memberProperties

fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

//    itterate satu satu, lalu cek kalo ada annotaion @NotBlank
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when(value){
                is String -> {
                    if ("" == value){
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }

//    if (request.id == ""){
//        throw ValidationException("id is blank")
//    }else if(request.name == ""){
//        throw ValidationException("name is blank")
//    }
}

//fun validateRequest(request: CreateCategoryRequest){
//    if (request.id == ""){
//        throw ValidationException("id is blank")
//    }else if(request.name == ""){
//        throw ValidationException("name is blank")
//    }
//}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validateRequest(request)

    val request2 = CreateCategoryRequest("F", "Food")
    validateRequest(request2)
}