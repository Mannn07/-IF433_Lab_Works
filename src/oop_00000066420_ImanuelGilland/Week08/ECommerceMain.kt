package oop_00000066420_ImanuelGilland.week08

fun main() {

    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf(
            "id" to "E01",
            "name" to "Laptop",
            "type" to "ELECTRONIC",
            "warranty" to 24
        ),
        mapOf(
            "id" to "C01",
            "name" to "T-Shirt",
            "type" to "CLOTHING",
            "size" to "XL"
        ),
        mapOf(
            "id" to "E02",
            "name" to "Mouse",
            "type" to "ELECTRONIC",
            "warranty" to "Not An Integer"
        ),
        mapOf(
            "name" to "Ghost Item",
            "type" to "CLOTHING"
        ),
        mapOf(
            "id" to "X01",
            "name" to "Unknown",
            "type" to "FOOD"
        )
    )

    val parser = ApiParser()

    println("========== E-COMMERCE API PARSER ==========")

    for (raw in rawApiData) {

        try {
            val product = parser.parseProduct(raw)

            product?.let {
                when (it) {
                    is Electronic -> {
                        println("\nProduk Elektronik: ${it.name}")
                        println("ID: ${it.id}")
                        println("Warranty: ${it.warrantyMonths} bulan")
                    }

                    is Clothing -> {
                        println("\nProduk Pakaian: ${it.name}")
                        println("ID: ${it.id}")
                        println("Size: ${it.size}")
                    }
                }

                // Proses pembayaran
                parser.checkout(it)
            } ?: println("\nProduk dilewati: Tipe tidak dikenal.")

        } catch (e: IllegalArgumentException) {
            println("\nPERINGATAN DATA KORUP: ${e.message}")
        }
    }
}