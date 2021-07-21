package com.example.recyclerviewpractice

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Activity에서 Recyclerview를 연결할 때 bridge 역할을 함 - adapter 필요.
//RecyclerView의 Adapter속성을 가져오기 위해 상속을 한다.
class ProfileAdapter(val profileList: ArrayList<Profiles>): RecyclerView.Adapter<ProfileAdapter.CostomViewHolder>() {

    var TAG: String = "로그"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.CostomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        //LayoutInflater : 붙일 수 있다.
        //context : Activity에 있는 모든 정보들을 말한다. - Adapter에 연결될 Activity의 모든 정보들을 가지고 있다.

        return CostomViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CostomViewHolder, position: Int) {
        //onCreateViewHolder에서 만든 View를 가져다가 Bind한다. or 쓴다.
        holder.image_view.setImageResource(profileList.get(position).Image)
        holder.main_name_text.text = profileList.get(position).mainName
        holder.sub_name_text.text = profileList.get(position).subName
        holder.id_num_text.text = profileList.get(position).idNum.toString()
    }

    override fun getItemCount(): Int {
        //리스트에 대한 총 개수
        Log.d(TAG, "ProfileAdapter - getItemCount() called & profileList Size : ${profileList.size}")
        return profileList.size
    }

    //view의 역할을 잡아주는 것
    //컵 홀더와 같은 개념
    //그냥 쓸 수는 없고 RecyclerView의 ViewHolder를 가져와야 사용할 수 있다.
    class CostomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        ///val Image: Int, val mainName: String, val subName: String, val idNum: Int
        val image_view = itemView.findViewById<ImageView>(R.id.id_profile)
        val main_name_text = itemView.findViewById<TextView>(R.id.id_main_name)
        val sub_name_text = itemView.findViewById<TextView>(R.id.id_sub_name)
        val id_num_text = itemView.findViewById<TextView>(R.id.id_number)
    }


}