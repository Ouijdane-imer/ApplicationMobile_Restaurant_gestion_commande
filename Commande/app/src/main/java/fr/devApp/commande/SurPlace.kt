package fr.devApp.commande

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SurPlace : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sur_place)


        val suivantbutton=findViewById<Button>(R.id.button)
        suivantbutton.setOnClickListener{
            val intent= Intent(this, emplacement::class.java)
            startActivity(intent)
        }
        val buttonProfil=findViewById<ImageButton>(R.id.imageView2)
        buttonProfil.setOnClickListener{
            val intent=Intent(this, ProfilU::class.java)
            startActivity(intent)
        }
    }
}