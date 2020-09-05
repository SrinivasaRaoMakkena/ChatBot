package com.srinivas.chatbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent
import com.srinivas.chatbot.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.recyclerView.apply {

            val layoutManage:FlexboxLayoutManager = FlexboxLayoutManager(context)
            layoutManage.flexDirection = FlexDirection.ROW
            layoutManage.justifyContent = JustifyContent.FLEX_START

            val btnsAdapter:BtnsAdapter = BtnsAdapter()
            layoutManager = layoutManage
            adapter = btnsAdapter

        }

    }
}
