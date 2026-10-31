package oop_00000066420_ImanuelGilland.week07

fun main() {

    // 1. Menjalankan GameManager
    GameManager.startGame()
    GameManager.startGame()

    println("\n========== ITEM RARITY ==========")

    // 2. Menampilkan drop chance Legendary
    println(
        "Legendary Drop Chance: ${ItemRarity.LEGENDARY.dropChance}%"
    )

    println("\n========== WEAPON FACTORY ==========")

    // 3. Membuat starter weapon
    val starterWeapon = Weapon.forgeStarterSword()

    println("Nama Senjata: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    println("\n========== DATA CLASS COPY ==========")

    // 4. Membuat GameItem baru
    val originalItem = starterWeapon.item

    // 5. Menggunakan copy untuk meningkatkan damage
    val upgradedItem = originalItem.copy(damage = 25)

    println("Item Original: $originalItem")
    println("Item Upgrade: $upgradedItem")

    println("\n========== BATTLE EVENTS ==========")

    // 6. Memproses berbagai BattleState
    processEvent(BattleState.SafeZone)

    processEvent(
        BattleState.MonsterEncounter("Goblin Nakal")
    )

    processEvent(
        BattleState.LootDropped(upgradedItem)
    )

    processEvent(
        BattleState.GameOver("Terkena jebakan racun")
    )
}