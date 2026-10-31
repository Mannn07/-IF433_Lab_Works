package oop_00000066420_ImanuelGilland.week07

class NetworkClient private constructor(val baseUrl: String) {
    fun connect() {
        println("Connecting to $baseUrl")
    }
}