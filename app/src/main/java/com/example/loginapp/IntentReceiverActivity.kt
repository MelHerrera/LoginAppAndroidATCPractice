package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class IntentReceiverActivity : AppCompatActivity() {
    lateinit var userNameTextView:TextView
    lateinit var passwordTextView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_receiver)

        userNameTextView = findViewById(R.id.userNameTextView)
        passwordTextView = findViewById(R.id.passwordTextView)

        val bundle = intent.extras
        val result1 = bundle?.getString("UserName")
        val result2 = bundle?.getString("Password")

        userNameTextView.text = "Username: $result1"
        passwordTextView.text = "Password: $result2"

        if (result1 != null) {
            Log.d("UserName",result1)
        }
        if (result2 != null) {
            Log.d("Password", result2)
        }
    }
}