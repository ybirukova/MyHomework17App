package com.example.myhomeworkapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textCounter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textCounter = findViewById(R.id.textView)

        val buttonCounter = findViewById<TextView>(R.id.button_counter)
        var count = 0
        textCounter.text = count.toString()

        buttonCounter.setOnClickListener {
            count++
            textCounter.text = count.toString()
        }

        val buttonOpenSecondActivity = findViewById<TextView>(R.id.button_open_second_activity)
        buttonOpenSecondActivity.setOnClickListener {
            val someIntent = Intent(this, SecondActivity::class.java)
            someIntent.putExtra("RESULT", textCounter.text)
            startActivity(someIntent)
        }
    }
}