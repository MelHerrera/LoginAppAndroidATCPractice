package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var submitButton:Button
    lateinit var userNameEditText:EditText
    lateinit var passwordEditText:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitButton = findViewById(R.id.submitButton)
        userNameEditText = findViewById(R.id.userNameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)

        submitButton.setOnClickListener {
            val intent = Intent()
            intent.putExtra("UserName", userNameEditText.text.toString())
            intent.putExtra("Password", passwordEditText.text.toString())
            intent.setClassName("com.example.loginapp", "com.example.loginapp.IntentReceiverActivity")
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            startActivity(intent)
        }
    }
}