package com.example.introkotlin_901.diccionario


import com.example.introkotlin_901.R
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



class AgregarPalabraActivity : AppCompatActivity() {

    private val archivo = "diccionario.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capturarpalabras)

        val txtIngles = findViewById<EditText>(R.id.txtIngles)
        val txtEspanol = findViewById<EditText>(R.id.txtEspanol)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        btnGuardar.setOnClickListener {
            val ingles = txtIngles.text.toString().trim()
            val espanol = txtEspanol.text.toString().trim()

            if (ingles.isNotEmpty() && espanol.isNotEmpty()) {
                val linea = "$ingles=$espanol\n"
                openFileOutput(archivo, Context.MODE_APPEND).use {
                    it.write(linea.toByteArray())
                }
                Toast.makeText(this, "Palabra guardada correctamente", Toast.LENGTH_SHORT).show()
                txtIngles.text.clear()
                txtEspanol.text.clear()
            } else {
                Toast.makeText(this, "Completa ambos campos", Toast.LENGTH_SHORT).show()
            }
        }

        btnRegresar.setOnClickListener {
            finish()
        }
    }
}