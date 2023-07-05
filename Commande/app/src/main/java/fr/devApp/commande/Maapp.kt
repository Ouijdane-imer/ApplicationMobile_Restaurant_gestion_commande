package fr.devApp.commande

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Maapp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maapp)

        val buttonQrCode=findViewById<ImageButton>(R.id.imageButtonQr)
        buttonQrCode.setOnClickListener{
            val intent= Intent(this, Qr::class.java)
            startActivity(intent)
        }
        //se rediriger vers la map
        val buttonMap=findViewById<ImageButton>(R.id.imageButtonMap)
        buttonMap.setOnClickListener{
            val intent= Intent(this, Maapp::class.java)
            startActivity(intent)
        }
    }
}