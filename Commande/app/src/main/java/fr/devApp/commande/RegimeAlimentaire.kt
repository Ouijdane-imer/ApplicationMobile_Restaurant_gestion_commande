package fr.devApp.commande

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class RegimeAlimentaire : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regime_alimentaire)

        val buttonProfil=findViewById<ImageButton>(R.id.imageView2)
        buttonProfil.setOnClickListener{
            val intent= Intent(this, ProfilU::class.java)
            startActivity(intent)
        }
    }
}