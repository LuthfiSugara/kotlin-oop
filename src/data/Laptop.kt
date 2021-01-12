package data

class Laptop(name: String)

open class Handphone(val name: String)

class SmartPhone(name: String, val os: String): Handphone(name)