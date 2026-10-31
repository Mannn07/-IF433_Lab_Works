package oop_00000066420_ImanuelGilland.week07

fun main() {
    println("Legendary Drop Chance: ${ItemRarity.LEGENDARY.dropChance}%")

    val weapon = Weapon.forgeStarterSword()

    println("Nama Senjata: ${weapon.item.name}")
    println("Damage: ${weapon.item.damage}")
    println("Rarity: ${weapon.item.rarity}")
    println("Durability: ${weapon.durability}")
}