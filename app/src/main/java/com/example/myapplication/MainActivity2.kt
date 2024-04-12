package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val tv_bienvenida = findViewById<TextView>(R.id.tv_Bienvenido)
        val nombreUsuario = intent.getStringExtra("usuario")
        tv_bienvenida.append(" " + nombreUsuario)
    }
}