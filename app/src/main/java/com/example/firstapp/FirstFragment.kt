package com.example.firstapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.trimmedLength
import androidx.fragment.app.*
import com.example.firstapp.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment(R.layout.fragment_first) {


    private var _binding: FragmentFirstBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root

        initView()

        return view
    }


    private fun initView() {
        binding.button.setOnClickListener {
            binding.lastnameValue.text
            binding.firstnameValue.text

            if ((binding.lastnameValue.text.toString().trimmedLength() <= 0) && (binding.firstnameValue.text.toString().trimmedLength() <= 0)) {
                binding.labelLastname.error = getString(R.string.emptyLastname)
                binding.labelFirstname.error = getString(R.string.emptyFirstname)
            } else if (binding.lastnameValue.text.toString().trimmedLength() <= 0) {
                binding.labelLastname.error = getString(R.string.emptyLastname)
            } else if (binding.firstnameValue.text.toString().trimmedLength() <= 0) {
                binding.labelFirstname.error = getString(R.string.emptyFirstname)
            } else {
                val fragment = SecondFragment.newInstance( binding.firstnameValue.text.toString(), binding.lastnameValue.text.toString())

                activity.navigateToResult(fragment)
            }


        }
    }


//    View.OnClickListener {
//
////            companion object {
////            const val LASTNAMEKEY = "lastname"
////            const val FIRSTNAMEKEY = "firstname"
////        }
//
//
//
//        lateinit var binding: ActivityMainBinding
//
//        fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//
//            binding = ActivityMainBinding.inflate(layoutInflater)
//            val view = binding.root
//            setContentView(view)
//
//            binding.button.setOnClickListener {
//                this.onClick(v = null)
//            }
//        }
//
//        override fun onClick(v: View?) {
//            val i = Intent(this, MainActivity2::class.java)
//
//            binding.labelLastname.error = null
//            binding.labelFirstname.error = null
//
//            if ((binding.lastnameValue.text.toString().trimmedLength() <= 0) && (binding.firstnameValue.text.toString().trimmedLength() <= 0)) {
//                binding.labelLastname.error = getString(R.string.emptyLastname)
//                binding.labelFirstname.error = getString(R.string.emptyFirstname)
//            } else if (binding.lastnameValue.text.toString().trimmedLength() <= 0) {
//                binding.labelLastname.error = getString(R.string.emptyLastname)
//            } else if (binding.firstnameValue.text.toString().trimmedLength() <= 0) {
//                binding.labelFirstname.error = getString(R.string.emptyFirstname)
//            } else {
//                i.putExtra(LASTNAMEKEY, binding.lastnameValue.text.toString())
//                i.putExtra(FIRSTNAMEKEY, binding.firstnameValue.text.toString())
//                startActivity(i)
//            }
//        }
//    }





        override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        View.OnClickListener {
//
////            companion object {
////                const val LASTNAMEKEY = "lastname"
////                const val FIRSTNAMEKEY = "firstname"
////            }
//
//
//
//            lateinit var binding: ActivityMainBinding
//
//            fun onCreate(savedInstanceState: Bundle?) {
//                super.onCreate(savedInstanceState)
//
//                binding = ActivityMainBinding.inflate(layoutInflater)
//                val view = binding.root
//                setContentView(view)
//
//                binding.button.setOnClickListener {
//                    this.onClick(v = null)
//                }
//            }
//
//            override fun onClick(v: View?) {
//                val i = Intent(this, MainActivity2::class.java)
//
//                binding.labelLastname.error = null
//                binding.labelFirstname.error = null
//
//                if ((binding.lastnameValue.text.toString().trimmedLength() <= 0) && (binding.firstnameValue.text.toString().trimmedLength() <= 0)) {
//                    binding.labelLastname.error = getString(R.string.emptyLastname)
//                    binding.labelFirstname.error = getString(R.string.emptyFirstname)
//                } else if (binding.lastnameValue.text.toString().trimmedLength() <= 0) {
//                    binding.labelLastname.error = getString(R.string.emptyLastname)
//                } else if (binding.firstnameValue.text.toString().trimmedLength() <= 0) {
//                    binding.labelFirstname.error = getString(R.string.emptyFirstname)
//                } else {
//                    i.putExtra(LASTNAMEKEY, binding.lastnameValue.text.toString())
//                    i.putExtra(FIRSTNAMEKEY, binding.firstnameValue.text.toString())
//                    startActivity(i)
//                }
//            }
//        }

//        view.findViewById<Button>(R.id.button_first).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }

}








