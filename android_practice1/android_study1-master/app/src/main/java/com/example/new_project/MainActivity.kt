package com.example.new_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.new_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var number=0
        binding.button1.setOnClickListener{
            number--
            binding.num.setText(number.toString())
        }
        binding.button2.setOnClickListener{
            number++
            binding.num.setText(number.toString())
        }
        var i=0
        binding.button3.setOnClickListener{
            i++
            if (i%2==1)
                binding.name.setText("박준형")
            else
                binding.name.setText("이름 표시")

        }
        binding.button4.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}