package oop_00000066420_ImanuelGilland.week07

fun main() {
    val response: ApiResponse = ApiResponse.Loading

    when (response) {
        is ApiResponse.Success -> println(response.uiMessage)
        is ApiResponse.Error -> println(response.uiMessage)
    }
}