package com.example.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.firstapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity(R.layout.activity_main2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
//                setReorderingAllowed(true)
                add<SecondFragment>(R.id.fragment_container_view)
            }
        }
    }
}


//class MainActivity2 : AppCompatActivity() {
//
//    private lateinit var binding: ActivityMain2Binding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)

//        binding = ActivityMain2Binding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
//
//        val lastname: String? = intent.getStringExtra(LASTNAMEKEY)
//        val firstname: String? = intent.getStringExtra(FIRSTNAMEKEY)
//
//        binding.lastnameValue.text = lastname
//        binding.firstnameValue.text = firstname
//    }
//}