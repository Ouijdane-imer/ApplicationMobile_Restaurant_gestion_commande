package fr.devApp.commande


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //se rediriger vers la page connexion
        val buttonConnexion=findViewById<Button>(R.id.buttonConnexion)
       buttonConnexion.setOnClickListener{
            val intent= Intent(this, Conexione::class.java)
            startActivity(intent)
        }
        //se rediriger vers la page inscription
        val buttonInscription=findViewById<Button>(R.id.buttonInscription)
        buttonInscription.setOnClickListener{
            val intent=Intent(this, Inscription2::class.java)
            startActivity(intent)
        }


    }


}

