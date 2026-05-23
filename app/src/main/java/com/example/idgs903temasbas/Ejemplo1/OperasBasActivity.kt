package com.example.idgs903temasbas.Ejemplo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idgs903temasbas.R

class OperasBasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var edtNumero1: EditText
        lateinit var edtNumero2: EditText
        lateinit var rdSumar: RadioButton
        lateinit var rdRestar: RadioButton
        lateinit var rdMultiplicar: RadioButton
        lateinit var rdDivdir: RadioButton
        lateinit var btnCalcular: Button
        lateinit var txtResultado: TextView

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operas_bas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edtNumero1 = findViewById(R.id.edit1)
        edtNumero2 = findViewById(R.id.edit2)
        rdSumar = findViewById(R.id.rbSumar)
        rdRestar = findViewById(R.id.rbRestar)
        rdMultiplicar = findViewById(R.id.rbMultiplicar)
        rdDivdir = findViewById(R.id.rbDividir)
        btnCalcular = findViewById(R.id.btnCalcular)
        txtResultado = findViewById(R.id.txtResultado)

        btnCalcular.setOnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            if (rdSumar.isChecked) {
                txtResultado.text = "Resultado: " + sumar(num1, num2)
            } else if (rdRestar.isChecked) {
                txtResultado.text = "Resultado: " + restar(num1, num2)
            } else if (rdMultiplicar.isChecked) {
                txtResultado.text = "Resultado: " + multiplicar(num1, num2)
            } else if (rdDivdir.isChecked) {
                txtResultado.text = "Resultado: " + dividir(num1, num2)
            }
        }

    }

    fun sumar(numero1: Int, numero2: Int): Int {
        return numero1 + numero2
    }

    fun restar(numero1: Int, numero2: Int): Int {
        return  numero1 - numero2
    }

    fun multiplicar(numero1: Int, numero2: Int): Int {
        return  numero1 * numero2
    }

    fun dividir(numero1: Int, numero2: Int): Float {
        return numero1.toFloat() / numero2.toFloat()
    }
}