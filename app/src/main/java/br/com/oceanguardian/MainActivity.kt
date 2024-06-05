package br.com.oceanguardian

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

        val btnsitegov: Button = findViewById(R.id.btn_sitegov)

        btnsitegov.setOnClickListener {
            val intent = Intent(this, TelaInicio::class.java)
            startActivity(intent)
        }


        val btncadastro: Button = findViewById(R.id.btn_cadastro)

        btncadastro.setOnClickListener {
            val intent = Intent(this, TelaCadastro::class.java)
            startActivity(intent)
        }

    }
}
