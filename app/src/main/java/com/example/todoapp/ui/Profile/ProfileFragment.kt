package com.example.todoapp.ui.Profile

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todoapp.R
import com.example.todoapp.databinding.FragmentProfileBinding
import com.example.todoapp.ui.Main.BottomNavigationViewManager

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    private var bottomNavigationViewManager: BottomNavigationViewManager? = null

    override fun onAttach(context: Context) {
        if (context is BottomNavigationViewManager) {
            bottomNavigationViewManager = context
        }
        super.onAttach(context)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentProfileBinding.inflate(inflater, container, false)
        bottomNavigationViewManager?.setNavigationViewVisibility(true)
        val email = getString(R.string.welcome_profile, text)
        binding.imageExit.setOnClickListener {
            findNavController().popBackStack()
            bottomNavigationViewManager?.setNavigationViewVisibility(false)
        }

        binding.textViewOne.text = email
        return binding.root
    }
    companion object{
        var text = ""
    }
}