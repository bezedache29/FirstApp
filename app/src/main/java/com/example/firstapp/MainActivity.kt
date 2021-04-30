package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.trimmedLength
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val LASTNAMEKEY = "lastname"
        const val FIRSTNAMEKEY = "firstname"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            this.onClick(v = null)
        }
    }

    override fun onClick(v: View?) {
        val i = Intent(this, MainActivity2::class.java)
        if ((binding.editTextTextPersonName.text.toString().trimmedLength() <= 0) || (binding.editTextTextPersonName2.text.toString().trimmedLength() <= 0)) {
            binding.errorMessage.text = "Tous les champs doivent être rempli"
        } else {
            i.putExtra(LASTNAMEKEY, binding.editTextTextPersonName.text.toString())
            i.putExtra(FIRSTNAMEKEY, binding.editTextTextPersonName2.text.toString())
            startActivity(i)
        }
    }
}
