package com.srinivas.chatbot

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActionViewModel :ViewModel(){
    private val action:MutableLiveData<String> = MutableLiveData()

    fun getAction():MutableLiveData<String>{
        return action
    }

    fun bind(item:String){
        action.value = item
    }

}