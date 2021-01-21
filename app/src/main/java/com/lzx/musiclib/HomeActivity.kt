package com.lzx.musiclib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.btn1
import kotlinx.android.synthetic.main.activity_home.btn2

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btn1.setOnClickListener { navigationTo<TestActivity>() }
        btn2.setOnClickListener { navigationTo<MainActivity>() }
    }
}