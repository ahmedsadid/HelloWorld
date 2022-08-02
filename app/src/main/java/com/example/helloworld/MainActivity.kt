package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.woofButton)
        button.setOnClickListener {
            Log.v("Woof", "Button clicked!")
            Toast.makeText(this, "Woof! Woof!", Toast.LENGTH_SHORT).show()
        }

    }
}