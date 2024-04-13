package com.example.app06

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.app06.databinding.ActivityMainBinding

// App06: Tela de Login, SplashScreen

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            val usuario = binding.editUsuario.text.toString().trim()
            val senha = binding.editSenha.text.toString().trim()

            if (usuario == "admin" && senha == "1234") {
                startActivity(Intent(this, LoginOkActivity::class.java))
            } else {
                startActivity(Intent(this, LoginErradoActivity::class.java))
            }
            binding.editUsuario.setText("")
            binding.editSenha.setText("")
        }
    }
}