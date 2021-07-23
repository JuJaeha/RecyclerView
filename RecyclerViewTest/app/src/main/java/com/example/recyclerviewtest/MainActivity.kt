package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    val TAG: String = "로그"
    var modelList = ArrayList<MyModel>()

    private lateinit var myRecyclerAdapter: MyRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")
        for (i in 1..10){
            val myModel = MyModel(name = "Name",profileImage = "@drawable/sun_rainbow")
            this.modelList.add(myModel)
        }

        myRecyclerAdapter = MyRecyclerAdapter()
        myRecyclerAdapter.submitList(this.modelList)

        my_recycler_view.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            adapter = myRecyclerAdapter
        }
    }
}