package com.example.projetoaula.ui.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.projetoaula.R
import com.example.tarefas.dao.TarefaDao
import com.example.tarefas.ui.components.ListaTarefaAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaTarefas : AppCompatActivity(R.layout.activity_lista_tarefas) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        configRecycleView()
        configBotaoSalvar()
        configBotaoVoltar()
    }

    fun configRecycleView(){
        val listaCardapio = findViewById<RecyclerView>(R.id.lista_tarefas)
        listaCardapio.adapter = ListaTarefaAdapter(TarefaDao().buscarTarefa(), this)
    }
    fun configBotaoSalvar(){
        val btnAdd = findViewById<FloatingActionButton>(R.id.btn_add_tarefa)
        btnAdd.setOnClickListener {
            val intent = Intent(this, FormularioTarefa::class.java)
            startActivity(intent)
        }
    }

    fun configBotaoVoltar(){
        val btnAdd = findViewById<FloatingActionButton>(R.id.btn_voltar)
        btnAdd.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}