package com.example.bancodedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Banco_de_dados_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banco_de_dados2)
    }

    val database: ListView = findViewById(R.id.List_view_database)
     String database[] ={"Quantidade", "Nome", "Sigla", "Construtor", "Contexto", "Idade", "Aplicação", "Tempo de aplicação", "Correção", "Validade", "Objeto", "Público Alvo", "Descrição", "Itens", "Profissionais que poder aplicar" }
}