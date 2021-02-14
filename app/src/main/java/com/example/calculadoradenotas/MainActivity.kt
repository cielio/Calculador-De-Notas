package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalcular.setOnClickListener {

            val nota1 = editTextNota1.text.toString().toDouble()
            val nota2 = editTextNota1.text.toString().toDouble()

            val media = (nota1+nota2)/2

            val faltas = editTextFaltas.text.toString().toInt()

            if (media >= 7 && faltas <= 10) {
                textViewResultado.text = "Aluno foi Aprovado \n NotaFinal $media\n Faltas $faltas"
                textViewResultado.setTextColor(Color.GREEN)
            } else {
                textViewResultado.text = "Aluno foi Reprovado \n NotaFinal $media\n Faltas $faltas"
                textViewResultado.setTextColor(Color.RED)
            }
        }
    }
}