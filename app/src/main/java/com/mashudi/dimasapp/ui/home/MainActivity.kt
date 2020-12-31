package com.mashudi.dimasapp.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mashudi.dimasapp.R
import com.mashudi.dimasapp.databinding.ActivityMainBinding
import com.mashudi.dimasapp.ui.auth.AuthActivity
import com.mashudi.dimasapp.ui.auth.DimasappAuth

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        init()
//        binding.buttonLogout.setOnClickListener {
//            DimasappAuth.logout(this) {
//                startActivity(Intent(this,AuthActivity::class.java))
//                finish()
//            }
//        }
    }
    private fun init(){
        binding.bottomNav.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.ic_home -> navigate(R.id.homeFragment)
                R.id.ic_manga -> navigate(R.id.mangaFragment2)
                R.id.ic_favorit -> navigate(R.id.favoritFragment)
                R.id.ic_profile -> navigate(R.id.profileFragment)
                else->false
            }
        }
    }

    private fun navigate(id: Int): Boolean{
        findNavController(R.id.navHost).navigate(id)
        return true
    }
}