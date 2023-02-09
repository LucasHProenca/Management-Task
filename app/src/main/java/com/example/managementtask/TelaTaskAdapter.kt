package com.example.managementtask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.managementtask.databinding.RcDaTelaTaskBinding

class TelaTaskAdapter: RecyclerView.Adapter<TelaTaskViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TelaTaskViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RcDaTelaTaskBinding.inflate(layoutInflater, parent, false)

        return TelaTaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TelaTaskViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

class TelaTaskViewHolder(val binding: RcDaTelaTaskBinding): RecyclerView.ViewHolder(binding.root) {

}
