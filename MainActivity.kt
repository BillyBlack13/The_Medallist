package com.example.themedallist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<RecyclerView>(R.id.medal)

        list.adapter = OlympianAdapter()
        list.layoutManager = LinearLayoutManager(this)

        val opt = "$list"
        val saved = findViewById<ImageButton>(R.id.imageButton)

        saved.setOnClickListener{
            val intent = Intent(this, Option::class.java)
            intent.putExtra("opt", opt)
            startActivity(intent)
            
        }
    }

    /*override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.svdata -> {
                svData()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }*/
}