package com.majestadev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "text", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "text2", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)
    }
}