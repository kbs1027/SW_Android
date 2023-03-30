package com.example.lab44

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var edit1: EditText; lateinit var edit2 : EditText
    lateinit var btnAdd : Button; lateinit var btnSub : Button
    lateinit var btnMul : Button; lateinit var btnDiv : Button
    lateinit var btnRem : Button; lateinit var btnCha : Button
    lateinit var textResult: TextView
    lateinit var num1 : String; lateinit var num2 : String
    var num : Int = 0
    var result : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = num.toString() + "회 계산기"

        edit1 = findViewById(R.id.Edit1)
        edit2 = findViewById(R.id.Edit2)

        btnAdd = findViewById(R.id.BtnAdd)
        btnSub = findViewById(R.id.BtnSub)
        btnMul = findViewById(R.id.BtnMul)
        btnDiv = findViewById(R.id.BtnDiv)
        btnRem = findViewById(R.id.BtnRem)
        btnCha = findViewById(R.id.BtnCha)
        textResult = findViewById(R.id.TextResult)

        btnAdd.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) + Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            num++
            title = num.toString() + "회 계산기"
            edit1.setText(result.toString())
            edit2.setText("")
        }
        btnSub.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) - Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            num++
            title = num.toString() + "회 계산기"
            edit1.setText(result.toString())
            edit2.setText("")
        }
        btnMul.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) * Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            num++
            title = num.toString() + "회 계산기"
            edit1.setText(result.toString())
            edit2.setText("")
        }
        btnDiv.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) / Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            num++
            title = num.toString() + "회 계산기"
            edit1.setText(result.toString())
            edit2.setText("")
        }
        btnRem.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) % Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            num++
            title = num.toString() + "회 계산기"
            edit1.setText(result.toString())
            edit2.setText("")
        }
        btnCha.setOnClickListener {
            val temp = edit1.text.toString()
            edit1.setText(edit2.text.toString())
            edit2.setText(temp)
        }
    }
}