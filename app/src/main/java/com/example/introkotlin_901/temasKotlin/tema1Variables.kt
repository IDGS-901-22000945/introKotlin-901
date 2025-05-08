package com.example.introkotlin_901.temasKotlin

fun main(){
    println("Hola mundo!! :)")

    // val solo lectura, no cambia su valor
    // var si permite tener una variable mutable, que se pueda cambiar
    val nombre = "Jaqui"
    var apellido: String = "Nuñez"


    println(nombre + " " + apellido)

    // Este solo imprime el valor de las variables
    print("Hola $nombre $apellido")
    val num1 = 10
    println("la suma de $num1 + 2 es ${num1 + 2}")

    // Contracción de operaciones
    // num1 = num1*3
    //num1+=4
    println(num1)

    //var sueldo:float=12.25f
    val precio:Double=20.5
    val estadoCivil:Char='S'

}