package com.example.myapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

//메인 엑티비티에서 데이터를 받아오기 위해서 작
class RecyclerViewAdapter(var dataSet: ArrayList<List<String>>):
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val tvMain: TextView = view.tv_main
        private val tvSub: TextView = view.tv_sub

        fun binding(data: List<String>){
            tvMain.text = data[0]
            tvSub.text = data[1]
        }
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        var TAG: String = "로그"

        Log.d(TAG, "RecyclerViewAdapter - onCreateViewHolder() called")
        //어떤 xml 파일을 갖다 쓸껀
     val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
       return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        //어떤 데이터를 바인딩 할지
        holder.binding(dataSet[position])
    }

    override fun getItemCount(): Int {
        //view holder의 개수

        return dataSet.size
    }



}

