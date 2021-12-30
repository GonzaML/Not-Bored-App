package com.example.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTermsAndConditions = findViewById<Button>(R.id.termsAndConditions)
        buttonTermsAndConditions.setOnClickListener {
            val termsAndConditionsIntent = Intent(this, TermsAndConditions::class.java)
            startActivity(termsAndConditionsIntent)
        }

    }

}