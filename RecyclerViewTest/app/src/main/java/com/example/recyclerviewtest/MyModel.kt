package com.example.recyclerviewtest

import android.util.Log

//MyModel class 추가
class MyModel(var name: String? = null, var profileImage: String? = null) {
    var TAG: String = "로그"
    
    init{
        Log.d(TAG, "Mymodel - init() called")    
    }
    
}