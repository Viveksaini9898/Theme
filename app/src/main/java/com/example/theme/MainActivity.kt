package com.example.theme

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        val animDrawable = activity.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(100)
        animDrawable.start()
        val aniDrawable = button.background as AnimationDrawable
        aniDrawable.setEnterFadeDuration(10)
        aniDrawable.setExitFadeDuration(4000)
        aniDrawable.start()

        val button=findViewById<Button>(R.id.button)
            button.setOnClickListener {
                val i =Intent(this,MainActivity1::class.java)
                startActivity(i)
            }

        val button1=findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val i =Intent(this,MainActivity2::class.java)
            startActivity(i)
        }

        val button2=findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val i =Intent(this,MainActivity3::class.java)
            startActivity(i)
        }

        val button3=findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val i =Intent(this,MainActivity4::class.java)
            startActivity(i)
        }

        val button4=findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val i =Intent(this,MainActivity5::class.java)
            startActivity(i)
        }

    }
}