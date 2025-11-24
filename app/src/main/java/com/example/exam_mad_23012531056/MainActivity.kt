package com.example.exam_mad_23012531056

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val guniMapButton = findViewById<Button>(R.id.button_guni_map)
        val animationButton = findViewById<Button>(R.id.button_animation)
        val textButton = findViewById<Button>(R.id.button_text)

        guniMapButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:23.2156,72.6822?q=Ganpat University"))
            startActivity(intent)
        }

        animationButton.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.tween_animation)
            imageView.startAnimation(animation)
        }

        textButton.setOnClickListener {
            textView.text = "HOW ARE YOU?"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}