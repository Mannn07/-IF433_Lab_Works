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

    println("=== SISTEM PEMBAYARAN ===")
    val eWallet = EWallet(accountName = "Dompet John", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Kartu John", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (pembayaran in daftarPembayaran) {
        // Pemanggilan pertama (EWallet akan gagal karena saldo kurang, CreditCard berhasil)
        pembayaran.processPayment(75000.0)

        // Smart Casting Challenge: Deteksi jika EWallet, top up 50000.0, lalu coba bayar lagi
        if (pembayaran is EWallet) {
            println("=> Saldo tidak cukup. Terdeteksi EWallet, melakukan top up otomatis...")
            pembayaran.topUp(50000.0)
            pembayaran.processPayment(75000.0)
        }
        println("----------------------------------------")
    }
}