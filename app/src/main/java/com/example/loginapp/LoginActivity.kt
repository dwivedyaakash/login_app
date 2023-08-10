package com.example.loginapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonLoginSubmit = findViewById<Button>(R.id.loginSubmitBtn)
        buttonLoginSubmit.setOnClickListener {
            Toast.makeText(applicationContext, "Submitted", Toast.LENGTH_LONG).show()
        }
    }
}