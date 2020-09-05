package com.srinivas.chatbot

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.srinivas.chatbot.databinding.ItemActionBinding

class BtnsAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private  val actionList:List<String>

    init {
        actionList = Data.getActions()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflator = LayoutInflater.from(parent.context)
        val view: View = inflator.inflate(R.layout.item_action,parent,false)
        val binding = ItemActionBinding.bind(view)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {

        return  actionList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val holder:ViewHolder = holder as ViewHolder
        holder.bind(actionList.get(position))

    }


    class ViewHolder(private val binding: ItemActionBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val viewModel = ActionViewModel()

        fun bind(post: String) {
            viewModel.bind(post)
            binding.viewModel = viewModel
        }
    }
}