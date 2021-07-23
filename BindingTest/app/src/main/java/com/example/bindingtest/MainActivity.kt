package com.example.bindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bindingtest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onStart() {
        super.onStart()
        binding.firstButton.setText("")
    }

    override fun onPause() {
        super.onPause()

    }
}