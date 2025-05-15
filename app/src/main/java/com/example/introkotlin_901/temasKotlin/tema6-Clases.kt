package com.example.introkotlin_901.temasKotlin

class usuarios(){
    val materia:String=""
}

class usuarios2(val id:Int, val nombre:String){
    val materia:String=""
    fun hola(){
        println("Hola")
    }

}

fun main(){
    val alumno = usuarios()
    val alumno2 = usuarios2(1, "Jaqueline")
    print(alumno2.id)
    print(alumno2.nombre)
    alumno2.hola()
}