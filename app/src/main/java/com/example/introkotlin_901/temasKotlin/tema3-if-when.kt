package com.example.introkotlin_901.temasKotlin


fun main(){
    val d:Int
    val e=true
    if(e){
        d=1
    }else{
        d=2
    }
    println(d)
    val numero=if(e) 1 else 2
    println(numero)
    //-------------------------
    print("Ingrese el sueldo del empleado")
    val sueldo= readln().toDouble()
    if(sueldo > 3000) {
     println("No debe pagar impuestos")

     // when
     val objeto:Any="Hola"
     when(objeto){
         "1"-> println("Es un uno")
         "Hola"-> println("Es un String")
         is String-> println("Es String")
         else-> println("No se que es")


    }

        //Range
        1..4 //1,2,3,4
        4 downTo 1 //4,3,2,1
        1 .. 10 step 2 //1,3,5,7,9
        'a' .. 'g' //a,b,c,d,e,f,g

    }
}