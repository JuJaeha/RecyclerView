package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val profileList = arrayListOf(
            Profiles(R.drawable.bubble_tea_pig,"Menu","explanation",1),
            Profiles(R.drawable.bubble_tea_bear,"Menu","explanation",100),
            Profiles(R.drawable.bubble_tea_pig,"Menu","explanation",10),
            Profiles(R.drawable.bubble_tea_bear,"Menu","explanation",7),
            Profiles(R.drawable.bubble_tea_pig,"Menu","explanation",80),
            Profiles(R.drawable.bubble_tea_bear,"Menu","explanation",50),
            Profiles(R.drawable.bubble_tea_pig,"Menu","explanation",30),
            Profiles(R.drawable.bubble_tea_bear,"Menu","explanation",27),
            Profiles(R.drawable.bubble_tea_pig,"Menu","explanation",9),
            Profiles(R.drawable.bubble_tea_bear,"Menu","explanation",5),
            Profiles(R.drawable.bubble_tea_pig,"Menu","explanation",11),
            Profiles(R.drawable.bubble_tea_bear,"Menu","explanation",15),
            Profiles(R.drawable.bubble_tea_pig,"Menu","explanation",14)
        )

        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)
        rv_profile.adapter = ProfileAdapter(profileList)


    }
}
