package com.example.firstapp

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        setSupportActionBar(findViewById(R.id.toolbar))

//        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }

        val lastname: String? = intent.getStringExtra("lastname")
        val firstname: String? = intent.getStringExtra("firstname")

        val lastnameTextview: TextView = findViewById(R.id.lastnameValue)
        val firstnameTextview: TextView = findViewById(R.id.firstnameValue)

        lastnameTextview.setText(lastname)
        firstnameTextview.setText(firstname)
    }
}