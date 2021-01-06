package com.example.myapplication

import android.app.Application
import android.util.Log

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("TrackingLib", "MainApplication Started")
    }
}
