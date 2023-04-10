package com.example.lab63

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.RawContacts.Data
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.drawToBitmap

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button = findViewById(R.id.btn_main)
        val name:EditText = findViewById(R.id.name)
        val age:EditText = findViewById(R.id.age)
        val num:EditText = findViewById(R.id.num)
        val address:EditText = findViewById(R.id.address)
        val other:EditText = findViewById(R.id.other)
        val image : ImageView = findViewById(R.id.image_main)
        image.isClickable = true
        image.setOnClickListener{
            openGallery()
        }

        btn.setOnClickListener {
            if(name.text.isEmpty()){
                Toast.makeText(this,"값을 입력 해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val data1 : String = name.text.toString()
            val data2 : String = age.text.toString()
            val data3 : String = num.text.toString()
            val data4 : String = address.text.toString()
            val data5 : String = other.text.toString()
            val resize=resizeBitmap(image.drawToBitmap(),300,300)
            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("image",resize)
            intent.putExtra("data1", data1)
            intent.putExtra("data2", data2)
            intent.putExtra("data3", data3)
            intent.putExtra("data4", data4)
            intent.putExtra("data5", data5)
            startActivity(intent)
            name.text = null
            age.text = null
            num.text = null
            address.text = null
            other.text = null
            image.setImageResource(0)
        }
    }

    private fun openGallery() {
        val intent: Intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.setType("image/*")
        startActivityForResult(intent, 1)
    }
    private fun resizeBitmap(bitmap: Bitmap,width:Int,height:Int):Bitmap{
        return Bitmap.createScaledBitmap(bitmap,width,height,false)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                1 -> {
                    val selectedImageUri: Uri? = data?.data
                    if (selectedImageUri != null) {
                        try {
                            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedImageUri)
                            val pt: ImageView = findViewById(R.id.image_main)
                            pt.setImageBitmap(bitmap)
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                }
            }
        }
    }
}