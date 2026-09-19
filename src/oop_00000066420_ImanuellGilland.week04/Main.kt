package oop_00000066420_ImanuellGilland.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val tesla = ElectricCar(brand = "Tesla Model 3", numberOfDoors = 4, batteryCapacity = 85)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

    println("\n--- Testing Karyawan ---")
    val manager = Manager(name = "Andi", baseSalary = 10000000)
    val developer = Developer(name = "Budi", baseSalary = 8000000, programmingLanguage = "Kotlin")

    manager.work()
    println("Bonus Manager ${manager.name}: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer ${developer.name}: Rp ${developer.calculateBonus()}")
}