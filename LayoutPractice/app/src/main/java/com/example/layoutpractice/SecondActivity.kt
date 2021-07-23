package com.example.layoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class SecondActivity : AppCompatActivity() {

    var TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun onBackButtonClicked(view: View){
        finish()
        Log.d(TAG, "SecondActivity - onBackButtonClicked() called")
    }
}