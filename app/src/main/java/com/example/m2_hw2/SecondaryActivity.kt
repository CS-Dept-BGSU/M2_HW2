package com.example.m2_hw2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondaryActivity : AppCompatActivity() {

    private lateinit var receivedMessageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        // Initialize UI components
        receivedMessageTextView = findViewById(R.id.textViewReceivedMessage)

        // Handle the incoming intent
        handleIncomingIntent()
    }

    /**
     * TODO: Implement this method to handle the intent received from MainActivity
     * Get the intent that started this activity
     * Extract the message extra with key "message"
     * Display the message in the receivedMessageTextView
     */
    private fun handleIncomingIntent() {
        // Your code here
    }
}