package com.pmdm.exament1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    private lateinit var name: AppCompatEditText
    private lateinit var hora: TextView
    private lateinit var btnNext: FloatingActionButton
//    private lateinit var dosAsientos: CardView
//    private lateinit var cuatroAsientos: CardView
//    private lateinit var ochoAsientos: CardView
//
//
//    private var dosSelect: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        initListeners()
    }

    private fun initListeners() {
//        dosAsientos.setOnClickListener {
//            dosSelect = true
//            setGenderColor()
//        }

        btnNext.setOnClickListener {
            val name = name.text.toString()
            val hora = hora.text.toString()
//            Log.i("Test", "Botón pulsado")
//            Toast.makeText(this, "Hola $name!",
//            Toast.LENGTH_LONG).show()
            if (name.isNotEmpty()) {
                Snackbar.make(btnNext, "Hola $name!", Snackbar.LENGTH_SHORT)
                    //.setAction("CLOSE") { finishAffinity() } //Cerrar app
                    //.setAction("RESET") { etName.setText(null) } //Borrar texto
                    .setAction("NEXT SCREEN") {
                        val intentGA = Intent(this, Resultado::class.java)
                        intentGA.putExtra("EXTRA_NAME", name)
                        intentGA.putExtra("EXTRA_HORA", hora)
                        startActivity(intentGA)
                    }
                    .show()
            } else {
                Toast.makeText(this, "Introduce un nombre", Toast.LENGTH_LONG).show()
            }
        }

    }


    private fun initComponents() {
        name = findViewById(R.id.name)
        btnNext = findViewById(R.id.btnNext)
        hora = findViewById(R.id.hora)

    }
}