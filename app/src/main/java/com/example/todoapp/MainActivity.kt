package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.todoapp.databinding.ActivityMainBinding
import com.example.todoapp.extensions.validateEmail
import com.example.todoapp.extensions.validatePass

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signButton.setOnClickListener{
            var validemail: String? = validateEmail(binding.textInputEditEmail.text)
            var validpass: String? = validatePass(binding.textInputEditPassword.text)
            binding.textInputLayoutEmail.error = validemail
            binding.textInputLayoutPassword.error = validpass

            if(validemail == null && validpass == null) {
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        }

        binding.textView3.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        binding.textView4.setOnClickListener{
            startActivity(Intent(this, RegistrationActivity::class.java))
        }

    }
}