package oop_00000066420_ImanuelGilland.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Menampilkan waktu.")
    }

    override fun connectToBluetooth() {
        println("Menghubungkan ke Bluetooth.")
    }

    override fun chargeBattery() {
        println("Mengisi daya baterai.")
    }
}