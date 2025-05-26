package com.example.introkotlin_901.diccionario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.TextView
import android.widget.RadioGroup
import android.widget.Toast
import android.content.Context
import com.example.introkotlin_901.R




class BuscarPalabraActivity : AppCompatActivity() {

    private val archivo = "diccionario.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar_palabra)

        val txtBuscar = findViewById<EditText>(R.id.txtBuscar)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val lblResultado = findViewById<TextView>(R.id.lblResultado)
        val btnBuscar = findViewById<Button>(R.id.btnBuscar)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        btnBuscar.setOnClickListener {
            val palabra = txtBuscar.text.toString().trim()
            if (palabra.isEmpty()) {
                Toast.makeText(this, "Ingresa una palabra", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val lista = openFileInput(archivo).bufferedReader().readLines()
            var resultado = "Palabra no encontrada"

            for (linea in lista) {
                val partes = linea.split("=")
                if (partes.size == 2) {
                    val ingles = partes[0]
                    val espanol = partes[1]

                    if (palabra.equals(ingles, ignoreCase = true)) {
                        resultado = espanol
                        break
                    } else if (palabra.equals(espanol, ignoreCase = true)) {
                        resultado = ingles
                        break
                    }
                }
            }

            lblResultado.text = resultado
        }


        btnRegresar.setOnClickListener {
            finish()
        }
    }
}