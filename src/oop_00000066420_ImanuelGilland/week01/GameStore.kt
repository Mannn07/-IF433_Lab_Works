package oop_00000066420_ImanuelGilland.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - (price * discount / 100)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) 20 else 10

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul: $title")
    println("Harga Akhir: Rp$finalPrice")
}