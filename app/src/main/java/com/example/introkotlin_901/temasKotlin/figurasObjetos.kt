package com.example.introkotlin_901.temasKotlin

fun saludo() {
    println("Calculadora de Áreas de Figuras")
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun areaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun areaCirculo(radio: Double): Double {
    return 3.1416 * radio * radio
}

fun areaPentagono(lado: Double, apotema: Double): Double {
    return (5 * lado * apotema) / 2
}

fun main() {
    saludo()
    println("------------------------------------------------------------")

    println("Área del triángulo: ${areaTriangulo(10.0, 5.0)}")
    println("Área del rectángulo: ${areaRectangulo(8.0, 6.0)}")
    println("Área del círculo: ${areaCirculo(4.0)}")
    println("Área del pentágono: ${areaPentagono(6.0, 4.0)}")
}
