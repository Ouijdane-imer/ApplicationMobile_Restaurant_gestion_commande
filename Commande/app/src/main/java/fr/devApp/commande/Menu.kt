package fr.devApp.commande

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import fr.devApp.commande.fragments.HomeFragment

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val suiv = findViewById<ImageButton>(R.id.imageButton2)
        suiv.setOnClickListener {

            val intent = Intent(this, InformationPlat::class.java)
            startActivity(intent)
        }
        val buttonProfil=findViewById<ImageButton>(R.id.imageView2)
        buttonProfil.setOnClickListener{
            val intent=Intent(this, ProfilU::class.java)
            startActivity(intent)
        }
    }
}