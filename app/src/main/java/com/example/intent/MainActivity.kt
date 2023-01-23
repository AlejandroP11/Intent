package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton : Button = findViewById(R.id.button)
        boton.setOnClickListener{

            // crear un intent para llamar a la second activity
            val intent = Intent(this, SecondActivity::class.java)

            // añade datos adicionales al intent
            intent.putExtra("clientes", 3)
            intent.putExtra("proveedores", 2)

            // iniciamos la actividad
            startActivity(intent)
        }
    }
}