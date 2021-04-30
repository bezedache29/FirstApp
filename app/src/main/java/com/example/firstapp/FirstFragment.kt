package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.firstapp.databinding.ActivityMainBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        view.findViewById<Button>(R.id.button_first).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
    }
}






//, View.OnClickListener {
//
//    companion object {
//        const val LASTNAMEKEY = "lastname"
//        const val FIRSTNAMEKEY = "firstname"
//    }
//
//    private lateinit var binding: ActivityMainBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
//
//        binding.button.setOnClickListener {
//            this.onClick(v = null)
//        }
//    }
//
//    override fun onClick(v: View?) {
//        val i = Intent(this, MainActivity2::class.java)
//
//        binding.labelLastname.error = null
//        binding.labelFirstname.error = null
//
//        if ((binding.lastnameValue.text.toString().trimmedLength() <= 0) && (binding.firstnameValue.text.toString().trimmedLength() <= 0)) {
//            binding.labelLastname.error = getString(R.string.emptyLastname)
//            binding.labelFirstname.error = getString(R.string.emptyFirstname)
//        } else if (binding.lastnameValue.text.toString().trimmedLength() <= 0) {
//            binding.labelLastname.error = getString(R.string.emptyLastname)
//        } else if (binding.firstnameValue.text.toString().trimmedLength() <= 0) {
//            binding.labelFirstname.error = getString(R.string.emptyFirstname)
//        } else {
//            i.putExtra(LASTNAMEKEY, binding.lastnameValue.text.toString())
//            i.putExtra(FIRSTNAMEKEY, binding.firstnameValue.text.toString())
//            startActivity(i)
//        }
//    }
//}
