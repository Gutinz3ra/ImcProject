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

                textPeso.text = "Peso informado $peso"
                textAltura.text = "Altura informada $altura"

                val imc = peso / (altura * altura)

               val resultado = if (imc < 18.5){
                     "Baixo"

                }else if (imc in 18.5 .. 24.9) {
                     "Normal"

                }else if (imc in 25.0 .. 29.9){
                   "Acima do peso"

                }else{
                     "Obeso"
            }
                textResultado.text = resultado
        }
        btnVoltar = findViewById(R.id.btn_voltar)
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}