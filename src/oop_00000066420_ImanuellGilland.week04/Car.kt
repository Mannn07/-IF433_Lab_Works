package oop_00000066420_ImanuellGilland.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}