package data

import kotlin.properties.Delegates

class Account(description: String = "") {
    val name: String by lazy {
        println("namrd is Called")
        "Luthfi"
    }

    var description: String by Delegates.observable(description){
        property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }
}