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
}