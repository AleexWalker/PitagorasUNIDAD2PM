package com.example.pitagorasunidad2pm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (editTextNumber.text.isEmpty() || editTextNumber2.text.isEmpty())
                Toast.makeText(this, "¡Introduce los valores requeridos!", Toast.LENGTH_SHORT).show()
            else {
                val primerCateto = editTextNumber.text.toString().toInt()
                val segundoCateto = editTextNumber2.text.toString().toInt()
                var resultado = Math.sqrt((primerCateto*primerCateto + segundoCateto*segundoCateto).toDouble())

                textView3.text = "La HIPOTENUSA es equivalente a: " + resultado
            }
        }
    }
}