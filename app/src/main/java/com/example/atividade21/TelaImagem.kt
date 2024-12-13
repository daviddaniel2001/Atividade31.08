package com.example.atividade21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TelaImagem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_imagem)

        val imagem = findViewById<ImageView>(R.id.imagem_exibida)
        imagem.setImageResource(R.drawable.sua_imagem) // Substitua por sua imagem no diretório 'res/drawable'
    }
}
