package com.example.todoapp.ui.Tasks

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todoapp.databinding.FragmentTasksBinding
import com.example.todoapp.model.Task
import com.example.todoapp.ui.Main.BottomNavigationViewManager

@Suppress("UNREACHABLE_CODE")
class TasksFragment : Fragment() {
    private lateinit var binding: FragmentTasksBinding
    private val adapter = TasksAdapter()
    private var bottomNavigationViewManager: BottomNavigationViewManager? = null

    override fun onAttach(context: Context) {
        if (context is BottomNavigationViewManager) {
            bottomNavigationViewManager = context
        }
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTasksBinding.inflate(inflater, container, false)
        bottomNavigationViewManager?.setNavigationViewVisibility(true)
        binding.recyclerView.adapter = adapter
        adapter.submitList(tasks)
        binding.buttonAddTask.setOnClickListener{
            adapter.addItem(
                Task(
                    title = "sdgd2356787654300000fh",
                    time = "13153",
                    address = "123134235safsdg"
                )
            )
        }
        return binding.root
        binding.recyclerView.setOnClickListener{}
    }
    companion object{
        val tasks = listOf(
            Task(
                title = "sdgdfh",
                time = "13153",
                address = "123134235safsdg"
            ),
            Task(
                title = "sdg1241351245dfh",
                time = "13153",
                address = "123134235safsdg"
            ),
            Task(
                title = "sdgd2356787654300000fh",
                time = "13153",
                address = "123134235safsdg"
            )
        )
    }
}