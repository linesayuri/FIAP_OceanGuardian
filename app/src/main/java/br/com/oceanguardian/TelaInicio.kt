package br.com.oceanguardian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TelaInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_inicio)


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

        val button: ImageButton = findViewById(R.id.btn_ligar)

        button.setOnClickListener {
            PopupMenu(this@TelaInicio, button).apply {
                menuInflater.inflate(R.menu.menu_ligar, this.menu)
                setOnMenuItemClickListener {
                    //logica
                    Toast.makeText(this@TelaInicio, "${it.itemId}, ${it.title}", Toast.LENGTH_SHORT).show()
                    true
                }
                show()
            }
        }



    }
}
