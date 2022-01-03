package com.example.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.termsAndConditions.setOnClickListener{
            setContentView(R.layout.activity_terms_and_conditions)
        }

        binding.startButton.setOnClickListener{
            setContentView(R.layout.activity_activities)
        }

    }



    private fun searchActivityByType(query: String) {

        //Buscar eso en la API

        CoroutineScope(Dispatchers.IO).launch {

            val call = getRetrofit()
                .create(APIServiceActivity::class.java)
                .getActivityByType("?type=$query")
                if(call.isSuccessful) {
                    //show recycler view
                } else {
                    //show error
                }

            //Cargar la respuesta en el Recycler View

            val activityResponse : ActivityResponse? = call.body()


            }

        }

    }

    private fun getRetrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("http://www.boredapi.com/api/activity")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
