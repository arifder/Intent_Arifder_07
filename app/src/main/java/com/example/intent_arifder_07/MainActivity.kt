package com.example.intent_arifder_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentButton: Button = findViewById(R.id.buttonIntent)
        intentButton.setOnClickListener {
            viewdetail()

        }
    }

    private fun viewdetail() {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}
