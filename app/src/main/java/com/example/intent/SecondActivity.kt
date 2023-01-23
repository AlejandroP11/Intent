package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // recoge el intent que ha enviado la actividad
        val intent = getIntent()

        // recoge el valor de tipo int pasado en el Intent
        val value = intent.getIntExtra("proveedores", 0)

        val nroClientes = findViewById<TextView>(R.id.textView2)

        nroClientes.text = value.toString()
    }
}