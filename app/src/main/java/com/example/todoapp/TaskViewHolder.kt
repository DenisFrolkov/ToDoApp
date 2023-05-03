package com.example.todoapp

import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.databinding.ItemUserBinding

class TaskViewHolder(private val binding: ItemUserBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(task: Task) = with(binding){
        textViewTitle.text = task.title
        textViewTime.text = task.time
        textViewAddress.text = task.address
    }
}