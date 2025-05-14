package com.example.introkotlin_901

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.ejemplo1.SumaActivity
import com.example.introkotlin_901.cinepolis.CineActivity
import com.example.introkotlin_901.ejemplo2.saludoActivity
import com.example.introkotlin_901.ejemplo2.Resultado
import com.example.introkotlin_901.diccionario.MenuDiccionarioActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnSuma = findViewById<Button>(R.id.btn1)
        val btnSaludo = findViewById<Button>(R.id.btn2)
        val btnCine = findViewById<Button>(R.id.btn3)
        val btnDic = findViewById<Button>(R.id.btn4)


        btnSuma.setOnClickListener { navegateToSuma() }
        btnSaludo.setOnClickListener { navegateToSaludar() }
        btnCine.setOnClickListener { navegateToCine() }
        btnDic.setOnClickListener { navegateToDiccionario() }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToSuma () {
        val intent = Intent(this, SumaActivity::class.java)
        startActivity(intent)

    }
    private fun navegateToCine () {
        val intent = Intent(this, CineActivity::class.java)
        startActivity(intent)

    }
    private fun navegateToSaludar () {
        val intent = Intent(this, saludoActivity::class.java)
        startActivity(intent)

    }
    private fun navegateToDiccionario () {
        val intent = Intent(this, MenuDiccionarioActivity::class.java)
        startActivity(intent)

    }
}