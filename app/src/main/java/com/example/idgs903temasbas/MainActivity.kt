package com.example.idgs903temasbas

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idgs903temasbas.Ejemplo1.OperasBasActivity
import com.example.idgs903temasbas.Ejemplo2.SaludoActivity
import com.example.idgs903temasbas.Ejemplo3.Ejemplo3Activity
import com.example.idgs903temasbas.Ejemplo4.EjemploTxtActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnOperasBas = findViewById<Button>(R.id.btn1)
        val btnSaludo = findViewById<Button>(R.id.btn2)
        val btnNumero = findViewById<Button>(R.id.btn3)
        val btnTxt = findViewById<Button>(R.id.btn4)

        btnOperasBas.setOnClickListener { navigateToOperasBas() }
        btnSaludo.setOnClickListener { navigateToSaludo() }
        btnNumero.setOnClickListener { navigateToNumero() }
        btnTxt.setOnClickListener { navigateToTxt() }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun navigateToOperasBas() {
        val intent = Intent(this, OperasBasActivity::class.java)
        startActivity(intent)
    }

    fun navigateToSaludo(){
        val intent = Intent(this, SaludoActivity::class.java)
        startActivity(intent)
    }

    fun navigateToNumero(){
        val intent = Intent(this, Ejemplo3Activity::class.java)
        startActivity(intent)
    }

    fun navigateToTxt(){
        val intent = Intent(this, EjemploTxtActivity::class.java)
        startActivity(intent)
    }
}