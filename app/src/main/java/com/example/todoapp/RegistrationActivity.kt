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
        val validname = validateName(binding.textInputEditName.text)
        val validemail = validateEmail(binding.textInputEditEmail.text)
        val validpass = validatePass(binding.textInputEditPassword.text)
        val validconf = validateConf(binding.textInputEditConfirm.text)

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

