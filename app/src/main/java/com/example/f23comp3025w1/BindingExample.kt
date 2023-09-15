package com.example.f23comp3025w1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.f23comp3025w1.databinding.ActivityBindingExampleBinding

class BindingExample : AppCompatActivity() {

    //step 1 define a global variable to access the id's defined in the view
    private lateinit var binding : ActivityBindingExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //step 2 - initialize the variable called binding
        binding = ActivityBindingExampleBinding.inflate(layoutInflater)


        //step 3 - set the content view to use the binding.root
        setContentView(binding.root)

        binding.helloTextView.text = getString(R.string.booyah)
    }
}