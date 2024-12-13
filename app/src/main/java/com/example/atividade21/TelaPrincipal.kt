package com.example.atividade21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)

        val botaoAbrirImagem = findViewById<Button>(R.id.botao_abrir_imagem)
        botaoAbrirImagem.setOnClickListener {
            val intent = Intent(this, TelaImagem::class.java)
            startActivity(intent)
        }
    }
}
