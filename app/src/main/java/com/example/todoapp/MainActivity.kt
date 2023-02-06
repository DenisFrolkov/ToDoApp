package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todoapp.databinding.ActivityMainBinding
import com.example.todoapp.extensions.validateMy

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView3.setOnClickListener{
            startActivity(Intent(this, RegistrationActivity::class.java))
            startActivity(intent)
        }

        binding.textView4.setOnClickListener{
            startActivity(Intent(this, RegistrationActivity::class.java))
            startActivity(intent)
        }
    }
}