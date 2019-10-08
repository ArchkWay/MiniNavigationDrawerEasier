package com.example.myapplicationminidrawer

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main_margin_left.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener{
            if(slidingPanel.isOpen)
            slidingPanel.closePane()
            else slidingPanel.openPane()
        }
    }


}