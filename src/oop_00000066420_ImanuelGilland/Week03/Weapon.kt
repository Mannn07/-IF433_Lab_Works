package oop_00000066420_ImanuelGilland.Week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif!")
                // Nilai field tidak diubah
            } else if (value > 1000) {
                field = 1000 // Paksa nilai menjadi 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}