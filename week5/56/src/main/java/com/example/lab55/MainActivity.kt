package com.example.lab55

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var editText : EditText
    lateinit var button_0 : Button; lateinit var button_1 : Button
    lateinit var button_2 : Button; lateinit var button_3 : Button
    lateinit var button_4 : Button; lateinit var button_5 : Button
    lateinit var button_6 : Button; lateinit var button_7 : Button
    lateinit var button_8 : Button; lateinit var button_9 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edittext)
        button_0 = findViewById(R.id.button_0)
        button_1 = findViewById(R.id.button_1)
        button_1 = findViewById(R.id.button_2)
        button_1 = findViewById(R.id.button_3)
        button_1 = findViewById(R.id.button_4)
        button_1 = findViewById(R.id.button_5)
        button_1 = findViewById(R.id.button_6)
        button_1 = findViewById(R.id.button_7)
        button_1 = findViewById(R.id.button_8)
        button_1 = findViewById(R.id.button_9)
    }
}