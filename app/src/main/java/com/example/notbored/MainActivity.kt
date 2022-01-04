package com.example.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.notbored.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var activityTypeList = listOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val buttonTermsAndConditions = findViewById<Button>(R.id.termsAndConditions)
        buttonTermsAndConditions.setOnClickListener {
            val termsAndConditionsIntent = Intent(this, TermsAndConditions::class.java)
            startActivity(termsAndConditionsIntent)

        }

        val buttonStart = findViewById<Button>(R.id.startButton)
            buttonStart.setOnClickListener {
                val startIntent = Intent(this, Activities::class.java)
                startActivity(startIntent)
            }

    }
}

