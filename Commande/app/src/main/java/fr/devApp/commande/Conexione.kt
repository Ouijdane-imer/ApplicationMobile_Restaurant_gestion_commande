package fr.devApp.commande


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Conexione : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conexione)
        //se connecter
          val buttonQrCode=findViewById<Button>(R.id.buttonConnexionn)
     buttonQrCode.setOnClickListener{
         val intent= Intent(this, Qr::class.java)
         startActivity(intent)
    }

    }
}