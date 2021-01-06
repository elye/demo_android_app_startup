package com.example.mylib

import android.content.Context
import android.util.Log
import androidx.startup.Initializer


class MyLibInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        Log.d("TrackingLib", "MyLib Initialized")
        return
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}
