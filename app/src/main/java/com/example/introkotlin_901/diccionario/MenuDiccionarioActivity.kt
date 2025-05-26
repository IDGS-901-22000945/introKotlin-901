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




class MenuDiccionarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_diccionario)

        val btnIrAgregar = findViewById<Button>(R.id.btnIrAgregar)
        val btnIrBuscar = findViewById<Button>(R.id.btnIrBuscar)

        btnIrAgregar.setOnClickListener {
            startActivity(Intent(this, AgregarPalabraActivity::class.java))
        }

        btnIrBuscar.setOnClickListener {
            startActivity(Intent(this, BuscarPalabraActivity::class.java))
        }
    }
}