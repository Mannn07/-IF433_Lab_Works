package oop_00000066420_ImanuelGilland.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")

    val emptyOrder = Order(null, null)

    // Rantai Safe Calls
    val destination = emptyOrder.deliveryDetails
        ?.address
        ?.city
        ?.name ?: "Kota Tidak Diketahui"

    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")

    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        // Blok hanya dijalankan jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)

    println("\n=== TEST SAFE CASTING ===")

    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String

        // Hanya cetak jika casting berhasil
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100

// Casting gagal karena 100 merupakan Integer
    val safeString = someObject as? String ?: "Unknown String"

    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST THE RED BUTTON (!!) ===")

    val toxicData: String? = null

    try {
        // Berbahaya: memaksa nilai nullable dianggap non-null
        val length = toxicData!!.length
        println("Length: $length")
    } catch (e: NullPointerException) {
        println("CRASH (NPE)! Jangan gunakan !! secara sembarangan.")
    }
}