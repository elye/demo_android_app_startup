package com.example.appmanual

import android.app.Application
import android.util.Log
import androidx.startup.AppInitializer
import com.example.mybase.MyBaseInitializer
import com.example.mylib.MyLibInitializer

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("TrackingLib", "MainApplication Started")
        val initializer = AppInitializer.getInstance(this)
        initializer.initializeComponent(MyBaseInitializer::class.java)
        initializer.initializeComponent(MyLibInitializer::class.java)
    }
}