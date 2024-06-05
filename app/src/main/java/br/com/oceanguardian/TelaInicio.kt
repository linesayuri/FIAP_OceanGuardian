package br.com.oceanguardian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class TelaInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_inicio)


        val btnligar: ImageButton = findViewById(R.id.btn_ligar)

        btnligar.setOnClickListener {
            val intent = Intent(this, TelaDetalhesDenuncia::class.java)
            startActivity(intent)
        }


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


        val btndenun1: Button = findViewById(R.id.btn_denun1)

        btndenun1.setOnClickListener {
            val intent = Intent(this, TelaDetalhesDenuncia::class.java)
            startActivity(intent)
        }


    }
}
