package com.example.myapplication

import android.widget.Toast
class Notas() {

    fun calculo(nota1: Int, nota2: Int, nota3: Int){
       var resultado = (nota1 + nota2) + nota3

        if(resultado > 85){
            Toast.makeText(@MainActivity2, "Aprobado :D", Toast.LENGTH_SHORT).show()
        }
        else if(resultado < 85){
            Toast.makeText(MainActivity2, "reprobaste :c", Toast.LENGTH_SHORT).show()
        }
    }
}