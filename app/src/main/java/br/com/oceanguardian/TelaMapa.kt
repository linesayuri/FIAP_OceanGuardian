package br.com.oceanguardian

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class TelaMapa : AppCompatActivity(), OnMapReadyCallback {

    private var mGoogleMap:GoogleMap? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_mapa)

//botão voltar
        val btnvoltar: ImageButton = findViewById(R.id.btn_voltar)

        btnvoltar.setOnClickListener {
            val intent = Intent(this, TelaInicio::class.java)
            startActivity(intent)
        }

//mapa
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)
    }

//pin

        override fun onMapReady(googleMap: GoogleMap) {
            val denuncia1 = LatLng(-23.979446, -46.315194)
            googleMap.addMarker(
                MarkerOptions()
                    .position(denuncia1)
                    .title("Baleia Encalhada"))

            val denuncia2 = LatLng(-22.968850, -43.178480)
            googleMap.addMarker(
                MarkerOptions()
                    .position(denuncia2)
                    .title("Lixo na Orla"))

            val denuncia3 = LatLng(-23.908673, -46.164759)
            googleMap.addMarker(
                MarkerOptions()
                    .position(denuncia3)
                    .title("Tartaruga Encalhada"))

            val denuncia4 = LatLng(-23.970984,  -46.366082)
            googleMap.addMarker(
                MarkerOptions()
                    .position(denuncia4)
                    .title("Grande Quantidade de Lixo no Mar"))

            val denuncia5 = LatLng(-21.017784, -40.809760)
            googleMap.addMarker(
                MarkerOptions()
                    .position(denuncia5)
                    .title("Derramamento de Óleo"))

            googleMap.moveCamera(CameraUpdateFactory.newLatLng(denuncia1))

        }
    }

    fun onMapReady(mGoogleMap: GoogleMap) {
    }



