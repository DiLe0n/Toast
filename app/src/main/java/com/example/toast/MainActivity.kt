package com.example.toast

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageButton = findViewById<ImageButton>(R.id.imageButton)

        imageButton.setOnClickListener {
            // Mostrar un Toast
            Toast.makeText(this, "Botón presionado", Toast.LENGTH_SHORT).show()

            // Lanzar SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
