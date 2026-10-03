package oop_00000066420_ImanuelGilland.Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar Rp$amount berhasil. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName] Saldo tidak cukup untuk pembayaran sebesar Rp$amount (Saldo saat ini: Rp$balance)")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil top up sebesar Rp$amount. Total saldo: Rp$balance")
    }
}