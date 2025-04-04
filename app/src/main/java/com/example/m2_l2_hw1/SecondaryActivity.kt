package com.example.m2_l2_hw1

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
     * val intent = intent
     *
     * Extract the message from the intent extras
     * val message = intent.getStringExtra("message")
     *
     * Display the message in the receivedMessageTextView
     * if (!message.isNullOrEmpty()) {
     *             receivedMessageTextView.text = message
     *         } else {
     *             receivedMessageTextView.text = "No message received"
     *         }
     */
    private fun handleIncomingIntent() {
        // Your code here
    }
}