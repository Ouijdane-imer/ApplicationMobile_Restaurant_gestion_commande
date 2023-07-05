package fr.devApp.commande

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class emplacement : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emplacement)

        //revenir à la page precedente
        val buttonPrecedent=findViewById<Button>(R.id.buttonPrecedent)
        buttonPrecedent.setOnClickListener{
            val intents= Intent(this, MainActivity::class.java)
            startActivity(intents)

        }
        //se rediriger vers la page d'acceuil
        val suivantbutton=findViewById<Button>(R.id.button)
        suivantbutton.setOnClickListener{
            val intent=Intent(this, AccueilPage::class.java)
            startActivity(intent)
        }
        //se rediriger vers la page de profil
        val buttonProfil=findViewById<ImageButton>(R.id.imageView2)
        buttonProfil.setOnClickListener{
            val intent=Intent(this, ProfilU::class.java)
            startActivity(intent)
        }

    }
}