package fr.devApp.commande

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InformationPlat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information_plat)


        val suiv = findViewById<Button>(R.id.button2)
        suiv.setOnClickListener {

            val intent = Intent(this, Totalcommande::class.java)
            startActivity(intent)
        }
    }
}