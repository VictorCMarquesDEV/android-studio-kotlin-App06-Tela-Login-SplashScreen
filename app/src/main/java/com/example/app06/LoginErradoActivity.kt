package com.example.app06

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.app06.databinding.ActivityLoginErradoBinding

class LoginErradoActivity : ComponentActivity() {

    private lateinit var binding: ActivityLoginErradoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginErradoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVoltar.setOnClickListener {
            finish()
        }
    }
}