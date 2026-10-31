package oop_00000066420_ImanuelGilland.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected"
        println("Database berhasil terhubung!")
    }

    fun disconnect() {
        connectionStatus = "Disconnected"
        println("Database berhasil diputus!")
    }
}