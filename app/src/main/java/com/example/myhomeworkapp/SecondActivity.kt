package com.example.myhomeworkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val count = intent.getStringExtra("RESULT")

        val textView = findViewById<TextView>(R.id.textView)
        val defaultText = getString(R.string.results)
        textView.text = "$defaultText $count"
    }
}