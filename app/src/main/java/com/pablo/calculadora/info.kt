package com.pablo.calculadora

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class info : AppCompatActivity() {

    lateinit var buttoncalculadora: Button
    lateinit var buttongithub: Button
    lateinit var buttonin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        buttoncalculadora = findViewById<Button>(R.id.buttoncalculadora)
        buttongithub = findViewById<Button>(R.id.buttongithub)
        buttonin = findViewById<Button>(R.id.buttonin)

        buttoncalculadora.setOnClickListener {
            onBackPressed()
        }

        buttongithub.setOnClickListener {
            val url = "https://github.com/Pablo-Restrepo"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        buttonin.setOnClickListener {
            val url = "https://www.linkedin.com/in/pablo-jose-restrepo/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}
