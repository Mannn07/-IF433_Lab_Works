package oop_00000066420_ImanuelGilland.Week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}