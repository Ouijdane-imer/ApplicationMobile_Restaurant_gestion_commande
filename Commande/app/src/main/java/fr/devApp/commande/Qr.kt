package fr.devApp.commande

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager

import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.budiyev.android.codescanner.AutoFocusMode
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.CodeScannerView
import com.budiyev.android.codescanner.DecodeCallback
import com.budiyev.android.codescanner.ErrorCallback
import com.budiyev.android.codescanner.ScanMode
class Qr : AppCompatActivity() {
        private lateinit var codeScanner: CodeScanner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr)
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) ==
            PackageManager.PERMISSION_DENIED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 123)
        } else {
            startScanning()
            val buttonQrCode=findViewById<ImageButton>(R.id.imageButtonQr)
            buttonQrCode.setOnClickListener{
                val intent= Intent(this, ChoixDeCommande::class.java)
                startActivity(intent)
            }
            val buttonMap=findViewById<ImageButton>(R.id.imageButtonmAP)
            buttonMap.setOnClickListener{
                val intent= Intent(this, Maapp::class.java)
                startActivity(intent)
            }
            val buttonProfil=findViewById<ImageButton>(R.id.imageViewProfil)
            buttonProfil.setOnClickListener{
                val intent=Intent(this, ProfilU::class.java)
                startActivity(intent)
            }

        }
    }
    //la fonction pour scanner le qr code
    private fun startScanning () {
        val scannerView = findViewById<CodeScannerView>(R.id.scanner_view)
        codeScanner = CodeScanner(this, scannerView)
        codeScanner.camera = CodeScanner.CAMERA_BACK
        codeScanner.formats = codeScanner.formats
        codeScanner.autoFocusMode = AutoFocusMode.SAFE
        codeScanner.scanMode = ScanMode.SINGLE
        codeScanner.isAutoFocusEnabled = true
        codeScanner.isFlashEnabled = false
        codeScanner.decodeCallback = DecodeCallback {

            runOnUiThread {
                Toast.makeText(this, "Scan result: ${it.text}", Toast.LENGTH_LONG).show()

            }
            codeScanner.errorCallback = ErrorCallback {
                runOnUiThread {
                    Toast.makeText(
                        this, "Camera initialization error: ${it.message}",
                        Toast.LENGTH_LONG
                    ).show()

                }
            }
            scannerView.setOnClickListener() {
                codeScanner.startPreview()

            }



        }
    }
    //Avoir les permission du telephone pour acceder a l'appareil photo
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (requestCode ==123){
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(  this,"Camera permission granted", Toast.LENGTH_SHORT).show()
                startScanning()
            }else{
                Toast.makeText(  this, "Camera permission denied", Toast.LENGTH_SHORT).show()
            }


            super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }



    }
    override fun onResume(){
        super.onResume()
                if (::codeScanner.isInitialized){
                    codeScanner?.startPreview()
                }
    }


override fun onPause(){
    if (::codeScanner.isInitialized) {
        codeScanner?.releaseResources()
    }
    super.onPause()
}



}
