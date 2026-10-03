package oop_00000066420_ImanuelGilland.Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Kartu Kredit sebesar Rp$amount berhasil. Limit terpakai: Rp$usedAmount / Rp$limit")
        } else {
            println("[$accountName] Transaksi ditolak! Pembayaran melebihi batas limit.")
        }
    }
}