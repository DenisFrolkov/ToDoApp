package com.example.todoapp.ui.History

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todoapp.databinding.FragmentHistoryBinding
import com.example.todoapp.ui.Main.BottomNavigationViewManager

class HistoryFragment : Fragment() {
    private lateinit var binding: FragmentHistoryBinding
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
        binding = FragmentHistoryBinding.inflate(inflater, container, false)
        bottomNavigationViewManager?.setNavigationViewVisibility(true)
        return binding.root
    }
}