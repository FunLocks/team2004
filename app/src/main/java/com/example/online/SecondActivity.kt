package com.example.online

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.online.R.layout.activity_second)

        val icon = findViewById<ImageView>(com.example.online.R.id.icon)
        val button = findViewById<ImageButton>(com.example.online.R.id.imageButton)
        val button2 = findViewById<ImageButton>(com.example.online.R.id.imageButton2)
        val button3 = findViewById<ImageButton>(com.example.online.R.id.imageButton3)
        val button4 = findViewById<ImageButton>(com.example.online.R.id.imageButton4)
        val button5 = findViewById<ImageButton>(com.example.online.R.id.imageButton5)
        val button6 = findViewById<ImageButton>(com.example.online.R.id.imageButton6)
        val button7 = findViewById<ImageButton>(com.example.online.R.id.imageButton7)
        val button8 = findViewById<ImageButton>(com.example.online.R.id.imageButton8)
        val button9 = findViewById<ImageButton>(com.example.online.R.id.imageButton9)
        val button10 = findViewById<ImageButton>(com.example.online.R.id.imageButton10)
        val txt = findViewById<TextView>(com.example.online.R.id.point)
        val coment = findViewById<TextView>(com.example.online.R.id.coment)


        button.setOnClickListener{
            icon.setImageResource(
                    com.example.online.R.drawable.azarasi)
        }
        button2.setOnClickListener{
            icon.setImageResource(com.example.online.R.drawable.hamburger)
        }
        button3.setOnClickListener{
            icon.setImageResource(com.example.online.R.drawable.kaba)
        }
        button4.setOnClickListener{
            icon.setImageResource(com.example.online.R.drawable.niku)
        }
        button5.setOnClickListener{
            icon.setImageResource(com.example.online.R.drawable.orange)
        }
        button6.setOnClickListener{
            icon.setImageResource(com.example.online.R.drawable.pan)
        }
        button7.setOnClickListener{
            icon.setImageResource(com.example.online.R.drawable.tako)
        }
        button8.setOnClickListener{
            icon.setImageResource(com.example.online.R.drawable.wasi)
        }
        button9.setOnClickListener{
            icon.setImageResource(com.example.online.R.drawable.buta)
        }
        button10.setOnClickListener{
            icon.setImageResource(com.example.online.R.drawable.kabotya)
        }

        //ここからポイント加算
        //countTextViewのインスタンスを取得
        val countTextView = findViewById<TextView>(com.example.online.R.id.point)

        //buttonのインスタンスを取得
        val zoom = findViewById<ImageButton>(com.example.online.R.id.zoombutton)
        val discord = findViewById<ImageButton>(com.example.online.R.id.discord)

        var count: Int = 0
        //Buttonの処理を追記
        zoom.setOnClickListener {
            count=count+5
            countTextView.setText(count.toString())
            if(count>=20){
                txt.setTextColor(Color.rgb(218, 179, 0))
                coment.setText("あなたはもう\nオンラインマスター！")
            }
            //val packageName = "jp.co.yahoo.android.yshopping"
            //val className = "jp.co.yahoo.android.yshopping.YShopMainActivity"
            //intent.setClassName(packageName, className)
            //startActivity(intent)
        }
        discord.setOnClickListener {
            count = count + 5
            countTextView.setText(count.toString())
            if(count>=20){
                txt.setTextColor(Color.rgb(218, 179, 0))
                coment.setText("あなたはもう\nオンラインマスター！")
            }
            //val packageName = "com.discord"
            //val className = "jp.co.yahoo.android.yshopping.YShopMainActivity"
            //intent.setClassName(packageName, className)
            //startActivity(intent)
        }


    }
}