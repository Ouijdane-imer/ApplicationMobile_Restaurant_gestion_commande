package fr.devApp.commande

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Totalcommande : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_totalcommande)


        val suivantbuttonComptoir=findViewById<Button>(R.id.buttonEnligne)
        suivantbuttonComptoir.setOnClickListener{
            val intent= Intent(this, paiement::class.java)
            startActivity(intent)
        }



    }
}