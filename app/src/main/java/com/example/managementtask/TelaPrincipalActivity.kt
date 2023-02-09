package com.example.managementtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.managementtask.databinding.ActivityTelaPrincipalBinding

class TelaPrincipalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTelaPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}