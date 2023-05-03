package com.example.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.databinding.ItemUserBinding

class TasksAdapter: RecyclerView.Adapter<TaskViewHolder>() {
    private val items = mutableListOf<Task>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun submitList(task: List<Task> ){
        items.clear()
        items.addAll(task)
        notifyDataSetChanged()
    }
    fun addItem(task: Task){
        items.add(task)
        notifyItemInserted(items.lastIndex)
    }
}