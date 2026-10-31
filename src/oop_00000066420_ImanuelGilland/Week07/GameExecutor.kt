package oop_00000066420_ImanuelGilland.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
            println("Bersiap untuk bertarung!")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item

            println("Loot ditemukan!")
            println("Nama item: $name")
            println("Damage: $damage")
            println("Rarity: $rarity")
        }

        is BattleState.GameOver -> {
            println("Game Over!")
            println("Alasan: ${event.reason}")
        }

        is BattleState.SafeZone -> {
            println("Kamu berada di Safe Zone.")
            println("Tidak ada monster di sekitar.")
        }
    }
}