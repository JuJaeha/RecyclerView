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
            Profiles(R.drawable.bubble_tea_pig,"Menu1","explanation1",34),
            Profiles(R.drawable.bubble_tea_bear,"Menu2","explanation2",100),
            Profiles(R.drawable.bubble_tea_pig,"Menu3","explanation3",10),
            Profiles(R.drawable.bubble_tea_bear,"Menu4","explanation4",7),
            Profiles(R.drawable.bubble_tea_pig,"Menu5","explanation5",80),
            Profiles(R.drawable.bubble_tea_bear,"Menu6","explanation6",50),
            Profiles(R.drawable.bubble_tea_pig,"Menu7","explanation7",30),
            Profiles(R.drawable.bubble_tea_bear,"Menu8","explanation8",27),
            Profiles(R.drawable.bubble_tea_pig,"Menu9","explanation9",9),
            Profiles(R.drawable.bubble_tea_bear,"Menu10","explanation10",5),
            Profiles(R.drawable.bubble_tea_pig,"Menu11","explanation11",11),
            Profiles(R.drawable.bubble_tea_bear,"Menu12","explanation12",15),
            Profiles(R.drawable.bubble_tea_pig,"Menu13","explanation13",14)
        )

        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)
        rv_profile.adapter = ProfileAdapter(profileList)
        rv_profile.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
    }
}
