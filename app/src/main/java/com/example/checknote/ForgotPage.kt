package com.example.checknote

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgotPage : AppCompatActivity() {

    lateinit var PhoneNumber : EditText
    lateinit var Email : EditText
    lateinit var next:Button
    lateinit var PhoneNo:String
    lateinit var email:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_forgot_page)
        PhoneNumber = findViewById(R.id.mobileNumber)
        Email = findViewById(R.id.email)
        next = findViewById(R.id.next)

        next.setOnClickListener {
            email = Email.text.toString()
            PhoneNo = PhoneNumber.text.toString()
            val i = Intent(this@ForgotPage,MainActivity::class.java)
            i.putExtra("phoneNo",PhoneNo)
            i.putExtra("email",email)
            startActivity(i)

        }
    }

}
