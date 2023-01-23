package com.example.themedallist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Option : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)

        val olymp = intent.getParcelableExtra<Olympian>("opt")

        olymp?.let{
            val vName = findViewById<TextView>(R.id.place)
            vName.text = it.name

            val vMedal = findViewById<TextView>(R.id.amount)
            vMedal.text = it.medals
        }
    }
}