package com.example.myhomeworkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val count = intent.getIntExtra("RESULT", 0)

        textView = findViewById(R.id.textView_second_activity)
        textView.text = "${getString(R.string.results)} $count"
    }
}