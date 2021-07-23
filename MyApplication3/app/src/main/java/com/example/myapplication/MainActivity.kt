package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {
    var TAG: String = "로그"
    var dataSet: ArrayList<List<String>> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addData()
        //layout manager 프로퍼티에 Linear Layout Manager 속성을 지정해준다.
        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        //data 초기화 후 넘겨주는 부분
        recycler_view.adapter = RecyclerViewAdapter(dataSet)

        Log.d(TAG, "MainActivity - Recyclerviewadapter() called 후후")
    }

    private fun addData(){
        for( i in 0..99){
            dataSet.add(listOf("$i th main", "$i th sub"))
        }
    }
}