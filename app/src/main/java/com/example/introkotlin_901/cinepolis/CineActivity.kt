package com.example.introkotlin_901.cinepolis

import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.introkotlin_901.R
import android.widget.Button

class CineActivity : AppCompatActivity() {
    private lateinit var edNombre: EditText
    private lateinit var edCompradores: EditText
    private lateinit var edBoletos: EditText
    private lateinit var rbSi: RadioButton
    private lateinit var rbNo: RadioButton
    private lateinit var tResultado: TextView
    private lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cine)

        edNombre = findViewById(R.id.edNombre)
        edCompradores = findViewById(R.id.edCompradores)
        edBoletos = findViewById(R.id.edBoletos)
        rbSi = findViewById(R.id.rbSi)
        rbNo = findViewById(R.id.rbNo)
        tResultado = findViewById(R.id.tResultado)
        btnCalcular = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            calcular()
        }
    }

    fun calcular() {
        val nombre = edNombre.text.toString()
        val compradores = edCompradores.text.toString().toIntOrNull() ?: 0
        val boletos = edBoletos.text.toString().toIntOrNull() ?: 0
        val pagoTarjeta = rbSi.isChecked

        if (nombre.isBlank()) {
            tResultado.text = "Por favor, ingresa un nombre."
            return
        }

        if (compradores <= 0) {
            tResultado.text = "Debe haber al menos un comprador."
            return
        }

        if (boletos <= 0) {
            tResultado.text = "Debe ingresar una cantidad válida de boletos."
            return
        }

        val maxPermitidos = compradores * 7
        if (boletos > maxPermitidos) {
            tResultado.text = "Error: Máximo permitido es $maxPermitidos boletos (7 por persona)."
            return
        }

        val precioUnitario = 12
        val subtotal = boletos * precioUnitario

        val descuentoCantidad = when {
            boletos > 5 -> subtotal * 0.15
            boletos in 3..5 -> subtotal * 0.10
            else -> 0.0
        }

        val totalConDescuentos = subtotal - descuentoCantidad
        val descTarjeta = if (pagoTarjeta) totalConDescuentos * 0.10 else 0.0
        val total = totalConDescuentos - descTarjeta

        val resultado = """
            Nombre: $nombre
            Compradores: $compradores
            Boletos comprados: $boletos
            Subtotal: $${subtotal}
            Descuento por cantidad: $${descuentoCantidad.toInt()}
            Descuento por pago con Cineco: $${descTarjeta.toInt()}
            Total a pagar: $${total.toInt()}
        """.trimIndent()

        tResultado.text = resultado
    }
}
