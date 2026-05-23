package com.example.idgs903temasbas.Ejemplo2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idgs903temasbas.R

class SaludoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_saludo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnSaludar = findViewById<AppCompatButton>(R.id.btn1)
        val edtNombre = findViewById<AppCompatEditText>(R.id.edit1)


        btnSaludar.setOnClickListener {
            val nombre = edtNombre.text.toString()
            if(nombre.isNotEmpty()){
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("EXTRA_NAME", nombre)
                startActivity(intent)
            }
        }
    }
}