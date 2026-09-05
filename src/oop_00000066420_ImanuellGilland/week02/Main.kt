package oop_00000066420_ImanuellGilland.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        print("Masukkan NIM: ")
        val nim = scanner.nextLine()

        if (nim.length >= 5) {
            print("Masukkan nama: ")
            val name = scanner.nextLine()

            print("Masukkan jurusan: ")
            val major = scanner.nextLine()

            val student = Student(nim, name, major)

            println("\nData Mahasiswa")
            println("NIM: ${student.nim}")
            println("Nama: ${student.name}")
            println("Jurusan: ${student.major}")

            break
        }

        println("NIM tidak valid. Silakan masukkan kembali.\n")
    }
}