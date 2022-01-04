package com.example.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notbored.databinding.ActivityActivitiesBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.notbored.databinding.ActivityMainBinding
import com.example.notbored.retroFit.APIServiceActivity
import com.example.notbored.retroFit.ActivityResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  adapter : ActivityAdapter
    private var activityTypeList = listOf<ActivityResponse>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        setContentView(R.layout.activity_main)

        /*binding.termsAndConditions.setOnClickListener{
            setContentView(R.layout.activity_terms_and_conditions)
        }

        binding.startButton.setOnClickListener{
            setContentView(R.layout.activity_suggestion)
        } */

        val buttonTermsAndConditions = findViewById<Button>(R.id.termsAndConditions)
        buttonTermsAndConditions.setOnClickListener {
            val termsAndConditionsIntent = Intent(this, Suggestion::class.java)
            startActivity(termsAndConditionsIntent)
        }

        val buttonStart = findViewById<Button>(R.id.startButton)
        buttonStart.setOnClickListener {
            val startIntent = Intent(this, Activities::class.java)
            startActivity(startIntent)
        }
    }
}
