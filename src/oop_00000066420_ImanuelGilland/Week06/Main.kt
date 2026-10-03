package oop_00000066420_ImanuelGilland.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("Memulai checkout...")
    method.pay(amount)
}

fun main() {
    processCheckout(Gopay(), 150000.0)
    processCheckout(CreditCard(), 250000.0)
}