package com.example.notbored

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notbored.databinding.ActivityMainBinding

class Activities : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //initRecylcerView()

        }

    /*private fun initRecylcerView() {

        adapter = ActivityAdapter(activityTypeList)
        binding.rvTypes.adapter = adapter


    }*/

}