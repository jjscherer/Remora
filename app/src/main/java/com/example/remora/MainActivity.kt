package com.example.remora

import android.graphics.Color
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et = findViewById<EditText>(R.id.plain_text_input)
        val et2 = findViewById<EditText>(R.id.plain_text_input2)
        val loginButton = findViewById<Button>(R.id.button)

        et.setHintTextColor(Color.WHITE)
        et2.setHintTextColor(Color.WHITE)

        loginButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}