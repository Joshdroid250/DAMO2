package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMain3Binding



class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var nota1 = binding.edtSistematico1.text.toString().toInt()
        var nota2 = binding.edtSistematico2.text.toString().toInt()
        var nota3 = binding.edtSistematico3.text.toString().toInt()

        binding.btnCalcu.setOnClickListener{
            var clase:Notas = Notas()
            clase.calculo(nota1, nota2, nota3)

        }

    }
}