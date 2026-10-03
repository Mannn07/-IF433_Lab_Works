package oop_00000066420_ImanuelGilland.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol $name diklik.")
    }
}