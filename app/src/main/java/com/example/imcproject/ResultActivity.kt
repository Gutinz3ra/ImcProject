package com.example.imcproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    private lateinit var btnVoltar: Button

    private lateinit var textPeso: TextView
    private lateinit var textAltura: TextView
    private lateinit var textResultado: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        textPeso = findViewById(R.id.text_peso)
        textAltura = findViewById(R.id.text_altura)
        textResultado = findViewById(R.id.text_resultado)


        val bundle = intent.extras
        if (bundle != null){

            val peso = bundle.getDouble("peso")
            val altura = bundle.getDouble("altura")
        }


        btnVoltar = findViewById(R.id.btn_voltar)
            btnVoltar.setOnClickListener {
                finish()
            }

    }
}