package oop_00000066420_ImanuelGilland.week07

fun main() {
    val user1 = User("Imanuel", 21)

    val user2 = user1.copy(age = 22)

    println("User pertama: $user1")
    println("User hasil copy: $user2")

    val (name, age) = user2

    println("Nama: $name")
    println("Umur: $age")
}