package com.example.todoapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todoapp.databinding.ActivityRegistrationBinding
import com.example.todoapp.extensions.validateConf
import com.example.todoapp.extensions.validateEmail
import com.example.todoapp.extensions.validateName
import com.example.todoapp.extensions.validatePass


class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.materialButton.setOnClickListener {
            val name = binding.textInputEditName.text
            val email = binding.textInputEditEmail.text
            val pass = binding.textInputEditPassword.text
            val confirm = binding.textInputEditConfirm.text

            binding.textInputLayoutName.error = validateName(name)
            binding.textInputLayoutEmail.error = validateEmail(email)
            binding.textInputLayoutPassword.error = validatePass(pass)
            binding.textInputLayoutConfirm.error = validateConf(pass, confirm)
        }

        binding.textView3.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.textView4.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}

