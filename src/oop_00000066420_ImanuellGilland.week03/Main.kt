package oop_00000066420_ImanuellGilland.week03

fun main() {
    // --- TUGAS 1: WEAPON ---
    val pedang = Weapon("Pedang Excalibur")

    // Coba set damage ke -50 (harus gagal/print peringatan)
    pedang.damage = -50

    // Coba set ke 9999 (harus dipaksa jadi 1000)
    pedang.damage = 9999

    // Print Tier-nya
    println("Tier: ${pedang.tier}")
}