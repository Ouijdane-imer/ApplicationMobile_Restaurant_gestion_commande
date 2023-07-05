package fr.devApp.commande

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import fr.devApp.commande.fragments.HomeFragment

class paiement : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paiement)

        val suiv = findViewById<Button>(R.id.buttonsui)
        suiv.setOnClickListener {

            val intent = Intent(this, SuccessPayment::class.java)
            startActivity(intent)
        }
        val suivantbutton=findViewById<Button>(R.id.buttonPre)
        suivantbutton.setOnClickListener{
            val intent=Intent(this, Menu::class.java)
            startActivity(intent)
        }

        }




    }
