package com.example.recyclerviewtest

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerAdapter: RecyclerView.Adapter<MyViewHolder>() {
    var TAG: String = "로"
    private var modelList = ArrayList<MyModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")

        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
        Log.d(TAG, "MyRecyclerAdapter - onBindViewHolder() called / position : $position")
        holder.bind(this.modelList[position])
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")

        return this.modelList.size
    }

    fun submitList(modelList: ArrayList<MyModel>){
        this.modelList = modelList
    }

}
