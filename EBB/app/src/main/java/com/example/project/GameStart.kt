package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.databinding.ActivityGameStartBinding

class GameStart : AppCompatActivity() {

    var score = 0

    lateinit var binding: ActivityGameStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var treeImage = when(score){
            0 -> R.drawable.tree1
            100 -> R.drawable.tree2
            200 -> R.drawable.tree3
            300 -> R.drawable.tree4
            else -> R.drawable.tree5
        }

        binding.changeTree.setImageResource(treeImage)



        binding.btnLogout.setOnClickListener {
            finish()
        }

        binding.btnStart.setOnClickListener {
            val intent = Intent(this, Gaming::class.java)
            startActivity(intent)
        }

    }
}