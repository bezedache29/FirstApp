package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object{
        val LASTNAMEKEY = "lastname"
        val FIRSTNAMEKEY = "firstname"
    }

    lateinit var lastname: EditText
    lateinit var firstname: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        lastname = findViewById(R.id.editTextTextPersonName)
        firstname = findViewById(R.id.editTextTextPersonName2)

        button.setOnClickListener {
            this.onClick(v = null)
        }
    }

    override fun onClick(v: View?) {
        val i = Intent(this, MainActivity2::class.java)
        i.putExtra(LASTNAMEKEY, lastname.getText().toString())
        i.putExtra(FIRSTNAMEKEY, firstname.getText().toString())
        startActivity(i)
    }

}