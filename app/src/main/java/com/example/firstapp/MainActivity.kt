package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.trimmedLength
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
//                setReorderingAllowed(true)
                add<FirstFragment>(R.id.fragment_container_view)
            }
        }
    }
}