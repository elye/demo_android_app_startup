package com.example.mybase

import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import com.example.mylib.MyLibInitializer

class MyBaseInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        Log.d("TrackingLib", "MyBase Initialized")
        return
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf(MyLibInitializer::class.java)
    }

}
