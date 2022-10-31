package com.example.scribble
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val start : Button = findViewById(R.id.startbt)
        start.setOnClickListener {
            val intent = Intent(this, activity_start::class.java)
            startActivity(intent)
        }
    }

}