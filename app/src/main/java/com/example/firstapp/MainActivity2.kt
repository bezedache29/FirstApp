package com.example.firstapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.MainActivity.Companion.FIRSTNAMEKEY
import com.example.firstapp.MainActivity.Companion.LASTNAMEKEY

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val lastname: String? = intent.getStringExtra(LASTNAMEKEY)
        val firstname: String? = intent.getStringExtra(FIRSTNAMEKEY)

        val lastnameTextview: TextView = findViewById(R.id.lastnameValue)
        val firstnameTextview: TextView = findViewById(R.id.firstnameValue)

        lastnameTextview.text = lastname
        firstnameTextview.text = firstname
    }
}