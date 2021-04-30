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

        binding.labelLastname.error = null
        binding.labelFirstname.error = null

        if ((binding.lastnameValue.text.toString().trimmedLength() <= 0) && (binding.firstnameValue.text.toString().trimmedLength() <= 0)) {
            binding.labelLastname.error = getString(R.string.emptyLastname)
            binding.labelFirstname.error = getString(R.string.emptyFirstname)
        } else if (binding.lastnameValue.text.toString().trimmedLength() <= 0) {
            binding.labelLastname.error = getString(R.string.emptyLastname)
        } else if (binding.firstnameValue.text.toString().trimmedLength() <= 0) {
            binding.labelFirstname.error = getString(R.string.emptyFirstname)
        } else {
            i.putExtra(LASTNAMEKEY, binding.lastnameValue.text.toString())
            i.putExtra(FIRSTNAMEKEY, binding.firstnameValue.text.toString())
            startActivity(i)
        }
    }
}
