package com.example.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        binding = ActivityMain2Binding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
//
//        val lastname: String? = intent.getStringExtra(LASTNAMEKEY)
//        val firstname: String? = intent.getStringExtra(FIRSTNAMEKEY)
//
//        binding.lastnameValue.text = lastname
//        binding.firstnameValue.text = firstname
    }
}