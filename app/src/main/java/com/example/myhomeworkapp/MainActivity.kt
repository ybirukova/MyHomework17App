package com.example.myhomeworkapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textCounter: TextView
    private lateinit var buttonCounter: Button
    private lateinit var buttonOpenSecondActivity: Button
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count = savedInstanceState?.getInt("COUNT") ?: 0

        textCounter = findViewById(R.id.text_result)
        buttonCounter = findViewById(R.id.button_counter)
        buttonOpenSecondActivity = findViewById(R.id.button_open_second_activity)

        textCounter.text = count.toString()

        buttonCounter.setOnClickListener {
            textCounter.text = (++count).toString()
        }

        buttonOpenSecondActivity.setOnClickListener {
            val someIntent = Intent(this, SecondActivity::class.java)
            someIntent.putExtra("RESULT", count)
            startActivity(someIntent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt("COUNT", count)
    }
}