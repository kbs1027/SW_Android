package com.example.lab62

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val btn:Button = findViewById(R.id.btn_sub)
        val ev:EditText = findViewById(R.id.ev_sub)
        val res:TextView = findViewById(R.id.res_sub)
        val value = intent.getStringExtra("data")
        res.setText(value)
        btn.setOnClickListener {
            if(ev.text.isEmpty()){
                Toast.makeText(this,"값을 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val data: String = ev.text.toString()
            val resultIntent = Intent(this, MainActivity::class.java)
            resultIntent.putExtra("data", data)
            setResult(Activity.RESULT_OK, resultIntent)
            ev.text=null
            finish()
        }
    }
}