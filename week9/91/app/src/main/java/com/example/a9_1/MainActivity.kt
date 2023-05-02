package com.example.a9_1

import android.media.audiofx.DynamicsProcessing.Channel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a9_1.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.consumeEach
import java.util.zip.Inflater
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.activityMain)

        val channel = kotlinx.coroutines.channels.Channel<Int> ()
        val backgroundScope = CoroutineScope(Dispatchers.Default + Job())
        backgroundScope.launch {
            var sum = 0L

            for (i in 1..2_000_000_000) {
                sum+= i
                channel.send(sum.toInt())
            }
        }
        var mainScope = GlobalScope.launch (Dispatchers.Main) {
            channel.consumeEach {
                binding.resultView.text = "sum : $it"
            }
        }
    }
}