package com.pmdm.exament1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.pmdm.exament1.R.id.resultado

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val resultado: TextView = findViewById(resultado)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        val hora: String = intent.extras?.getString("EXTRA_HORA").orEmpty()
        resultado.text = "Mesa reservada para $name a las $hora"
    }
}