package com.example.introkotlin_901.temasKotlin

fun main() {
    var num: Int

    do {
        println("Ingresa un número (0 para salir):")
        num = readln().toInt()

        if (num < 0) {
            println("Por favor, ingresa un número positivo o 0 para salir.")
        } else if (num > 0) {
            var fila = 1
            do {
                var columna = 1
                do {
                    print("*")
                    columna++
                } while (columna <= fila)

                println()
                fila++
            } while (fila <= num)
        }

    } while (num != 0)

    println("Finalizando.")
}
