package com.rahim.kalimaliev_rahim_hm5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rahim.kalimaliev_rahim_hm5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

     private lateinit var binding2: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding2.root)
        val intent = getIntent()

        binding2.result1.text = intent.getStringExtra("key").toString()
        binding2.result2.text = intent.getStringExtra("email").toString()
    }
}