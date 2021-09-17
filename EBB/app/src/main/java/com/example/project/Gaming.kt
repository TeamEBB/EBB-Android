package com.example.project

import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.example.project.databinding.ActivityGameStartBinding
import com.example.project.databinding.ActivityGamingBinding

class Gaming : AppCompatActivity() {

    lateinit var binding: ActivityGamingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBack.setOnClickListener{
            finish()
        }

        binding.btnCheckRanking.setOnClickListener {
            finish()
        }



    }



}