package com.example.introkotlin_901.temasKotlin

fun main() {
    var opc: String

    do {
        println("Sistema de áreas")
        println("1. Círculo")
        println("2. Cuadrado")
        println("3. Pentágono")
        println("4. Triángulo")
        println("5. Salir")
        print("Elige una opción: ")
        val opc = readln().toString()

        when (opc) {
            "1" -> {
                println("Círculo")
                print("Ingresa el radio: ")
                val radio = readln().toDouble()
                val area = 3.1416 * radio * radio
                println("El área es: $area")
            }
            "2" -> {
                println("Cuadrado")
                print("Ingresa el lado: ")
                val lado = readln().toDouble()
                val area = lado * lado
                println("El área es: $area")
            }
            "3" -> {
                println("Pentágono")
                print("Ingresa el lado: ")
                val lado = readln().toDouble()
                val area = 1.72 * lado * lado
                println("El área es: $area")
            }
            "4" -> {
                println("Triángulo")
                print("Ingresa la base: ")
                val base = readln().toDouble()
                print("Ingresa la altura: ")
                val h = readln().toDouble()
                val area = base * h / 2
                println("El área es: $area")
            }
            "5" -> {
                println("Saliendo del programa.")
                break
            }
            else -> {
                println("Opción no válida.")
            }
        }



    } while (opc != "5")
}