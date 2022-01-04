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
            /*binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)*/

            /*binding.termsAndConditions.setOnClickListener{
                setContentView(R.layout.activity_terms_and_conditions)
            }

            binding.startButton.setOnClickListener{
                setContentView(R.layout.activity_activities)

            }*/



    /*private fun searchActivityByType(query: String) {

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



    }*/


