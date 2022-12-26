package com.rahim.kalimaliev_rahim_hm5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.rahim.kalimaliev_rahim_hm5.databinding.ActivityMainBinding
import com.rahim.kalimaliev_rahim_hm5.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data = binding.usernameEt.text
        val info = binding.emailEt.text
        binding.signInBtn.setOnClickListener(View.OnClickListener {
            val randomIntent = Intent(this, ActivitySecondBinding:: class.java)
            intent.putExtra("key",data.toString())
            intent.putExtra("email",info.toString())
            startActivity(randomIntent)
        })


    }
}