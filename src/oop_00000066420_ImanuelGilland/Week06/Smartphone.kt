package oop_00000066420_ImanuelGilland.week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
    }
}