package oop_00000066420_ImanuelGilland.Week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    // Checkpoint 3: Overriding honk
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    // Checkpoint 4: Menggunakan keyword super pada accelerate
    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}