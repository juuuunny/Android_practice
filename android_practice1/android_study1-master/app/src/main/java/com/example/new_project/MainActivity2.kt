package com.example.new_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.new_project.databinding.ActivityMain2Binding
import com.example.new_project.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




    }
}