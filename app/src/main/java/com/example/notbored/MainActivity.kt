package com.example.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
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
    private fun getRetrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("http://www.boredapi.com/api/activity/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}