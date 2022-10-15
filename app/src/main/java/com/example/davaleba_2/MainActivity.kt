package com.example.davaleba_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, SecondActivity::class.java)

        val buttonPlus = findViewById<View>(R.id.plus)
        val buttonMinus = findViewById<View>(R.id.minus)
        val buttonMultiply = findViewById<View>(R.id.multiply)
        val buttonDivide = findViewById<View>(R.id.divide)
        val firsNumber = findViewById<EditText>(R.id.firstNum)
        val secondNumber = findViewById<EditText>(R.id.secondNum)

        buttonPlus.setOnClickListener {
            if (firsNumber.text.isNotEmpty() || secondNumber.text.isNotEmpty()) {
                val result =
                    firsNumber.text.toString().toDouble() + secondNumber.text.toString().toDouble()
                intent.putExtra("result", result.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please, enter numbers!", Toast.LENGTH_SHORT).show()
            }
        }

        buttonMinus.setOnClickListener {
            if (firsNumber.text.isNotEmpty() || secondNumber.text.isNotEmpty()) {
                val result =
                    firsNumber.text.toString().toDouble() - secondNumber.text.toString().toDouble()
                intent.putExtra("result", result.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please, enter numbers!", Toast.LENGTH_SHORT).show()
            }

        }

        buttonMultiply.setOnClickListener {
            if (firsNumber.text.isNotEmpty() || secondNumber.text.isNotEmpty()) {
                val result =
                    firsNumber.text.toString().toDouble() * secondNumber.text.toString().toDouble()
                intent.putExtra("result", result.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please, enter numbers!", Toast.LENGTH_SHORT).show()
            }
        }

        buttonDivide.setOnClickListener {
            if (firsNumber.text.isNotEmpty() || secondNumber.text.isNotEmpty()) {
                val result =
                    firsNumber.text.toString().toDouble() / secondNumber.text.toString().toDouble()
                intent.putExtra("result", result.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please, enter numbers!", Toast.LENGTH_SHORT).show()
            }
        }


    }
}