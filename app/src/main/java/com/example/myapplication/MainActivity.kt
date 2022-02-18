package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        with(binding){
            btnCalcular.setOnClickListener{
                var total = binding.txtTotal.text.toString().toDouble()
                var resultado:Double
                var respuesta = findViewById<TextView>(R.id.txResultado)
                resultado = total * 0.15 + total
                respuesta.setText(
                    "El total a pagar es de:"+resultado
                )



            }
        }
        setContentView(binding.root)
    }

}