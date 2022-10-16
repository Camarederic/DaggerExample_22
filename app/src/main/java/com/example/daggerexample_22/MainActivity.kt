package com.example.daggerexample_22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.internal.DaggerGenerated


class MainActivity : AppCompatActivity() {

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Component().inject(this)
    }
}
