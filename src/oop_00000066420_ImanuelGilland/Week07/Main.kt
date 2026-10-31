package oop_00000066420_ImanuelGilland.week07

class NetworkClient private constructor(val baseUrl: String) {

    companion object {
        fun create(url: String): NetworkClient {
            return NetworkClient(url)
        }
    }
}