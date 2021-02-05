package program

import annotations.Fancy
import javax.sound.sampled.Line

@Fancy(author = "Luthfi")
class MyApplication(val name: String, val version: Int){
    fun info(): String = "Application $name-$version"
}