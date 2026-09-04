package oop_00000066420_ImanuelGilland.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - (price * discount / 100)

    val userNote: String? = null

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) 20 else 10

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    println("Judul: $title")
    println("Harga Akhir: Rp$finalPrice")
    println("Catatan: ${userNote ?: "Tidak ada catatan"}")
}