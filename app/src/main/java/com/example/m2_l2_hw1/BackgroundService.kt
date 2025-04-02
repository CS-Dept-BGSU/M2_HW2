package com.example.m2_l2_hw1

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class BackgroundService : Service() {

    companion object {
        private const val TAG = "BackgroundService"
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Service created")
    }

    /**
     * TODO: Implement this method to handle the intent received from MainActivity
     * Extract the message from the intent extras with key "message"
     * val message = intent.getStringExtra("message")
     * Display a Toast notification with the received message
     * Return the appropriate start command result using Toast (If statement similar to SecondaryActivity.kt)
     *
     * Toast example:
     * // Toast.makeText(applicationContext, "Your message here", Toast.LENGTH_SHORT).show()
     */
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Your code here

        // Return START_REDELIVER_INTENT to have the intent redelivered if the service restarts
        return START_REDELIVER_INTENT
    }

    override fun onBind(intent: Intent?): IBinder? {
        // This service doesn't support binding
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Service destroyed")
    }
}