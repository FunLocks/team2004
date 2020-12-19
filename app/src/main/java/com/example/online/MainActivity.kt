package com.example.online

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById(R.id.button) as Button
        button.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java) //インテントの作成
            startActivity(intent)
        }
        lateinit var mp0: MediaPlayer
        mp0= MediaPlayer.create(this,R.raw.bgm)
        mp0.isLooping=true
        mp0.start()

    }

}