package com.example.recyclerviewtest

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.view.*


class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var TAG: String = "로그"

    private val userNameText = itemView.user_name_text
    private val profileImageView = itemView.profile_id

    init {
        Log.d(TAG, "MyViewHolder - init() called")
    }

    fun bind(myModel: MyModel){
        Log.d(TAG, "MyViewHolder - bind() called")

        userNameText.text = myModel.name


        Glide
            .with(App.instance)
            .load(myModel.profileImage)
            .centerCrop()
            .placeholder(R.drawable.sun_rainbow)
            .into(profileImageView);
    }
}