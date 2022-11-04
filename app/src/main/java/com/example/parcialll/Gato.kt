package com.example.parcialll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button

class Gato : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gato)

        val btn: Button = findViewById(R.id.btn_Siguiente2)
        btn.setOnClickListener{

            val intent: Intent = Intent(this, Leon::class.java)
            startActivity(intent)
        }


    }
}