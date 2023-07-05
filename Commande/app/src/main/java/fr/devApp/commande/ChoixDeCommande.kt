package fr.devApp.commande

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChoixDeCommande : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choix_de_commande)

        //action sur le boutton sur place
        val suivantbutton=findViewById<Button>(R.id.buttonSurplace)
        suivantbutton.setOnClickListener{
            val intent= Intent(this, SurPlace::class.java)
            startActivity(intent)
        }
    }
}