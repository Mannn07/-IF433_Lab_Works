package oop_00000066420_ImanuellGilland.week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val levelSebelumnya = this.level
            xp += amount

            // Cek jika level naik
            if (this.level > levelSebelumnya) {
                println("Level Up! Selamat $username naik ke level ${this.level}")
            }
        }
    }
}