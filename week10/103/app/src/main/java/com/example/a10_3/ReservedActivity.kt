package com.example.a10_3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.input1
import kotlinx.android.synthetic.main.activity_main.input2
import kotlinx.android.synthetic.main.activity_main.input3
import kotlinx.android.synthetic.main.activity_main.input4
import kotlinx.android.synthetic.main.activity_main.posterImageView
import kotlinx.android.synthetic.main.activity_reserved.*
import java.io.Serializable

data class ReservedMovie(
    val _id:Int?,
    val name:String?,
    val poster_image:String?,
    val director: String?,
    val synopsis: String?,
    val reserved_time: String?
): Serializable

class ReservedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserved)

        processIntent(intent)
        closebutton.setOnClickListener{
            finish()
        }
    }
    fun processIntent(intent: Intent?){
        val movies = intent?.getSerializableExtra("movies") as ArrayList<ReservedMovie>?
        val movie = movies?.get(0)
        if(movie!=null){
            posterImageView.setImageURI(Uri.parse(movie.poster_image))
            input1.setText(movie.name)
            input2.setText(movie.reserved_time)
            input3.setText(movie.director)
            input4.setText(movie.synopsis)
        }else{
            input1.setText("null")
            input2.setText("null")
            input3.setText("null")
            input4.setText("null")
        }
    }
}
