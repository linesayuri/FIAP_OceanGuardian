package br.com.oceanguardian

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class TelaTeste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_inicio02)



        val btndenuncia: ImageButton = findViewById(R.id.btn_add_denuncia)

        btndenuncia.setOnClickListener {
            val intent = Intent(this, TelaDenuncia::class.java)
            startActivity(intent)
        }



        val btnmapa: ImageButton = findViewById(R.id.btn_mapa)

        btnmapa.setOnClickListener {
            val intent = Intent(this,TelaMapa::class.java)
            startActivity(intent)
        }


        val btnligar: ImageButton = findViewById(R.id.btn_ligar)

        btnligar.setOnClickListener {
            val intent = Intent(this, TelaDenuncia::class.java)
            startActivity(intent)
        }
    }
}