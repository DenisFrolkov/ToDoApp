package com.example.todoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
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
        supportActionBar?.hide()
        val name = binding.textInputEditName.text
        val email = binding.textInputEditEmail.text
        val pass = binding.textInputEditPassword.text
        val confirm = binding.textInputEditConfirm.text
        val validname = validateName(name)
        val validemail = validateEmail(email)
        val validpass = validatePass(pass)
        val validconf = validateConf(confirm)

        binding.materialButton.setOnClickListener {
            binding.textInputLayoutName.error = validname
            binding.textInputLayoutEmail.error = validemail
            binding.textInputLayoutPassword.error = validpass
            binding.textInputLayoutConfirm.error = validconf

            if(validname == null && validemail == null && validpass == null && validconf == null) {
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.textView3.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.textView4.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}

