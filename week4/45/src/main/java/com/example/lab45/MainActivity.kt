package com.example.lab45

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var linLayer: LinearLayout
    lateinit var btn : Button
    var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "직접해보기 1번 문제"
        linLayer = findViewById(R.id.LinLay)
        btn = findViewById(R.id.btn)

        btn.setOnTouchListener { view, motionEvent ->
            count += 1
            if (count%3 == 0){
                linLayer.setBackgroundColor(Color.parseColor("#FF0000"))
            }
            if (count%3 == 1){
                linLayer.setBackgroundColor(Color.parseColor("#00FF00"))
            }
            if (count%3 == 2){
                linLayer.setBackgroundColor(Color.parseColor("#0000FF"))
            }
            false
        }
    }
}