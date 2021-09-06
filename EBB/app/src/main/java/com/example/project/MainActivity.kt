package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)

        }

        binding.btnLogin.setOnClickListener{
            val intent = Intent(this,GameStart::class.java)
            startActivity(intent)
        }

    }
}