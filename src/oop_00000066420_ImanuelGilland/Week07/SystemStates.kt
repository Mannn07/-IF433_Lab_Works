package oop_00000066420_ImanuelGilland.week07

enum class AppState {
    IDLE,
    LOADING,
    SUCCESS,
    ERROR
}
sealed class ApiResponse {
    abstract val uiMessage: String

    object Loading : ApiResponse() {
        override val uiMessage = "Sedang memuat data..."
    }

    data class Success(val data: String) : ApiResponse() {
        override val uiMessage = "Data berhasil dimuat: $data"
    }

    data class Error(val message: String) : ApiResponse() {
        override val uiMessage = "Terjadi kesalahan: $message"
    }
}