package com.example.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                add<FirstFragment>(R.id.fragment_container_view)
                setReorderingAllowed(true)

            }

        }
    }
}

fun FragmentActivity?.navigateToResult(fragment: Fragment) {
    this?.supportFragmentManager?.commit {
        add(R.id.fragment_container_view, fragment)
        setReorderingAllowed(true)

    }
}

//fun AppCompatActivity.replaceFragment(fragment:Fragment){
//    val fragmentManager = supportFragmentManager
//    val transaction = fragmentManager.beginTransaction()
//    transaction.replace(R.id.host,fragment)
//    transaction.addToBackStack(null)
//    transaction.commit()
//}