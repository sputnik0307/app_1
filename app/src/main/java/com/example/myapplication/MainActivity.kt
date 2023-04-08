package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRead = findViewById<Button>(R.id.btnRead)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonRead.setOnClickListener{
            //change to read mode
            linearLayout.setBackgroundResource(R.color.yellow)
        }
        buttonDark.setOnClickListener{
            //change to read mode
            linearLayout.setBackgroundResource(R.color.black)
        }
    }
}