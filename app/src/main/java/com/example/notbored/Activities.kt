package com.example.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notbored.databinding.ActivityActivitiesBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Activities : AppCompatActivity() {
    private lateinit var binding: ActivityActivitiesBinding
    private lateinit var  adapter : ActivityAdapter

    val types = listOf(Type("Education"),Type("Recreational"),Type("Social"),
        Type("Diy"),Type("Charity"),Type("Cooking"),
        Type( "Relaxation"),Type("Music"),Type("Busywork"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

        /*val buttonSuggestion = findViewById<Button>(R.id.suggestionButton)
        buttonSuggestion.setOnClickListener {
            val suggestionIntent = Intent(this, Suggestion::class.java)
            startActivity(suggestionIntent)
        }*/


        }

    private fun initRecyclerView() {

        binding.rvTypes.layoutManager = LinearLayoutManager(this)
        adapter = ActivityAdapter(types)
        binding.rvTypes.adapter = adapter


    }

}