package oop_00000066420_ImanuelGilland.week01

fun main(args: Array<String>) {
    // Variable definition
    val radius = 7.0
    val pi = 3.14

    // Calculation
    val area = pi * radius * radius

    // Output menggunakan String Template
    println("Radius: $radius, Area: $area")

    // Panggil checkSize di dalam println
    println(checkSize(area))
}

// Expression Body Function
fun checkSize(area: Double) =
    if (area > 100) "This is a Big Circle"
    else "This is a Small Circle"