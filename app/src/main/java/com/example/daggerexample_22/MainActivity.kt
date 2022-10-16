package com.example.daggerexample_22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.internal.DaggerGenerated


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = Activity()
        activity.keyboard.toString()

        activity.monitor.toString()
        activity.mouse.toString()


    }
}
