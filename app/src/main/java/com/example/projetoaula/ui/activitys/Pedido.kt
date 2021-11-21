package com.example.projetoaula.ui.activitys

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.projetoaula.R
import com.example.tarefas.dao.TarefaDao
import com.example.tarefas.models.Tarefa

class Pedido : AppCompatActivity(R.layout.activity_pedido) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        confiBotaoSalvar()

    }

    fun confiBotaoSalvar(){
        val btnSalvar = findViewById<Button>(R.id.form_btn_salvar)
        btnSalvar.setOnClickListener {
            salvarPedido()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun salvarPedido(){
        AlertDialog.Builder(this)
            .setTitle("Adicionado com sucesso")
            .setMessage("Pedido feito com sucesso")
            .setPositiveButton("Ok"){_,_ ->  finish() }
            .show()

    }
}