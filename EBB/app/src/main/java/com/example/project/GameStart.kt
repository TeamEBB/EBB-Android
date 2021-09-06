package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.databinding.ActivityGameStartBinding

class GameStart : AppCompatActivity() {

    lateinit var binding: ActivityGameStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogout.setOnClickListener {
            finish()
        }

        binding.btnStart.setOnClickListener {
            val intent = Intent(this, Gaming::class.java)
            startActivity(intent)
        }

    }
}