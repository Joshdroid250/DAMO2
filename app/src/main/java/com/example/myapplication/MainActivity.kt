package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView

import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
            binding.btnCalcular.setOnClickListener{
                var total = binding.txtTotal.text.toString().toDouble()
                var resultado:Double
                var respuesta = findViewById<TextView>(R.id.txResultado)
                resultado = total * 0.15 + total
                respuesta.setText(
                    "El total a pagar es de:"+resultado
                )
            }
        binding.btnSiguiente.setOnClickListener{
            val intent:Intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}