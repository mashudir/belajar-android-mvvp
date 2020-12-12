package com.mashudi.dimasapp.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mashudi.dimasapp.R
import com.mashudi.dimasapp.databinding.ActivityMainBinding
import com.mashudi.dimasapp.ui.auth.AuthActivity
import com.mashudi.dimasapp.ui.auth.DimasappAuth

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            DimasappAuth.logout(this) {
                startActivity(Intent(this,AuthActivity::class.java))
                finish()
            }
        }
    }
}