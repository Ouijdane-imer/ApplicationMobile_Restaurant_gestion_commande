package fr.devApp.commande

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SuccessPayment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_payment)

        val ButtonAccueil=findViewById<Button>(R.id.buttonQRCode)
        ButtonAccueil.setOnClickListener{
            val intent= Intent(this, Qr::class.java)
            startActivity(intent)
        }


    }
}