package com.example.digitclassfier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.digitclassfier.draw.DrawActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button drwaBtn = findViewById(R.id.drawBtn);
        drwaBtn.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, DrawActivity.class);
            startActivity(i);
        });
    }
}