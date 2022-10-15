package com.example.davaleba_2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView = findViewById<TextView>(R.id.text)
        val result = intent.getStringExtra("result")
        textView.text = result

    }
}