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
        var validname: String?
        var validemail: String?
        var validpass: String?
        var validconfirm: String?

        binding.materialButton.setOnClickListener {
            validname = validateName(binding.textInputEditName.text)
            validemail = validateEmail(binding.textInputEditEmail.text)
            validpass = validatePass(binding.textInputEditPassword.text)
            validconfirm = validateConf(binding.textInputEditConfirm.text)
            binding.textInputLayoutName.error = validname
            binding.textInputLayoutEmail.error = validemail
            binding.textInputLayoutPassword.error = validpass
            binding.textInputLayoutConfirm.error = validconfirm

            if(validname == null && validemail == null && validpass == null && validconfirm == null) {
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, ProfileActivity::class.java))
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

