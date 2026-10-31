package oop_00000066420_ImanuelGilland.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {

        // ID dan nama wajib tersedia
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        // Mengambil tipe produk
        val type = rawJson["type"] as? String

        return when (type) {

            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12

                Electronic(
                    id = id,
                    name = name,
                    warrantyMonths = warranty
                )
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"

                Clothing(
                    id = id,
                    name = name,
                    size = size
                )
            }

            else -> null
        }
    }
    fun checkout(product: Product) {

        // Mengambil ID berdasarkan jenis produk
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // Memanggil Java Payment Service
        val transactionId = JavaPaymentService.processPayment(id)

        // Menggunakan !! sesuai instruksi modul
        println("Transaction ID: ${transactionId!!}")
    }
}