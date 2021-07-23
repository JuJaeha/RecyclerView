package com.example.layoutpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //로그인 버튼 뷰에 클릭 리스너를 설정하였다.
//       login_btn.setOnClickListener(View.OnClickListener {
//            onLoginButtonClicked()
//        })

        login_btn.setOnClickListener {
            onLoginButtonClicked()
        }

    }

    fun onLoginButtonClicked(){
        Log.d(TAG, "MainActivity - onLoginButtonClicked() called")

        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}