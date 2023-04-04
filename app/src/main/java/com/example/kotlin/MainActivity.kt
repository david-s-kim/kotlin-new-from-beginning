package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // SAM
        // Single Abstract Method
        // 함수형 인터페이스를 인자로 받는 자바함수를 람다로 식을 대신넘길 수 있다.
        val view = View(this)

        // 같은코드임
        view.setOnClickListener({ println("HI") })
        view.setOnClickListener { println("HI") }
    }
}