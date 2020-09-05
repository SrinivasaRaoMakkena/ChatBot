package com.srinivas.chatbot

import android.content.ContextWrapper
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

object Data{
    var listOfItems:ArrayList<String> = ArrayList()


    fun getActions():List<String>{

        listOfItems.add("Refund")
        listOfItems.add("Chat with Agent")
        listOfItems.add("Offer")
        listOfItems.add("None of the above")

        return listOfItems

    }

}


@BindingAdapter("mutableText")
fun setMutableText(view: Button, text: MutableLiveData<String>?) {
    val parentActivity: AppCompatActivity? = view.getParentActivity()
    if (parentActivity != null && text != null) {
        text.observe(parentActivity, Observer { value -> view.text = value ?: "" })
    }
}




/**
 * It is to get the Context of Parent Activity from the view
 */
fun View.getParentActivity(): AppCompatActivity?{
    var context = this.context
    while (context is ContextWrapper) {
        if (context is AppCompatActivity) {
            return context
        }
        context = context.baseContext
    }
    return null
}
