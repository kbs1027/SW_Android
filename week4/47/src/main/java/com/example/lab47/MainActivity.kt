package com.example.lab47

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var img : ImageView
    lateinit var btnLeft : Button
    lateinit var btnRight : Button
    var count : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img = findViewById<ImageView>(R.id.imgView)
        btnLeft = findViewById<Button>(R.id.LEFT)
        btnRight= findViewById<Button>(R.id.RIGHT)
        btnLeft.setOnTouchListener{view, motionEvent->
            count -= 1
            if (count < 0){
                count = 25
            }
            if(count == 0){img.setImageResource(R.drawable.a)}
            if(count == 1){img.setImageResource(R.drawable.b)}
            if(count == 2){img.setImageResource(R.drawable.c)}
            if(count == 3){img.setImageResource(R.drawable.d)}
            if(count == 4){img.setImageResource(R.drawable.e)}
            if(count == 5){img.setImageResource(R.drawable.f)}
            if(count == 6){img.setImageResource(R.drawable.g)}
            if(count == 7){img.setImageResource(R.drawable.h)}
            if(count == 8){img.setImageResource(R.drawable.i)}
            if(count == 9){img.setImageResource(R.drawable.j)}
            if(count == 10){img.setImageResource(R.drawable.k)}
            if(count == 11){img.setImageResource(R.drawable.l)}
            if(count == 12){img.setImageResource(R.drawable.m)}
            if(count == 13){img.setImageResource(R.drawable.n)}
            if(count == 14){img.setImageResource(R.drawable.o)}
            if(count == 15){img.setImageResource(R.drawable.p)}
            if(count == 16){img.setImageResource(R.drawable.q)}
            if(count == 17){img.setImageResource(R.drawable.r)}
            if(count == 18){img.setImageResource(R.drawable.s)}
            if(count == 19){img.setImageResource(R.drawable.t)}
            if(count == 20){img.setImageResource(R.drawable.u)}
            if(count == 21){img.setImageResource(R.drawable.v)}
            if(count == 22){img.setImageResource(R.drawable.w)}
            if(count == 23){img.setImageResource(R.drawable.x)}
            if(count == 24){img.setImageResource(R.drawable.y)}
            if(count == 25){img.setImageResource(R.drawable.z)}
            false
        }
        btnRight.setOnTouchListener{view, motionEvent->
            count+=1
            if (count > 25){
                count = 0
            }
            if(count == 0){img.setImageResource(R.drawable.a)}
            if(count == 1){img.setImageResource(R.drawable.b)}
            if(count == 2){img.setImageResource(R.drawable.c)}
            if(count == 3){img.setImageResource(R.drawable.d)}
            if(count == 4){img.setImageResource(R.drawable.e)}
            if(count == 5){img.setImageResource(R.drawable.f)}
            if(count == 6){img.setImageResource(R.drawable.g)}
            if(count == 7){img.setImageResource(R.drawable.h)}
            if(count == 8){img.setImageResource(R.drawable.i)}
            if(count == 9){img.setImageResource(R.drawable.j)}
            if(count == 10){img.setImageResource(R.drawable.k)}
            if(count == 11){img.setImageResource(R.drawable.l)}
            if(count == 12){img.setImageResource(R.drawable.m)}
            if(count == 13){img.setImageResource(R.drawable.n)}
            if(count == 14){img.setImageResource(R.drawable.o)}
            if(count == 15){img.setImageResource(R.drawable.p)}
            if(count == 16){img.setImageResource(R.drawable.q)}
            if(count == 17){img.setImageResource(R.drawable.r)}
            if(count == 18){img.setImageResource(R.drawable.s)}
            if(count == 19){img.setImageResource(R.drawable.t)}
            if(count == 20){img.setImageResource(R.drawable.u)}
            if(count == 21){img.setImageResource(R.drawable.v)}
            if(count == 22){img.setImageResource(R.drawable.w)}
            if(count == 23){img.setImageResource(R.drawable.x)}
            if(count == 24){img.setImageResource(R.drawable.y)}
            if(count == 25){img.setImageResource(R.drawable.z)}
            false
        }
    }

}