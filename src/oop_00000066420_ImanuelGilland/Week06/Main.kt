package oop_00000066420_ImanuelGilland.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("Memulai checkout...")
    method.pay(amount)
}

fun main() {
    processCheckout(Gopay(), 150000.0)
    processCheckout(CreditCard(), 250000.0)

    val lamp = SmartLamp("LAMP-01", "Ruang Tamu")
    val speaker = SmartSpeaker("SPK-01", "Google Nest Dapur")
    val cctv = SmartCCTV("CCTV-01", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)
}