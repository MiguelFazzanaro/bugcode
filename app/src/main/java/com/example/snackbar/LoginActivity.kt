package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.login_body.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            callIntent(capturarDados(edUserName.text.toString(), edPassword.text.toString()))
        }
        cadastro.setOnClickListener {
            Toast.makeText(this, "clicou no cadastro", Toast.LENGTH_SHORT).show()
        }
    }

    fun capturarDados (nome: String, senha: String): Usuario {
        return Usuario(1, nome, senha)
    }

    fun callIntent (usuario: Usuario){
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key", usuario)
        startActivity(intent)
    }
}