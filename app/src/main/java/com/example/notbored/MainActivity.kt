package com.example.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.notbored.databinding.ActivityMainBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.termsAndConditions.setOnClickListener{
            setContentView(R.layout.activity_terms_and_conditions)
        }

        binding.startButton.setOnClickListener{
            setContentView(R.layout.activity_activities)
        }

    }
    private fun getRetrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("http://www.boredapi.com/api/activity/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}