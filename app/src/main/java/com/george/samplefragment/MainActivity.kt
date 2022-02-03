package com.george.samplefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    public var currFrag: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp(): Boolean {
        if (currFrag == "frag1") {
            finish()
            return true
        } else {
            return findNavController(R.id.fragmentContainerView).navigateUp()
        }
    }
}