package fr.devApp.commande

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class AccueilPage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accueil_page)



        //se rediriger vers la page des informations du plat
        val suiv = findViewById<ImageButton>(R.id.imageButton11)
        suiv.setOnClickListener {

            val intent = Intent(this, InformationPlat::class.java)
            startActivity(intent)
        }
        //se rediriger vers le plat directement
        val suivMenu = findViewById<ImageButton>(R.id.imageButtonMBurg)
        suivMenu.setOnClickListener {

            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        }
    }

