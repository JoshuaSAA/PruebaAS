package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.ObjectInputStream.GetField

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var botonSig = findViewById<Button>(R.id.buttonSig)
        var namesField = findViewById<EditText>(R.id.nameField)
        var passwordFiel = findViewById<EditText>(R.id.passField)


        botonSig.setOnClickListener {
            var name = namesField.text.toString()
            var password = passwordFiel.text.toString()
           if (password == "Holiwis" && name == "Pepe"){
            val intent = Intent(this, MainActivity2::class.java)
               intent.putExtra("usuario", name)
            startActivity(intent)
        }

      }

    }

}

