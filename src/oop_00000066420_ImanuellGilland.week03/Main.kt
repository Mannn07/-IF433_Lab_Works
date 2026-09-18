package oop_00000066420_ImanuellGilland.week03

fun main() {
    // --- TUGAS 1: WEAPON ---
    val pedang = Weapon("Pedang Excalibur")
    pedang.damage = -50
    pedang.damage = 9999
    println("Tier: ${pedang.tier}")

    println("-----------------------")

    // --- TUGAS 2: PLAYER ---
    val player = Player("Zoro")

    // Coba akses player.xp
    // println(player.xp) // Akan menghasilkan ERROR merah di IntelliJ karena xp adalah private

    // Panggil addXp(50) -> masih level 1
    player.addXp(50)

    // Panggil addXp(60) -> total 110, harus Level Up ke 2
    player.addXp(60)
}