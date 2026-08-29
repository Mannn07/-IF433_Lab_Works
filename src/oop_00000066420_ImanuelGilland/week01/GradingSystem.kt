package oop_00000066420_ImanuelGilland.week01

/// Function di luar main()
fun calculateStatus(score: Int) =
    if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {

    val name = "John Thor"
    val score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")

    // Panggil function
    println("Status: ${calculateStatus(score)}")

    // LANGKAH 5: Null Safety
    val studentId: String? = null

    // Jika null, gunakan nilai default 0
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}