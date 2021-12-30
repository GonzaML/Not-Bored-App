package com.example.notbored

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class TermsAndConditions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_and_conditions)

        val finishButton = findViewById<FloatingActionButton>(R.id.finishButton)
        finishButton.setOnClickListener {
            finish()
            
        }
        val loremImpsumTextView: TextView = findViewById(R.id.loremImpsumText)
        loremImpsumTextView.movementMethod = ScrollingMovementMethod()
    }
}