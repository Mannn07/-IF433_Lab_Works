package oop_00000066420_ImanuelGilland.week07

fun main() {
    DatabaseManager.connect()

    val client = NetworkClient.create("https://api.umn.ac.id")
    println("Base URL: ${client.baseUrl}")

    DatabaseManager.disconnect()
}