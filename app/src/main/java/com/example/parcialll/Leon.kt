package com.example.parcialll

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button

class Leon : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leon)

        val btn: Button = findViewById(R.id.btn_Siguiente3)
        btn.setOnClickListener{

            val intent: Intent = Intent(this, Tiburon::class.java)
            startActivity(intent)
        }


    }
}