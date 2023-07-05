package fr.devApp.commande

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfilU : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_u)
        val buttonProfil=findViewById<Button>(R.id.button6)
        buttonProfil.setOnClickListener{
            val intent= Intent(this, RegimeAlimentaire::class.java)
            startActivity(intent)
        }
    }
}