package com.example.notbored

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.notbored.databinding.ActivityMainBinding
import com.example.notbored.databinding.ActivitySuggestionBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Suggestion : AppCompatActivity() {

    private lateinit var binding: ActivitySuggestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuggestionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        searchByRandom()
    }


    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://www.boredapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun searchByType(typeName: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java)
                .getSuggestion("activity?type=$typeName")
            val suggestion = call.body()
            runOnUiThread() {
                if (call.isSuccessful) {
                    val activity = suggestion?.activity ?: ""
                    val participants = suggestion?.participants ?: ""
                    val price = suggestion?.price ?: ""
                    val type = suggestion?.type ?: ""
                    val priceRange = price.toString().toDouble()
                    val rangeText: String

                    // Check the range price
                    if (priceRange > 0 && priceRange <= 0.3) {
                        rangeText = "Low"
                    } else if (priceRange > 0.3 && priceRange <= 0.6) {
                        rangeText = "Medium"
                    } else if (priceRange > 6) {
                        rangeText = "High"
                    } else {
                        rangeText = "Free"
                    }

                    // Set the text value in views
                    binding.activityDescriptionText.text = activity
                    binding.participantsNumberText.text = participants.toString()
                    binding.priceRangeText.text = rangeText
                    binding.activityTypeText.text = type

                } else {
                    showError()
                }
            }
        }
    }

    private fun searchByTypeAndParticipants(typeName: String, participants: Int) {
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java)
                .getSuggestion("activity?type=$typeName&participants=$participants")
            val suggestion = call.body()
            runOnUiThread() {
                if (call.isSuccessful) {
                    val activity = suggestion?.activity ?: ""
                    val participants = suggestion?.participants ?: ""
                    val price = suggestion?.price ?: ""
                    val type = suggestion?.type ?: ""
                    val priceRange = price.toString().toDouble()
                    val rangeText: String

                    // Check the range price
                    if (priceRange > 0 && priceRange <= 0.3) {
                        rangeText = "Low"
                    } else if (priceRange > 0.3 && priceRange <= 0.6) {
                        rangeText = "Medium"
                    } else if (priceRange > 6) {
                        rangeText = "High"
                    } else {
                        rangeText = "Free"
                    }

                    // Set the text value in views
                    binding.activityDescriptionText.text = activity
                    binding.participantsNumberText.text = participants.toString()
                    binding.priceRangeText.text = rangeText
                    binding.activityTypeText.text = type

                } else {
                    showError()
                }
            }
        }
    }

    private fun searchByRandom() {
        CoroutineScope(Dispatchers.IO).launch {
            val call =
                getRetrofit().create(APIService::class.java).getSuggestion("activity/")
            val suggestion = call.body()
            runOnUiThread() {
                if (call.isSuccessful) {
                    val activity = suggestion?.activity ?: ""
                    val participants = suggestion?.participants ?: ""
                    val price = suggestion?.price ?: ""
                    val type = suggestion?.type ?: ""
                    val priceRange = price.toString().toDouble()
                    val rangeText: String

                    // Check the range price
                    if (priceRange > 0 && priceRange <= 0.3) {
                        rangeText = "Low"
                    } else if (priceRange > 0.3 && priceRange <= 0.6) {
                        rangeText = "Medium"
                    } else if (priceRange > 6) {
                        rangeText = "High"
                    } else {
                        rangeText = "Free"
                    }

                    // Set the text value in views
                    binding.activityDescriptionText.text = activity
                    binding.participantsNumberText.text = participants.toString()
                    binding.priceRangeText.text = rangeText
                    binding.activityTypeText.text = type

                } else {
                    showError()
                }
            }
        }
    }

    private fun showError() {
        Toast.makeText(this, "Sorry, this is going bad", Toast.LENGTH_SHORT).show()
    }
}