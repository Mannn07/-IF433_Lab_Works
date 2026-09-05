package oop_00000066420_ImanuellGilland.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(name, baseDamage = baseDamage)

    var enemyHp = 100

    println("\n=== MINI RPG BATTLE ===")
    println("Hero: ${hero.name}")
    println("HP Hero: ${hero.hp}")
    println("Base Damage: ${hero.baseDamage}")
    println("HP Enemy: $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {
        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")

            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()

                println("Enemy membalas!")
                hero.takeDamage(enemyDamage)

                println("Damage yang diterima: $enemyDamage")
                println("HP Hero: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} memilih untuk kabur!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} menang!")
    } else if (!hero.isAlive()) {
        println("${hero.name} kalah!")
    } else {
        println("${hero.name} kabur dari pertarungan.")
    }
}