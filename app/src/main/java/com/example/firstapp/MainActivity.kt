package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            this.onClick(v = null)
        }
    }

    override fun onClick(v: View?) {
//        input lastname
        val lastname: EditText = findViewById(R.id.editTextTextPersonName)
        val lastnameValue: String = lastname.getText().toString()
//        input firstname
        val firstname: EditText = findViewById(R.id.editTextTextPersonName2)
        val firstnameValue: String = firstname.getText().toString()

        val i = Intent(this, MainActivity2::class.java)
        i.putExtra("lastname", lastnameValue)
        i.putExtra("firstname", firstnameValue)
        startActivity(i)
    }

}