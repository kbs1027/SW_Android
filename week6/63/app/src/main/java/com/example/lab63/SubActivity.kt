package com.example.lab63

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.drawToBitmap

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        val btn:Button = findViewById(R.id.btn_sub)
        val viewin:TextView = findViewById(R.id.viewIn)
        val viewnu:TextView = findViewById(R.id.viewNu)
        val viewad:TextView = findViewById(R.id.viewAd)
        val viewot:TextView = findViewById(R.id.viewOt)
        val image: ImageView =findViewById(R.id.image_sub)
        val value1 = intent.getStringExtra("data1")
        val value2 = intent.getStringExtra("data2")
        val value3 = intent.getStringExtra("data3")
        val value4 = intent.getStringExtra("data4")
        val value5 = intent.getStringExtra("data5")
        viewin.setText(value1+"_"+value2)
        viewnu.setText(value3)
        viewad.setText(value4)
        viewot.setText(value5)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
        val bitmap = intent.getParcelableExtra<Bitmap>("image")
        image.setImageBitmap(bitmap)
    }
}