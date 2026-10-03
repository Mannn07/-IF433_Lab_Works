package oop_00000066420_ImanuelGilland.Week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }

    println("=== PENGUJIAN MATH HELPER ===")
    val mathHelper = MathHelper()
    println("Luas Persegi (sisi 5): ${mathHelper.hitungLuas(5)}")
    println("Luas Persegi Panjang (panjang 4, lebar 6): ${mathHelper.hitungLuas(4, 6)}")
    println("Luas Lingkaran (jari-jari 7.0): ${mathHelper.hitungLuas(7.0)}")
    println()
}