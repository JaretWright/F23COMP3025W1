package com.example.f23comp3025w1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.f23comp3025w1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //define a variable to access the binding class (makes it easier for us to connect with the id's in the view/layout file)
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)  //connecting the binding variable to the class

        setContentView(binding.root)  //connect the controller class to access the binding class

        binding.button.setOnClickListener {
            binding.textView.text = "This is awesome"+binding.nameEditText.text.toString()
        }
    }
}