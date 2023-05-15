package com.example.todoapp.ui.Tasks

import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.databinding.ItemTaskBinding
import com.example.todoapp.model.Task

class TaskViewHolder(private val binding: ItemTaskBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(task: Task) = with(binding){
        textViewTitle.text = task.title
        textViewTime.text = task.time
        textViewAddress.text = task.address
        root.setOnClickListener {  }
    }
}