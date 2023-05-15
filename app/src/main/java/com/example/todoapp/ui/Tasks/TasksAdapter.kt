package com.example.todoapp.ui.Tasks

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.databinding.ItemTaskBinding
import com.example.todoapp.model.Task

class TasksAdapter: RecyclerView.Adapter<TaskViewHolder>() {
    private val items = mutableListOf<Task>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(items[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(tasks: List<Task> ){
        items.clear()
        items.addAll(tasks)
        notifyDataSetChanged()
    }
    fun addItem(task: Task){
        items.add(task)
        notifyItemInserted(items.lastIndex)
    }
}