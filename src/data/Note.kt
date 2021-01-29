package data

class Note(title: String) {
    var title: String = title
        get() {
            println("Call Getter FUnction")
            return field
        }
        set(value) {
            println("Call Setter Function")
            if (value.isNotBlank()){
                field = value
            }else{
                println("Invalid Title")
            }
        }
}

class BigNote(val title: String){
    var bigTitle : String = title
        get() = title.toUpperCase()
}